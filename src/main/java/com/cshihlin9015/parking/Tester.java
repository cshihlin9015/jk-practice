package com.cshihlin9015.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
//        java7();
//        java8();
    }

    private static void java8() {
        Instant instant = Instant.now();
        System.out.println(instant); //印出格林威治全球標準時間

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now); //印出本地時間

        // 自行定義時間格式
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));

        System.out.println(now.plus(Duration.ofHours(3))); // immutable，產生新的時間
        System.out.println(now);

        // 產生特定的日期與時間
        LocalDateTime other = LocalDateTime.of(2019, 12, 25, 8, 0, 0);
        System.out.println(other);
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
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 8);
        System.out.println(calendar.getTime());
    }
}
