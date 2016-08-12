package me.zed.main;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Weekly {

    public static void main(String[] args){
        calcWeekly(10000, 630000);
    }

    public static int calcWeekly(int first, int second){
        int sum = 0;
        double years = 0;
        double months = 0;
        double weeks = 0;
        double days = 0;
        double hours = 0;
        double minutes = 0;
        double sec = 0;

        for(int i = first; i <= second; i = i + 2500){
            sum = sum + i;
            weeks = weeks + (i/Quests.all);
        }

        NumberFormat format = new DecimalFormat("#0.00");
        System.out.println("Weeks: " + format.format(weeks));

        return sum;
    }
}
