import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = -1;

        Scanner scanner = new Scanner(System.in);


        while (choice != 0) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 1; j <= i; j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j < 50; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }

    }
}
