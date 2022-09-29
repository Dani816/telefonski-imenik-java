package projects_danijel.telefonski_imenik;

import java.util.ArrayList;

public class ContactReport {
    private ArrayList<Contact> kontakti;

    public ContactReport(ArrayList<Contact> kontakti) {
        this.kontakti = kontakti;
    }

    public void print() {
        if (!(kontakti.isEmpty())) {
            for (Contact contact : kontakti)
                System.out.println(contact);
        }
        else System.out.println("Ne postoji niti jedan zapis.");
    }
}
