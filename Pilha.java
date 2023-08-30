package PJBL_1;

public class Pilha {
    private int tamanhoMaximo;
    private int topo;
    private int[] elementos;

    public Pilha(int tamanho) { //construtor da pilha, recebe o tamanho máximo da pilha 
        tamanhoMaximo = tamanho;
        topo = -1;
        elementos = new int[tamanhoMaximo];
    }

    public void push(int elemento) { //adiciona ao topo da pilha 
        if (topo < tamanhoMaximo - 1) {
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.println("Preencheu");
        }
    }

    public int pop() { //remove do topo da pilha 
        if (topo >= 0) {
            int elemento = elementos[topo];
            topo--;
            return elemento;
        } else {
            System.out.println("Não preencheu");
            return -1;
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }
}