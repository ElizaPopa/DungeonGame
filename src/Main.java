import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// Scrieti un program care afiseaza “Imi place Java”
        System.out.println("Imi place Java.");
// Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
        String curs = "Cursul acesta este foarte fain\n";
        System.out.println(curs.repeat(6));
// Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
        int Ana = 24;
        int David = Ana - 6;
        System.out.println("David are " + David + " ani.");
// Scrieti un program in care cititi o propozitie de la tastatura
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti orice propozitie: ");
        String propozitie = scanner.nextLine();
        System.out.println("Propozitia introdusa este :" + propozitie);
/* Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un
String si un boolean, apoi apelati metoda din metoda “main” */
        myVariables("5 este mai mare decat ", 3, true);
/* Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura,
   le stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran */
        metodaNumerelor();
/* Scrieti un program in care cititi de la tastatura un numar, si calculati:
        - rezultatul sumei cu 5
        - rezultatul scaderii cu 12.3
        - rezultatul inmultirii cu -3.2
        - rezultatul impartirii cu 4
        - rezultatul modulului cu 6 */
        System.out.println("Introduceti un numar:");
        int numar = scanner.nextInt();
        System.out.println("Rezultatul sumei este: " + (numar + 5));
        System.out.println("Rezultatul scaderii este: " + (numar - 12.3));
        System.out.println("Rezultatul inmultirii este: " + (numar * -3.2));
        System.out.println("Rezultatul impartirii este: " + (numar / 4));
        System.out.println("Rezultatul modulului este: " + (numar % 6));
        Solution();
    }

    public static void myVariables(String text, int a, boolean aboutJava) {
        System.out.println(text + a);
        System.out.println(aboutJava);
    }

    public static void metodaNumerelor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int numar1 = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int numar2 = scanner.nextInt();
        System.out.println("Numerele introduse sunt: " + numar1 + " si " + numar2);
    }

// Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2
    public static void Solution() {
        int x = 2;
        int y = 12;
        // y = x * y;
        y = x + y;
        x = y - x;
        y = y - x;
        System.out.println(x);
        System.out.println(y);
    }
}