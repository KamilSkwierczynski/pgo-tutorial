import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wpisz liczbe: ");
        int liczba = scanner.next.int();
        if (liczba > 0) {
            System.out.println("liczba jest pozytywna");
        } else if (liczba < 0) {
            System.out.println("liczba jest negatywna");
        } else {
            System.out.println("liczba jest równa 0");
        }
        scanner.close();
    }
}