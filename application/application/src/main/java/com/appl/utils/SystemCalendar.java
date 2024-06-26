package com.appl.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SystemCalendar {
    private static final SimpleDateFormat TIMESTAMP = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    
    public static final Long getSimpleDate(){
        Calendar c = Calendar.getInstance();
        return Long.valueOf(TIMESTAMP.format(c.getTime()));
    }
}
