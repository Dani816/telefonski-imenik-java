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
            if (list.getTelefon().equalsIgnoreCase(kljuc) ||
                    list.getOib().equalsIgnoreCase(kljuc) ||
                    list.getIme().equalsIgnoreCase(kljuc) ||
                    list.getPrezime().equalsIgnoreCase(kljuc) ||
                    list.getAdresa().equalsIgnoreCase(kljuc) ||
                    list.getGrad().equalsIgnoreCase(kljuc)) {

                System.out.println(list);
            }
        }
    }

    public void delete() {
        System.out.println("Molimo vas upišite broj zapisa koji želite obrisati: ");
        for (Contact list : contactsArray) {
            System.out.println(contactsArray.indexOf(list)+1 + ". " + list);
        }
        System.out.print("Odabir: ");
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt()-1;
        while (key >= contactsArray.size()) {
            System.out.println("Molimo vas unesite važeći broj zapisa.");
            key = scanner.nextInt()-1;
        }
        contactsArray.remove(key);
    }
}
