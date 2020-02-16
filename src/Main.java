import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        System.out.println("Urodzony w tej dacie - ");
        if(maturity(17,2,1987))
            System.out.println("pełnoletni");
        else
            System.out.println("niepełnoletni");

    }

    public static boolean maturity (int day, int month, int year){

        LocalDate dateOfBirth, now;
        dateOfBirth=LocalDate.of(year, month, day);


        now = LocalDate.now();
        Period p = Period.between(dateOfBirth, now);

        if(p.getYears() >= 18) return true;
        return false;

    }
}
