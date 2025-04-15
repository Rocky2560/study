import java.text.SimpleDateFormat;
import java.util.Date;

public class date {


    public static void main(String[] args) {
        String date = "dd-MM-YYY";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(date);

        String data = simpleDateFormat.format(new Date());
        System.out.println(data);
    }
}
