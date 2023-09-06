package PJBL_1;

public class FloodFillFila {
    private int[][] image;
    private int valor;
    private Fila<Integer>fila;
    private int linhaInicial;
    private int colunaInicial;

    
//recebe a matriz, as coordenadas do ponto inicial e o valor a ser preenchido como parâmetros no construtor
    public FloodFillFila(int[][] image, int linhaInicial, int colunaInicial, int valor) {
        this.image = image;
        this.linhaInicial = linhaInicial;
        this.colunaInicial = colunaInicial;
        this.valor = valor;
        fila = new Fila<Integer>(10);
        fila.enfileirar(linhaInicial * image[0].length + colunaInicial); // Transforma as coordenadas em um único índice.
    }
    
    public void executar() { //inunda a matriz 
        int linhas = image.length;
        int colunas = image[0].length;
        int corOriginal = image[linhaInicial][colunaInicial];
        if (corOriginal == valor) return;

        int[][] direcao = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!fila.isEmpty()) {
            int atual = fila.desenfileirar();
            int linha = atual / colunas;
            int coluna = atual % colunas;

            image[linha][coluna] = valor;

            for (int[] dir : direcao) {
                int linhaNova = linha + dir[0];
                int colunaNova = coluna + dir[1];
                if (linhaNova >= 0 && linhaNova < linhas && colunaNova >= 0 && colunaNova < colunas &&
                    image[linhaNova][colunaNova] == corOriginal) {
                    fila.enfileirar(linhaNova * colunas + colunaNova); //// Transforma as coordenadas em um único índice.
                }
                }
            }
        }
    }

