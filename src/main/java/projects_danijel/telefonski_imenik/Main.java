package projects_danijel.telefonski_imenik;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var contactsArray = new ArrayList<Contact>(0);

        boolean placeHolder = true;
        while(placeHolder) {
            ContactMenu.mainMenu();
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();

            while (!(input.matches("[0-9]+"))) {
                System.out.print("Krivi unos. Molimo upišite valjani broj.");
                System.out.println("");
                input = scanner.next();
            }
            int inputInt = Integer.parseInt(input);

            System.out.println("");
            switch (inputInt) {
                case (1):
                    var contactReport = new ContactReport(contactsArray);
                    contactReport.print();
                    break;
                case (2):
                    contactsArray.add(0,ContactAdd.addNew());
                    break;
                case (3):
                    var contactSearch = new ContactSearchOrDelete(contactsArray);
                    contactSearch.search();
                    break;
                case (4):
                    contactSearch = new ContactSearchOrDelete(contactsArray);
                    contactSearch.delete();
                    break;
                case (5):
                    contactsArray.addAll(ContactTestData.testDataArray());
                    break;
                case (9):
                    placeHolder = false;
                default:
                    break;
            }
        }
    }
}
