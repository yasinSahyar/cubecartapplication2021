package com.seleniummaster.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date.toString());
        SimpleDateFormat ad=new SimpleDateFormat("M-d-yyyy");
        SimpleDateFormat ad1=new SimpleDateFormat("M-d-yyyy hh:mm:ss");
        System.out.println(ad.format(date));
        System.out.println(ad1.format(date));

        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.plusDays(10));
        System.out.println(dateTime.minusDays(10));
        sevenDaysEarlier();
    }
    public static String sevenDaysEarlier(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        Date date = new Date();
        String todate = dateFormat.format(date);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -15);
        Date todate1 = cal.getTime();
        String fromdate = dateFormat.format(todate1);
        System.out.println(fromdate);
        return fromdate;
    }
}
