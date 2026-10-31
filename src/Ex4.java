void main() {

    char[][] matriu = new char[5][5];

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            if (i == j || i + j == 4) {
                matriu[i][j] = 'X';
            } else {
                matriu[i][j] = ' ';
            }
        }
    }

    for (int i = 0; i < matriu.length; i++) {
        for (int j = 0; j < matriu[i].length; j++) {
            System.out.print(matriu[i][j] + " ");
        }
        System.out.println();
    }
}
