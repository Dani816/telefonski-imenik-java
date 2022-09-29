package projects_danijel.telefonski_imenik;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactSearchOrDelete {

    private ArrayList<Contact> contactsArray;

    public ContactSearchOrDelete(ArrayList<Contact> contactsArray) {
        this.contactsArray = contactsArray;
    }

    public void search() {
        System.out.print("Molim upišite traženi pojam: ");
        Scanner scanner = new Scanner(System.in);
        String kljuc = scanner.nextLine();

        for (Contact list : contactsArray) {
            if (list.getOib().equals(kljuc) ||
                    list.getIme().equals(kljuc) ||
                    list.getPrezime().equals(kljuc) ||
                    list.getAdresa().equals(kljuc) ||
                    list.getGrad().equals(kljuc)) {

                System.out.println(list);
            }
        }
    }

    public void delete() {
        System.out.println("Molim upišite broj zapisa koji želite obrisati: ");
        for (Contact list : contactsArray) {
            System.out.println(contactsArray.indexOf(list)+1 + ". " + list);
        }
        System.out.print("Odabir: ");
        Scanner scanner = new Scanner(System.in);
        int kljuc = scanner.nextInt()-1;
        contactsArray.remove(kljuc);

    }
}
