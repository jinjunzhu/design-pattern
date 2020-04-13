package design.behavioral;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static String getCurrentDate(){
        return DateTimeFormatter.ofPattern("yyyy-MM-dd").format(LocalDate.now());
    }

    public static void main(String[] args){
        System.out.println(getCurrentDate());
    }
}
