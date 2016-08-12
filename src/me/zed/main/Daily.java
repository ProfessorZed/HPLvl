package me.zed.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Daily {

    public static void main(String[] args) {
        System.out.println(calcDaily(10000, 630000));
        /*
        example: lvl 2 = 10k exp, lvl 250 = 630k exp
        Chart by Q__T:

        https://hypixel.net/proxy/BcmjTMrMwQR16W4e99Qb4Iy%2F2dcLKq5N0aRjZLf9eAVHmyvHHJunv%2BwAPH5g0sgpEsIDlhwMpus%3D/image.png
         */
    }

    public static int calcDaily(int first, int second) {
        /*
         first/second = EXP required for said levels
         you can modify it to levels instead of the exp needed.
         */
        int sum = 0;
        double years = 0;
        double months = 0;
        double weeks = 0;
        double days = 0;
        double hours = 0;
        double minutes = 0;
        double sec = 0;
        for (int i = first; i <= second; i = i + 2500) { //2500 is the increase from each level
            sum = sum + i;
            years = days/365;
            months = days/30;
            weeks = days/7;
            days = days + (i / Quests.alldaily);
            hours = hours + (i / Quests.alldaily * 24);
            minutes = minutes + (i / Quests.alldaily * 24 * 60);
            sec = sec + (i / Quests.all * 24 * 60 * 60);
        }


        NumberFormat format = new DecimalFormat("#0.00");
        System.out.println("Exp Difference: " + sum + "\r\n");
        System.out.println("Total time needed:\r\n" +
                "Years: " + format.format(years) + "\r\n" +
                "Months: " + format.format(months) + "\r\n" +
                "Weeks: " + format.format(weeks) + "\r\n" +
                "Days: " + format.format(days) + "\r\n" +
                "Hours: " + format.format(hours) + "\r\n" +
                "Minutes: " + format.format(minutes) + "\r\n" +
                "Seconds: " + format.format(sec) + "\r\n");

        return sum;
    }


}

