package PJBL_1;

public class FloodFillFila {
    private int[][] matriz;
    private int valor;
    private Fila fila;
    
//recebe a matriz, as coordenadas do ponto inicial e o valor a ser preenchido como parâmetros no construtor
    public FloodFillFila(int[][] matriz, int x, int y, int valor) {
        this.matriz = matriz;
        this.x = x;
        this.y = y;
        this.valor = valor;
        fila = new Fila(10);
        fila.enqueue(x * 10 + y);
    }

    public void executar() { //inunda a matriz 
        while (!fila.isEmpty()) {
            int ponto = fila.dequeue();
            int i = ponto / 10;
            int j = ponto % 10; //RETORNA RESTO
            if (matriz[i][j] == 0) {
                matriz[i][j] = valor;
                if (i > 0) fila.enqueue((i-1) * 10 + j); // ponto acima
                if (i < 9) fila.enqueue((i+1) * 10 + j); // ponto abaixo
                if (j > 0) fila.enqueue(i * 10 + (j-1)); // ponto à esquerda
                if (j < 9) fila.enqueue(i * 10 + (j+1)); // ponto à direita
            }
        }
    }
}
