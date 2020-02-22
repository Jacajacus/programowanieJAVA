package pl.gda.wsb.employee;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmployeeDemo {

    public static String companyName = "logintegra Sp. z o.o.";
    static String filename = System.getProperty("user.dir") + "\\utils\\db.txt";

    public static void main(String args[]) {

        String operatorName = args[1];
        Integer employeeCounter = 14;
        ArrayList<String> employees = new ArrayList<>();
        ArrayList<String> loggedEmployees = new ArrayList<>();
        File file = new File(filename);

        //FILE SCANNER
        Scanner filescanner = null;

        try {
            filescanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Błąd pobrania pliku");
            return;
        }

        Pattern pattern = Pattern.compile("(true|false) - (.+)");
        while (filescanner.hasNextLine()) {
            String employee = filescanner.nextLine();
            Matcher matcher = pattern.matcher(employee);
            if (matcher.matches()) {
                employees.add(employee);
                if (Boolean.parseBoolean(matcher.group(1))) {
                    loggedEmployees.add(matcher.group(2));
                }
            }
        }

        filescanner.close();

        //ZAMKNIĘCIE FILESCANNER

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello ").append(args[1]).append("!").append("\n")
                .append("aktualna data: ").append(new Date()).append("\n")
                .append("Nazwa Operatora: ").append(operatorName).append("\n")
                .append("Nazwa Firmy: ").append(companyName);

        System.out.println(stringBuilder);


        if (employeeCounter == null) {
            System.out.println("Błąd pobierania pracowników");
        }
        if (employeeCounter == 0) {
            System.out.println("Brak pracowników");
        } else {
            System.out.println("Liczba pracowników: " + employeeCounter);
        }

        if (loggedEmployees.size() > 0) {
            System.out.println("zalogowani pracownicy:");
            for (int i = 0; 1 < loggedEmployees.size(); i++) {
                if (i == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(loggedEmployees.get(i));
            }
        }

        System.out.println("\nPodaj imię i nazwisko (exit = koniec): ");
        Scanner inScanner = new Scanner(System.in);
        while (inScanner.hasNextLine()) {
            String text = inScanner.nextLine();
            if (text.equals("exit")) {
                // zapis do pliku
                break;
            }

            Pattern patternSearch = Pattern.compile("^(true|false) - " + text + " - (.+)$");
            int i = 0;

            for (String employee : employees){
                Matcher matcher = patternSearch.matcher(employee);
                if (matcher.matches()){
                    boolean islogged = Boolean.parseBoolean(matcher.group(1));
                    employees.remove(i);
                    employees.add(i, employee.replace(matcher.group(1), islogged ? "false" : "true"));
                }
                i++;
            }
        }
    }

}