package projects_danijel.telefonski_imenik;

import java.util.ArrayList;

public class ContactTestData {
    public static ArrayList<Contact> testDataArray() {
        var testData = new ArrayList<Contact>(0);
        Contact testContact1 = new Contact("051246658","13025046559", "Marin", "Virić", "Zagrebačka 55", "Rijeka");
        Contact testContact2 = new Contact("0911468453","33005613821", "Lara", "Brdo", "Slavonska 23", "Opatija");
        Contact testContact3 = new Contact("0976584526","00607551524", "Emil", "Brdar", "Ružići 2", "Opatija");
        Contact testContact4 = new Contact("053126535","55488999904", "Maja", "Vozić", "Selo Belo 2", "Opatija");
        testData.add(0, testContact1);
        testData.add(0, testContact2);
        testData.add(0, testContact3);
        testData.add(0, testContact4);
        return testData;
    }
}
