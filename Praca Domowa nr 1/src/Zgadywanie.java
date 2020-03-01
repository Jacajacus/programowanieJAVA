import java.util.Scanner;
import java.util.Random;

public class Zgadywanie {

    public static void main(String args[]) {

        //Wpisywanie liczby
        Scanner in = new Scanner(System.in);
        System.out.println("Wylosuj liczbę od 0 do ...?");
        int a = in.nextInt();
        System.out.println("Wylosowano liczbę z przedziału od 0 do " + a + ".");

        //Losowanie z przedziału:
        Random r = new Random();
        int b = r.nextInt(a);
        //System.out.println(b);

        //Zgadywanie liczb
        System.out.println("Masz TRZY próby. Zgadnij co to za liczba.");


        int p = 1;
        System.out.println("podejście #" + p +":");
        int c = in.nextInt();

        if (c == b) {
            System.out.println("Gratulacje! Zgadłeś :). Wylosowana liczba to: " + b);
        } else {
            System.out.println("Spróbuj jeszcze raz.");
            p++;
            System.out.println("podejście #" + p +":");
            int d = in.nextInt();

            if (d == b) {
                System.out.println("Gratulacje! Zgadłeś :). Wylosowana liczba to: " + b);
            } else {
                System.out.println("Spróbuj jeszcze raz.");
                p++;
                System.out.println("podejście #" + p +":");
                int e = in.nextInt();

                if (e == b) {
                    System.out.println("Gratulacje! Zgadłeś :). Wylosowana liczba to: " + b);
                } else {
                    System.out.println("Niestety, przegrałeś. Poprawna liczba to: " + b);
                }
            }
        }
    }
}

