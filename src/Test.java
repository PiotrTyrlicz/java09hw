import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start programu");

            // ZADANIE 1

        Scanner scan1=new Scanner(System.in);
        System.out.println("Podaj imie");
        String imie=scan1.nextLine();
        System.out.println("Podaj nazwisko");
        String nazwisko=scan1.nextLine();
        System.out.println("Podaj wiek");
        int wiek=scan1.nextInt();
        scan1.nextLine();
        System.out.println("Podaj pesel");
        String pesel=scan1.nextLine();
        try {
            Person person1 = new Person(imie, nazwisko, wiek, pesel);
            System.out.println("Osoba "+ person1.getFirstName() + " " + person1.getLastName()+ " " + person1.getAge()+ " " + person1.getPesel());
        }catch (NameUndefinedException e){
            System.out.println("Coś nie tak z imieniem/nazwiskiem");
        }catch (IncorrectAgeException e){
            System.out.println("Cos nie tak z wiekiem");
        }

        System.out.println("Koniec programu");
    }
}
