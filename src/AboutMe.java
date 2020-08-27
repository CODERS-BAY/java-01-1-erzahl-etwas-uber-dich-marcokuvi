
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

        System.out.printf(" My name is %s %s and i'm born on the %s, i'm %d years old and my gender is %c,  my marriage status is %b and my average grade is %f ", forname, surname, (simpleDateFormat.format(birthday)), age, gender, status, averageGrade);
    }
}
