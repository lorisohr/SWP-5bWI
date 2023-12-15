import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int Bankomat = 0;
        int Betrag = 0;
        int Auswahl = 0;
        boolean Beenden = false;

        do {
            System.out.println("Was wollen Sie machen: \n");
            System.out.println("1: Einzahlen\n2: Abheben\n3: Kontostand\n4: Beenden");
            Auswahl = Integer.parseInt(myObj.nextLine());
            switch (Auswahl) {
                case 1:
                    System.out.println("Wie viel Geld wollen Sie einzahlen?");
                    Betrag = Integer.parseInt(myObj.nextLine());
                    Bankomat = einzahlen(Bankomat, Betrag);
                    break;
                case 2:
                    System.out.println("Wie viel Geld wollen Sie abheben?");
                    Betrag = Integer.parseInt(myObj.nextLine());
                    Bankomat = abheben(Bankomat, Betrag);
                    break;
                case 3:
                    System.out.println("Aktueller Kontostand: " + Bankomat);
                    break;
                case 4:
                    Beenden = true;
                    break;
                default:
                    System.out.println("Bitte wählen Sie eine Gültige Auswahlmöglichkeit an.");
                    break;
            }
            myObj.nextLine();
        } while (!Beenden);
    }

    public static int abheben(int Kontostand, int Betrag) {
        if(Kontostand >= Betrag) {
            Kontostand = Kontostand - Betrag;
        }
        else {
            System.out.println("Guthaben zu niedrig");
        }
        return Kontostand;
    }

    public static int einzahlen(int Kontostand, int Betrag) {
        Kontostand = Kontostand + Betrag;
        return Kontostand;
    }
}