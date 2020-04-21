package com.company;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.TimeZone;

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
