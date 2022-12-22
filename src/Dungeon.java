import java.util.Random;
import java.util.Scanner;

public class Dungeon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
// variabile jucator
        int sanatate = 100;
        int atacDeteriorare = 50;
        int potiuni = 3;
        int valoareRegenerarePotiuni = 30;
        int sansaPotiune = 50; // procentaj
// variabile inamic
        String[] inamici = {"Zombie", "Skeleton", "Warrior", "Assasin"};
        int maxSanatateInamic = 75;
        int inamicAtacDeteriorare = 25;
        boolean running = true;
        System.out.println("\t Welcome to Dungeon!");

        GAME:
        while (running) {
            System.out.println("------------------------------------------------");
            int sanatateInamic = random.nextInt(maxSanatateInamic);
            String inamic = inamici[random.nextInt(inamici.length)];
            System.out.println("\t* " + inamic + " a aparut! *");
            while (sanatateInamic > 0) {
                System.out.println("\t Sanatatea ta este: " + sanatate);
                System.out.println("Sanatatea inamicului " + inamic + " este: " + sanatateInamic);
                System.out.println("\t\n Ce ai vrea sa faci?");
                System.out.println("\t 1. Ataca");
                System.out.println("\t 2. Bea potiune");
                System.out.println("\t 3. Fugi");
                String input = scanner.nextLine();
                if (input.equals("1")) {
// cod pentru optiunea de a ataca
                    int deteriorareProdusa = random.nextInt(atacDeteriorare);
                    int deteriorarePrimita = random.nextInt(inamicAtacDeteriorare);
                    sanatate -= deteriorarePrimita;
                    sanatateInamic -= deteriorareProdusa;
                    System.out.println("\t L-ai lovit pe: " + inamic + " cu " + deteriorareProdusa + " deterioare");
                    System.out.println("\t Tu ai primit: " + deteriorarePrimita + " deterioare");
                    if (sanatate < 1) {
                        System.out.println("\t Ai fost lovit prea tare. Esti prea slabit ca sa mai poti continua.");
                        break;
                    }
                } else if (input.equals("2")) {
// cod pentru optiunea de a bea potiune
                    if (potiuni > 0) {
                        sanatate += valoareRegenerarePotiuni;
                        potiuni--;
                        System.out.println("\t Ai baut o potiune, te-ai vindecat cu " + valoareRegenerarePotiuni +
                                "\t\n Acum ai " + sanatate + " sanatate." +
                                "\t\n Ti-au ramas " + potiuni + " potiuni");
                    } else {
                        System.out.println("\t Nu mai ai potiuni. Invinge un inamic pentru sansa de a castiga alte potiuni");
                    }
                } else if (input.equals("3")) {
// cod pentru optiunea de a fugi
                    System.out.println("\t Ai fugit de " + inamic);
                    continue GAME;
                } else {
// cod pentru o optiune invalida
                    System.out.println("\t Comanda invalida!");
                }
            }
            if (sanatate < 1) {
                System.out.println("Te-au batut prea rau sa mai poti continua. Dungeon s-a terminat pentru tine!");
                break;
            }
            System.out.println("------------------------------------------------");
            System.out.println("\t * " + inamic + " a fost invins! *");
            System.out.println("\t * " + "Mai ai " + sanatate + " sanatate. *");
            if (random.nextInt(100) < sansaPotiune) {
                potiuni++;
                System.out.println("\t * Ai castigat o potiune in urma infrangerii lui " + inamic + "! * ");
                System.out.println("\t * Mai ai " + potiuni + " potiuni. * ");
            }
            System.out.println("Ce ai vrea sa faci in continuare?");
            System.out.println("\t 1. Continui lupta");
            System.out.println("\t 2. Termina jocul");
            String input = scanner.nextLine();
            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Comanda invalida");
                input = scanner.nextLine();
            }
            switch (input) {
                case "1": {
                    System.out.println("Aventura continua!");
                    break;
                }
                case "2": {
                    System.out.println("\n Ai ales sa iesi din temnita. Drum bun!");
                    break GAME;
                }
            }
        }
        System.out.println(" ---------------------------- ");
        System.out.println(" * Multumim pentru participare. Te mai asteptam! * ");
        System.out.println(" ---------------------------- ");
    }
}
