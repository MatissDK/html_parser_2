import com.jaunt.JauntException;
import com.jaunt.UserAgent;

public class Main {

    public static void main(String[] args) {

        try {
            UserAgent userAgent = new UserAgent();
            userAgent.visit("http://tis.ta.gov.lv/court.jm.gov.lv/stat/html/cal_1_201610.html");
            System.out.println(userAgent.doc.innerHTML());
        } catch (JauntException e) {
            System.err.println(e);
        }

    }


}
