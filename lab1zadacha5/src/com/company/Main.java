package com.company;
public class Main {

    public static void main(String[] args) {
        String[][] message = {{"ч","с","к","ц"},
                {"ы","с","ч","м"},
                {"у","ш","щ","н"},
                {"к","а","в","п"}};
        int[][] lattice ={{0,1,0,1},{0,0,0,1},{0,1,1,1},{1,0,0,0}};

        System.out.println ("Inserted array elements:");
        for(int i = 0; i < message.length; i++) {
            for (int j = 0; j < message.length; j++) {
                System.out.print (" " + lattice[i][j]); // Заполняем массив элементами, введёнными с клавиатуры
            }
            System.out.println();
        }

//        int[][] lattice = new int [message.length][message.length];
//        Scanner in = new Scanner(System.in);
//
//        System.out.println("Insert array elements:");
//        for(int i = 0; i < message.length; i++) {
//            for (int j = 0; j < message.length; j++) {
//                lattice[i][j] = in.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
//            }
//        }
//        System.out.println ("Inserted array elements:");
//        for(int i = 0; i < message.length; i++) {
//            for (int j = 0; j < message.length; j++) {
//                System.out.print (" " + lattice[i][j]); // Заполняем массив элементами, введёнными с клавиатуры
//            }
//            System.out.println();
//        }

        System.out.println("0:");
        for(int i = 0; i < message.length; i++) {
            for (int j = 0; j < message.length; j++) {
                if (lattice[i][j] == 1) {
                    System.out.print(" " + message[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("90:");
        for(int i = 0; i < message.length; i++) {
            for (int j = 0; j < message.length; j++) {
                if (lattice[message.length-j-1][i] == 1) {
                    System.out.print(" " + message[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("180:");
        for(int i = 0; i < message.length; i++) {
            for (int j = 0; j < message.length; j++) {
                if (lattice[message.length-i-1][message.length-j-1] == 1) {
                    System.out.print(" " + message[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("270:");
        for(int i = 0; i < message.length; i++) {
            for (int j = 0; j < message.length; j++) {
                if (lattice[j][message.length-i-1] == 1) {
                    System.out.print(" " + message[i][j]);
                }
            }
        }
    }
}
