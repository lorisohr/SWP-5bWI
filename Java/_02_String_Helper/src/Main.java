import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Auswahl = 0;
        String input = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie einen String ein: ");
        input = scanner.nextLine();
        StringHelper myStringHelper = new StringHelper();
        myStringHelper.setString(input);
        boolean Beenden = false;
        do {
            System.out.println("1: Palindrom\n2: String rückwärts ausgeben\n3: Anzahl der einzeln vorkommenden Buchstaben\n4: String ändern\n5: Beenden");
            Auswahl = Integer.parseInt(scanner.nextLine());

            switch (Auswahl) {
                case 1:
                    if (myStringHelper.isPalindrome()) {
                        System.out.println("Der String '" + myStringHelper.getString() + "' ist ein Palindrom");
                    } else {
                        System.out.println("Der String '" + myStringHelper.getString() + "' ist kein Palindrom");
                    }
                    break;
                case 2:
                    System.out.println("Der String '" + myStringHelper.getString() + "' ist rückwärts '" + myStringHelper.reverseString() + "'");
                    break;
                case 3:
                    System.out.println(myStringHelper.printAmountOfLetter());
                    break;
                case 4:
                    System.out.println("Neuer String: ");
                    input = scanner.nextLine();
                    myStringHelper.setString(input);
                    break;
                case 5:
                    Beenden = true;
                    break;
                default:
                    System.out.println("Bitte eine gültige Zahl eingeben.");
                    break;
            }
        } while (!Beenden);
    }
}

