package PJBL_1;

public class Pilha<T> {
    private int tamanhoMaximo;
    private int topo;
    private int[][] elementos;

    public Pilha(int tamanho) { //construtor da pilha, recebe o tamanho máximo da pilha 
        tamanhoMaximo = tamanho;
        topo = -1;
        elementos = new int[tamanhoMaximo][tamanhoMaximo];
    }

    public void empilhar(int[] posicao) { //adiciona ao topo da pilha 
        if (topo < tamanhoMaximo - 1) {
            topo++;
            elementos[topo] = posicao;
        } else {
            System.out.println("Preencheu");
        }
    }

    public int[] desempilhar() { //remove do topo da pilha 
        if (topo >= 0) {
            int[] elemento = elementos[topo];
            topo--;
            return elemento;
        } else {
            System.out.println("Não preencheu");
            return new int[]{0, 0};
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }
}