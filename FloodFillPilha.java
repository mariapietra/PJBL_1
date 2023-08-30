package PJBL_1;


public class FloodFillPilha { 
    private int[][] matriz;
    private int x;
    private int y;
    private int valor;
    private Pilha pilha;

//recebe a matriz, as coordenadas do ponto inicial e o valor a ser preenchido como parâmetros no construtor
    public FloodFillPilha(int[][] matriz, int x, int y, int valor) { 
        this.matriz = matriz;
        this.x = x;
        this.y = y;
        this.valor = valor;
        pilha = new Pilha(100);
        pilha.push(x * 10 + y);
    }

    public void executar() { //inunda a matriz 
        while (!pilha.isEmpty()) {
            int ponto = pilha.pop(); 
            int i = ponto / 10;
            int j = ponto % 10;
            if (matriz[i][j] == 0) {
                matriz[i][j] = valor;
                if (i > 0) pilha.push((i-1) * 10 + j); // ponto acima
                if (i < 9) pilha.push((i+1) * 10 + j); // ponto abaixo
                if (j > 0) pilha.push(i * 10 + (j-1)); // ponto à esquerda
                if (j < 9) pilha.push(i * 10 + (j+1)); // ponto à direita
            }
        }
    }
}

