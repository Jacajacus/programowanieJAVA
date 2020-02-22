package pl.gda.wsb.employee;

import java.util.Date;

public class EmployeeDemo {

    public static String companyName = "logintegra Sp. z o.o.";


    public static void main(String args[]){

        String operatorName = args[1];
        int employeeCounter = 14;

        System.out.println("Hello " + args[0] + "!");
        System.out.println("Aktualna data: " + new Date());
        System.out.println("Nazwa firmy: " + companyName);
        System.out.println("Nazwa operatora: " + operatorName);
        System.out.println("Liczba pracowników: " + employeeCounter);

    }
}
