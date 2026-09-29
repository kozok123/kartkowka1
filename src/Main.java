import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> liczby = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            liczby.add(random.nextInt(19, 30)+1);
        }
        int cos = 1;
        int cos2 = 0;
        for (int i =0; i<10; i++) {
            System.out.println("liczba "+ cos+": "+ liczby.get(cos2));
            cos++;
            cos2++;
        }

        HashSet<Integer> unikatowe = new HashSet<>(liczby);
        System.out.println("Liczba wartości unikatowych: "
                + unikatowe.size());

        int ilePierwszych = 0;

        for (int liczba : liczby) {
            if (czyPierwsza(liczba)) {
                ilePierwszych++;
            }
        }
        System.out.println("Liczb pierwszych: " + ilePierwszych);
    }

    public static boolean czyPierwsza(int liczba) {
        if (liczba < 2) {
            return false;
        }
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
        return true;
    }
}


