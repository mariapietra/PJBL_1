package PJBL_1;

public class Fila{
    private int tamanhoMaximo;
    private int inicio;
    private int fim;
    private int[] elementos;

    public Fila(int tamanho) { //construtor da fila 
        tamanhoMaximo = tamanho;
        inicio = 0;
        fim = -1;
        elementos = new int[tamanhoMaximo];
    }

    public void enqueue(int elemento) { //adiciona um elemento ao final da fila, verificando se a fila está cheia
        if (fim < tamanhoMaximo - 1) {
            fim++;
            elementos[fim] = elemento;
        } else {
            System.out.println("A fila está cheia!");
        }
    }

    public int dequeue() { // remove o elemento do início da fila, verificando se a fila está vazia
        if (inicio <= fim) {
            int elemento = elementos[inicio];
            inicio++;
            return elemento;
        } else {
            System.out.println("A fila está vazia!");
            return -1;
        }
    }

    public boolean isEmpty() { // verifica se está vazia 
        return inicio > fim;
    }

    public int size() {
        return fim - inicio + 1;
    }
}

