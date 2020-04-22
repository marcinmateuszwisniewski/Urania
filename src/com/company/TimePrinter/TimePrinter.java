package com.company.TimePrinter;

import com.company.SingleTime.SingleTimeInterface;

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashSet;
import java.util.Set;

public class TimePrinter implements TimePrinterInterface {

    Set<SingleTimeInterface> timeSet;
    FormatStyle formatStyle;

    public TimePrinter(FormatStyle formatStyle, Set<SingleTimeInterface> timeSet) {
        this.timeSet = timeSet;
        this.formatStyle = formatStyle;
    }

    @Override
    public void printTime() {
        for (SingleTimeInterface time : timeSet) {
            System.out.print(String.format("%-20s", time.getName()));
        }
        System.out.println();
        for (SingleTimeInterface time : timeSet) {
            System.out.print(String.format("%-20s", DateTimeFormatter.ofLocalizedDateTime(this.formatStyle).format(time.now())));
        }
        System.out.println();
    }
}
