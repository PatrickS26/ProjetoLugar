package com.example.projetolocalizao.model;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateHelper {
    private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
    public static String format (Date date){
        return sdf.format(date);
    }
}
