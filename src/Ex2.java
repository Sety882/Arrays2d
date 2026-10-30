void main() {
            Scanner input = new Scanner(System.in);

            System.out.println("Introduce el numero de filas:");
            int n = input.nextInt();

            System.out.println("Introduce el numero de columnas:");
            int m = input.nextInt();

            int[][] matriz = new int[n][m];
            int[][] resultados = new int[3][m];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.println("Introduce un numero:");
                    matriz[i][j] = input.nextInt();
                }
            }


            for (int j = 0; j < m; j++) {
                resultados[0][j] = 0;
                resultados[1][j] = matriz[0][j];
                resultados[2][j] = matriz[0][j];

                for (int i = 0; i < n; i++) {
                    resultados[0][j] = resultados[0][j] + matriz[i][j];

                    if (matriz[i][j] > resultados[1][j]) {
                        resultados[1][j] = matriz[i][j];
                    }

                    if (matriz[i][j] < resultados[2][j]) {
                        resultados[2][j] = matriz[i][j];
                    }
                }
            }


            System.out.println("Matriz original:");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }


            System.out.println("Matriz de resultados:");
            for (int i = 0; i < resultados.length; i++) {
                for (int j = 0; j < resultados[i].length; j++) {
                    System.out.print(resultados[i][j] + " ");
                }
                System.out.println();
            }
        }

