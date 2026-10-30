void main() {

        Scanner sc = new Scanner(System.in);

        float[][] notas = new float[10][6];


        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1));

            for (int j = 0; j < 3; j++) {
                System.out.println("Introduce la nota " + (j + 1) + ":");
                notas[i][j] = sc.nextFloat();
            }
        }

        for (int i = 0; i < notas.length; i++) {

            float suma = 0;
            float max = notas[i][0];
            float min = notas[i][0];

            for (int j = 0; j < 3; j++) {
                suma = suma + notas[i][j];

                if (notas[i][j] > max) {
                    max = notas[i][j];
                }

                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
            }

            notas[i][3] = suma / 3;
            notas[i][4] = max;
            notas[i][5] = min;
        }

        System.out.println("Notes alumnes");

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        float mejor = notas[0][0];
        float peor = notas[0][0];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < 3; j++) {

                if (notas[i][j] > mejor) {
                    mejor = notas[i][j];
                }

                if (notas[i][j] < peor) {
                    peor = notas[i][j];
                }
            }
        }

        System.out.println("Millor nota del curs: " + mejor);
        System.out.println("Pitjor nota del curs: " + peor);
    }

