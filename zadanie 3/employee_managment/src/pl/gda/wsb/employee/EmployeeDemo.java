package pl.gda.wsb.employee;

import java.util.Date;

public class EmployeeDemo {

    public static String companyName = "logintegra Sp. z o.o.";


    public static void main(String args[]){

        String operatorName = args[1];
        int employeeCounter = 14;
        int loggedEmployeesCounter = 6;


        System.out.println("Hello " + args[0] + "!");
        System.out.println("Aktualna data: " + new Date());
        System.out.println("Nazwa firmy: " + companyName);
        System.out.println("Nazwa operatora: " + operatorName);
        System.out.println("Liczba pracowników: " + employeeCounter);

        if (employeeCounter == 0){
            System.out.println("Brak pracowników");
        } else{
            System.out.println("liczba pracowników: " + employeeCounter);
        }

        if (loggedEmployeesCounter > 0) {
            System.out.println("zalogowani pracownicy:");
            for (int i = 0; 1 < loggedEmployeesCounter; i++){
                if (i == 5) {
                    System.out.println("...");
                    break;
                }
                System.out.println("Jan kowalski - kierownik");
            }
        }
    }
}
