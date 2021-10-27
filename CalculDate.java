package cours2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class CalculDate {
    
    static Scanner in = new Scanner(System.in);

    private int age;

    public CalculDate() {
        age = controlDate();
        System.out.println("Vous avez " + age + " ans.");
    }

    private int controlDate() {
        Date tmpD = null;
        Calendar birth = Calendar.getInstance();
        Calendar aujourdhui = Calendar.getInstance();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
        int calculAge;

        while (tmpD == null) {
            try {
                System.out.println("Entrez votre date de naissance [jj/mm/aaaa] : ");
                //date = System.console().readLine();
                tmpD = formatDate.parse(in.next());
            } catch (ParseException e) {
                System.out.println("Le format de la date est incorrect !");
            }
        }

        birth.setTime(tmpD);
        calculAge = aujourdhui.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        
        return calculAge;
    }

    public int getAge() {
        return age;
    }
}
