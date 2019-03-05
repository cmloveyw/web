package org.sang.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Calendar;

/**
 * @version 1.0
 * @类名: tt.java
 * @描述:
 * @创建人: CM
 * @创建时间: 2019-2-27
 */
public class tt {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(data);
        System.out.println(Calendar.MONTH);
        calendar.add(Calendar.MONTH, 2);
        Date data = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String aa = simpleDateFormat.format(data);
        System.out.println(aa);

    }
}
