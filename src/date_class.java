import java.util.Date;

public class date_class {
    public static void main(String[] args) {
        Date date=new Date();
        String s=String.format("%tF",date);
        System.out.println(s);
    }
}
