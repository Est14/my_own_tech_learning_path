package com.est.DirectivasJSP.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversions {

    private static final String DATE_FORMAT = "dd-MM";

    public static String format(Date date){

        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);

        return formatter.format(date);
    }

    public static String format(String date){

        SimpleDateFormat formatter = new SimpleDateFormat(DATE_FORMAT);

        return formatter.format(date);
    }

}
