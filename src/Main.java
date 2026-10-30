void main() {
    Scanner sc = new Scanner(System.in);

        System.out.println("Introdueix el numero de filas:");
        int n = sc.nextInt();

        System.out.println("Introdueix el numero de columnes:");
        int m = sc.nextInt();

        int[][] matriu = new int[n][m];
        int[] suma = new int[m];


        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.println("Introdueix un número:");
                matriu[i][j] = sc.nextInt();
            }
        }


        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                suma[j] = suma[j] + matriu[i][j];
            }
        }



        System.out.println("Matriu:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();

            System.out.println("Suma de les columnes:");
            for (int j = 0; j < m; j++) {
                System.out.print(suma[j] + " ");
            }
        }
}


