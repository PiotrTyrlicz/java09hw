import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //  ZADANIE 2
        //File file = new File("tekst.txt");
        String a;
        Scanner scan1=new Scanner(System.in);
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("tekst.txt");
            BufferedWriter bfw = new BufferedWriter(fileWriter);
            System.out.println("Podaj ile liczb chcesz wprowadzic");
            int ilosc;
            ilosc=scan1.nextInt();
            double[] tab=new double[ilosc];
            for(int i=0; i<ilosc; i++){
                System.out.println("Podaj liczbe");
                tab[i]=scan1.nextDouble();
                a=Double.toString(tab[i]);
                bfw.write(a);
                bfw.newLine();
            }
            bfw.close();
        } catch (IOException | InputMismatchException ex) {
            System.out.println("Wprowadziles bledne dane");
        }




    }
}
