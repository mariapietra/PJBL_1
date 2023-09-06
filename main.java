package PJBL_1;

public class Main {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };

        System.out.println("Imagem original:");
        for (int[] linha : image) {
            for (int pixel : linha) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }

        int linhaInicial = 0;
        int colunaInicial = 0;
        int valor = 2;

        FloodFillPilha floodFillPilha = new FloodFillPilha(image, linhaInicial, colunaInicial, valor);
        floodFillPilha.executar();

        FloodFillFila floodFillFila = new FloodFillFila(image, linhaInicial, colunaInicial, valor);
        floodFillFila.executar();
        }
}