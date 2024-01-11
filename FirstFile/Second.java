import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;

public class Second {

    public static void main(String[] args) {
        int high =  Integer.MAX_VALUE;
        int low = Integer.MIN_VALUE;

        System.out.println(high+ " \n " + low);

        Long val1 = 127L;
        Long val2 = 127L;

        System.out.println(val1 == val2);

        Long val3 = 128L;
        Long val4 = 128L;

        System.out.println(val3 == val4);

        ZoneId zone1 = ZoneId.of("Asia/Kolkata");
        LocalTime notTime = LocalTime.now(zone1);
        System.out.println(notTime);

        int one = 21;
        int[] one1 = new int[one];

        System.out.println();
    }
}