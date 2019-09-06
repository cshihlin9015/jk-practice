package com.cshihlin9015.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        java7();

    }

    private static void java7() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime()); //得到 long 值

        // 自行定義時間格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        // 字串轉回 Date 物件
        String s = "2019/09/07 12:30:25";
        try {
            Date other = simpleDateFormat.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // 時間運算
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.getTime()); // 呼叫 Calendar 身上的 getTime() 就可以得到 Date 物件
        calendar.set(Calendar.MONTH,2);
        calendar.set(Calendar.DAY_OF_MONTH,25);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR,8);
        System.out.println(calendar.getTime());
    }
}
