package projects_danijel.telefonski_imenik;

import java.util.Scanner;

public class ContactAdd {
    public static Contact addNew() {
        var contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Novi kontakt\nTelefon: ");
        String telefon = scanner.next();
        while (!(telefon.matches("[0-9]+"))) {
            System.out.print("Krivi unos. Molimo upišite 11 brojeva.\nOIB: ");
            telefon = scanner.next();
        }
        contact.setTelefon(telefon);

        System.out.print("OIB: ");
        String oib = scanner.next();
        while (!(oib.matches("[0-9]+") && oib.length()==11)) {
            System.out.print("Krivi unos. Molimo upišite 11 brojeva.\nOIB: ");
            oib = scanner.next();
        }
        contact.setOib(oib);

        System.out.print("Ime: ");
        String ime = scanner.next();
        while (!ime.matches("[a-zA-Z]+")) {
            System.out.print("Nedopušteni znaci, molimo ponovite unos.\nIme:  ");
            ime = scanner.next();
        }
        contact.setIme(ime);

        System.out.print("Prezime: ");
        String prezime = scanner.next();
        while (!prezime.matches("[a-zA-Z]+")) {
            System.out.print("Nedopušteni znaci, molimo ponovite unos.\nPrezime:  ");
            prezime = scanner.next();
        }
        contact.setPrezime(prezime);

        System.out.print("Adresa: ");
        scanner.nextLine();
        String adresa = scanner.nextLine();
        contact.setAdresa(adresa);

        System.out.print("Grad: ");
        String grad = scanner.nextLine();
        while (!grad.matches("[a-zA-Z]+")) {
            System.out.print("Nedopušteni znaci, molimo ponovite unos.\nGrad:  ");
            grad = scanner.next();
        }
        contact.setGrad(grad);

        return contact;
    }
}