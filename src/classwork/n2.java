package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class n2 {
    public void checkDate(String dayWeek) {
        Calendar c;
        String[] q = dayWeek.split("\\.");
        c = new GregorianCalendar(Integer.parseInt(q[2]), Integer.parseInt(q[1])-1, Integer.parseInt(q[0])-1);
        String[] qq = new String[] {"Будни","Будни","Будни","Будни","Будни","Выходной","Выходной"};
        System.out.println(qq[c.get(Calendar.DAY_OF_WEEK)-1]);
    }
}
