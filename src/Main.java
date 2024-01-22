import java.util.Scanner;
// Bomber's Hideout In Java
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // setting up new passcode
        System.out.println("What is the passcode?:");
        String passcode = scan.nextLine();
        label:
        while (true) {
            // the menu
            System.out.println("[enter], [change] passcode, [quit] ");
            String input = scan.nextLine();
            switch (input.toLowerCase()) {
                case "enter": {
                    System.out.println("What is the passcode?:");
                    String response = scan.nextLine();
                    if (response.toLowerCase().equals(passcode)) {
                        System.out.println("You can enter.");
                    } else {
                        System.out.println("Wrong passcode.");
                    }
                    break;
                }
                case "change": {
                    System.out.println("What is the passcode?:");
                    String response = scan.nextLine();
                    if (response.toLowerCase().equals(passcode)) {
                        System.out.println("What should the new password be?");
                        String newPasscode = scan.nextLine();
                        passcode = newPasscode;
                    } else {
                        System.out.println("Wrong passcode.");
                    }
                    break;
                }
                case "quit":
                    scan.close();
                    break label;
                default:
                    continue;
            }
        }
    }
}