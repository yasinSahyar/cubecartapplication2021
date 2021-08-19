package com.seleniummaster.datetime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;

import java.time.ZoneId;
import java.util.Set;

public class JodaDateTime {
    public static void main(String[] args) {
        DateTime dateTime=new DateTime(DateTimeZone.UTC);
        System.out.println(dateTime);
        DateTimeZone timeZone=DateTimeZone.forID("Asia/Urumqi");
        DateTime urumqiTime=new DateTime(timeZone);
        System.out.println("istanbul time is: "+urumqiTime);
        Set<String> availabeTimeZones= ZoneId.getAvailableZoneIds();
        for(String countryID:availabeTimeZones){
            System.out.println(countryID);
        }
        System.out.println(dateTime.getMonthOfYear());
        System.out.println(dateTime.getDayOfWeek());
        DateTime beginDate=new DateTime("2021-7-10");
        DateTime endDate=new DateTime();
        Period period=new Period(beginDate,endDate, PeriodType.days());
        System.out.println("Total exectution Date is: "+period.getDays());

    }
}
