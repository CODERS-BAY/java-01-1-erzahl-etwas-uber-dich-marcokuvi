
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AboutMe {
    public static void main(String[] args) throws ParseException {
        String forname = "Marco";
        String surname = "Kuvi";
        int age = 20;
        char gender = 'm';
        double averageGrade = 2.6;
        boolean status = false;

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthday = simpleDateFormat.parse("23.05.2000");

        System.out.println(" My name is " + forname + " " + surname + " and i'm born on the " + (simpleDateFormat.format(birthday)) + " i'm " + age + " years old, my gender is " + gender + " my marrriage status is " + status + " and my average grades is " + averageGrade);
    }
}
