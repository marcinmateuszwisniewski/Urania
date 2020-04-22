package com.company;

import com.company.SingleTime.SingleTimeFactory;
import com.company.TimePrinter.IntervalTimePrinter;
import com.company.TimePrinter.TimePrinter;
import com.company.TimePrinter.TimePrinterInterface;

import java.time.format.FormatStyle;


public class Main {

    public static void main(String[] args) {

        TimePrinterInterface timePrinter = new IntervalTimePrinter(new TimePrinter(), 1000);
        timePrinter.setFormat(FormatStyle.MEDIUM);
        timePrinter.addTime(SingleTimeFactory.produce("Warsaw"));
        timePrinter.addTime(SingleTimeFactory.produce("New_York"));
        timePrinter.addTime(SingleTimeFactory.produce("Athens"));
        timePrinter.printTime();
        //get time zones
        //write times
    }
}
