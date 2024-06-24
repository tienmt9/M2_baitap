import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Search Contact");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Contact ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Contact Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Contact Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter Contact Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Contact Address: ");
                    String address = scanner.nextLine();
                    ContactManagement.addNewContacts(id, name, phone, email, address);
                    break;
                case 2:
                    System.out.print("Enter Contact ID: ");
                    String id1 = scanner.nextLine();
                    ContactManagement.editExistingContact(id1);
                case 3:
                    System.out.print("Enter Contact ID: ");
                    String id2 = scanner.nextLine();
                    ContactManagement.removeExistingContact(id2);
                    break;
                case 4:
                    ContactManagement.showOurContacts();
                    break;
                case 5:
                    System.out.print("Enter Contact ID: ");
                    String id3 = scanner.nextLine();
                    ContactManagement.searchExistingContact(id3);
                    return;
                default:
                    System.out.println("Thanks for using.");
            }
        }
    }
}

