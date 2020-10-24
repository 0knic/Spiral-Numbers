import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int[][] array = new int[row][row];
        int n = 1;
        for (int i = 0; i < row; i++) {
            array[0][i] = n;
            n += 1;
        }
        int counter = 0;
        int counter2 = -1;
        int counter3 = 0;
        int counter4 = 0;
        for (int b = row; b > 0; b--) {
            counter += 1;
            counter2 += 1;
            counter3 += 2;
            counter4 += 2;
            int i = row;
            //down
            for (int j = counter; j < (i - counter2); j++) {
                array[j][i - counter] = n;
                n += 1;
            }
            //left
            n += i - counter3;
            int n1 = n;
            for (int j = counter - 1; j < i - counter2; j++) {
                array[i - counter][j] = n;
                n -= 1;
            }
            //up
            n1 += i - counter3;
            int n2 = n1;
            for (int j = counter; j < (i - counter2); j++) {
                array[j][counter2] = n1;
                n1 -= 1;
            }
            //right
            n2 += i - (counter3 + (i - (counter4 + 1)));
            for (int j = counter; j < (i - (counter2 + 1)); j++) {
                array[counter2 + 1][j] = n2;
                n2 += 1;
            }
            n = n2;
        }

        for (int y = 0; y < row; y++) {
            for (int z = 0; z < row; z++) {
                System.out.print(array[y][z] + " ");
            }
            System.out.println(" ");
        }

    }
}
