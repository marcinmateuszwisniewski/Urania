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

        timeSet.stream().map(SingleTimeInterface::getName).forEach(t -> System.out.print(String.format("%-20s", t)));
        System.out.println();
        timeSet.stream().map(SingleTimeInterface::now).map(t -> DateTimeFormatter.ofLocalizedDateTime(this.formatStyle).format(t)).forEach(t -> System.out.print(String.format("%-20s", t)));
        //alt(not sure if there is any difference):
        // timeSet.stream().map(t-> DateTimeFormatter.ofLocalizedDateTime(this.formatStyle).format(t.now())).forEach(t -> System.out.print(String.format("%-20s", t)));
        System.out.println();
    }
}
