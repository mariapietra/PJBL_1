package PJBL_1;

//limite da matriz (Index Out Of Bounds)
/** documentação */
public static void main(String[] args) { //MATRIZ 10X10
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
                         {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}};


        int x = 5; // coordenada x do ponto inicial
        int y = 5; // coordenada y do ponto inicial
        int valor = 2; // valor a ser preenchido

        FloodFillPilha floodFillPilha = new FloodFillPilha(matriz, x, y, valor); //chamada do método executar
        floodFillPilha.executar();

        FloodFillFila floodFillFila = new FloodFillFila(matriz, x, y, valor); //chamada do método executar
        floodFillFila.executar();
        }
}
