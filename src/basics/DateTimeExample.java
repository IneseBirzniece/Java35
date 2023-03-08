package basics;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeExample {
    public static void main(String[] args) {

        //LocalTime , now ņem tagadējo laiku uz manas iekārtas
        LocalTime localTime = LocalTime.now();

        //tagad bez sekundes simtdaļām
        LocalTime localTime1 = LocalTime.now().withNano(0);


        System.out.println("Now is " + localTime);
        System.out.println("Now is " + localTime1);

        //lai izdotu bez : bet ar /
        //lai izdotu tikai stundas, minūtes utt
        System.out.println(localTime1.getHour() + "/" + localTime1.getMinute() + "/" + localTime1.getSecond());

        //calculate the time at withc break will end

        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until " + localTime1);

        System.out.println("Now is " + localTime1.getHour() + " full hours");

        //Local date

        LocalDate localDate = LocalDate.now();
        System.out.println("Today is: " + localDate);
        System.out.println("Year is " + localDate.getYear());
        System.out.println("Day of the week is " + localDate.getDayOfWeek() + " and day of the year is " + localDate.getDayOfYear());


        //hold on the memory historical dates
        //mēnesi var ievadīt ar skaitļiem vai izmantot Month. opciju

        LocalDate startOfCovid = LocalDate.of(2019, Month.DECEMBER, 11);
        System.out.println("Covid-19 started in " + startOfCovid + " when the first case was documented");

    }
}
