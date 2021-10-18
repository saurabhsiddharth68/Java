package AddressBook;

import java.util.Scanner;

public class addressBookMain {

    public static void main(String[] args) {
        addressBook AddressBook = new addressBook();
        Scanner scanner = new Scanner(System.in);
        addressBook addressBook2 = new addressBook();
		addressBook2.addContact();
        System.out.println("Enter 1 To Edit The Contact and 2 To Delete The Contact ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            AddressBook.editContact();
        } else {
            AddressBook.deleteContact();
        }
    }
}
