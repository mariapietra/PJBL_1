package PJBL_1;

public class FloodFillPilha{
    private int[][] image;
    private int linhaInicial;
    private int colunaInicial;
    private int valor;
    private Pilha<int[]> pilha;

    // Recebe a matriz, as coordenadas do ponto inicial e o valor a ser preenchido como parâmetros no construtor
    public FloodFillPilha(int[][] image, int linhaInicial, int colunaInicial, int valor) {
        this.image = image;
        this.linhaInicial = linhaInicial;
        this.colunaInicial = colunaInicial;
        this.valor = valor;
        pilha = new Pilha<int[]>(10);
        pilha.empilhar(new int[]{linhaInicial, colunaInicial});
    }

    public void executar() { // inunda a matriz
        int linhas = image.length;
        int colunas = image[0].length;
        int corOriginal = image[linhaInicial][colunaInicial];
        if (corOriginal == valor) return;

        int[][] direcao = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!pilha.isEmpty()) {
            int[] atual = pilha.desempilhar();
            int linha = atual[0];
            int coluna = atual[1];

            image[linha][coluna] = valor;

            for (int[] dir : direcao) {
                int linhaNova = linha + dir[0];
                int colunaNova = coluna + dir[1];
                if (linhaNova >= 0 && linhaNova < linhas && colunaNova >= 0 && colunaNova < colunas &&
                    image[linhaNova][colunaNova] == corOriginal) {
                    pilha.empilhar(new int[]{linhaNova, colunaNova}); // Empilhe um array de int[].
                }
            }
        }
    }
}
