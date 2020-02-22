package pl.gda.wsb.employee;

import java.util.ArrayList;
import java.util.Date;

public class EmployeeDemo {

    public static String companyName = "logintegra Sp. z o.o.";


    public static void main(String args[]){

        String operatorName = args[1];
        Integer employeeCounter = 14;

        ArrayList<String> loggedEmployees = new ArrayList<>();
        loggedEmployees.add("Jan Kowalski - kierownik");
        loggedEmployees.add("Jan Kowalski - kierownik");
        loggedEmployees.add("Jan Kowalski - kierownik");
        loggedEmployees.add("Jan Kowalski - kierownik");
        loggedEmployees.add("Jan Kowalski - kierownik");
        loggedEmployees.add("Jan Kowalski - kierownik");

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello ").append(args[1]).append("!").append("\n")
                .append("aktualna data: ").append(new Date()).append("\n")
                .append("Nazwa Operatora: ").append(operatorName).append("\n")
                .append("Nazwa Firmy: ").append(companyName);

        System.out.println(stringBuilder);


        if (employeeCounter == null) {
            System.out.println("Błąd pobierania pracowników");
        }
        if (employeeCounter == 0){
            System.out.println("Brak pracowników");
        } else{
            System.out.println("Liczba pracowników: " + employeeCounter);
        }

        if (loggedEmployees.size() > 0) {
            System.out.println("zalogowani pracownicy:");
            for (int i = 0; 1 < loggedEmployees.size(); i++){
                if (i == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println(loggedEmployees.get(i));
            }
        }
    }
}
