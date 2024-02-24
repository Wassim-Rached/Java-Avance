package ex2.p1;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        int choice = -1;

        Pile<String> pile = new Pile<String>();

        do {
            Test.printMenu();
            choice = Test.getChoice();
            switch (choice) {
                case 1:
                    Test.empiler(pile);
                    break;
                case 2:
                    Test.depiler(pile);
                    break;
                case 3:
                    Test.afficher(pile);
                    break;
                case 4:
                    Test.vider(pile);
                    break;
                case 5:
                    Test.quitter();
                    break;
                default:
                    System.out.println("Choix invalide!");
            }
        } while (choice != 5);
        }


    public static void printMenu() {
            System.out.println("===== Menu =====");
            System.out.println("1. Empiler");
            System.out.println("2. Depiler");
            System.out.println("3. Afficher");
            System.out.println("4. Vider");
            System.out.println("5. Quitter");
            System.out.println("================");
        }

        public static int getChoice() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("==> ");
            return scanner.nextInt();
        }

        private static void empiler(Pile<String> pile) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un élément à empiler: ");
            pile.empiler(scanner.nextLine());
        }

        private static void depiler(Pile<?> pile) {
            pile.depiler();
        }

        private static void afficher(Pile<?> p) {
            p.afficher();
        }

        private static void vider(Pile<?> p) {
            p.vider();
        }

        private static void quitter() {
            System.out.println("Au revoir!");
        }

}
