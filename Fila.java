package PJBL_1;

public class Fila<T>{
    private int tamanhoMaximo; //capacidade
    private int inicio;
    private int fim;
    private int[] elementos;
    private int tamanho; //adicionado

    public Fila(int tamanho) { //construtor da fila 
        tamanhoMaximo = tamanho;
        inicio = 0;
        fim = -1;
        elementos = new int[tamanhoMaximo];
    }

    public void enfileirar(int elemento) {
        if (tamanho == elementos.length) {
            throw new RuntimeException("Fila cheia");
        }
        elementos[++fim] = elemento;
        tamanho++;
    }

    public int desenfileirar() { // remove o elemento do início da fila, verificando se a fila está vazia
        if (inicio <= fim) {
            int elemento = elementos[inicio++];
            tamanho--;
            return elemento;
        } else {
            System.out.println("A fila está vazia!");
            return -1;
        }
    }

    public boolean isEmpty() { // verifica se está vazia 
        return inicio > fim;
    }

    public int tamanho() {
        return tamanho;
    }
}

