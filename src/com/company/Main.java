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

        SingleTime st1 = SingleTimeFactory.produce("Warsaw");
        SingleTime st2 = SingleTimeFactory.produce("New_York");
        TimePrinterInterface timePrinter = new IntervalTimePrinter(new TimePrinter(), 1000);
        timePrinter.addTime(st1);
        timePrinter.addTime(st2);
        timePrinter.printTime();
        //get time zones
        //write times
    }
}
