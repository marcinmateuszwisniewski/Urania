package com.company;

import com.company.SingleTime.SingleTimeFactory;
import com.company.SingleTime.SingleTimeInterface;
import com.company.TimePrinter.IntervalTimePrinter;
import com.company.TimePrinter.TimePrinter;
import com.company.TimePrinter.TimePrinterInterface;

import java.time.format.FormatStyle;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        Set<SingleTimeInterface> timeSet = new HashSet<>();
        timeSet.add(SingleTimeFactory.produce("Warsaw"));
        timeSet.add(SingleTimeFactory.produce("New_York"));
        timeSet.add(SingleTimeFactory.produce("Athens"));

        TimePrinterInterface timePrinter = new IntervalTimePrinter(new TimePrinter(FormatStyle.MEDIUM, timeSet), 1000);
        timePrinter.printTime();
        //get time zones
        //write times
    }
}
