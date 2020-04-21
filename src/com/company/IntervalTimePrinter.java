package com.company;

import java.time.format.FormatStyle;

public class IntervalTimePrinter implements TimePrinterInterface {
    private TimePrinterInterface printer;
    private int interval;

    public IntervalTimePrinter(TimePrinterInterface printer, int interval) {
        this.printer = printer;
        this.interval = interval;
    }

    @Override
    public void addTime(SingleTimeInterface time) {
        printer.addTime(time);
    }

    @Override
    public void setFormat(FormatStyle formatStyle) {
        printer.setFormat(formatStyle);
    }

    @Override
    public void clear() {
        printer.clear();
    }

    @Override
    public void printTime() {
        int limit = 100; //for debug purpose
        while (limit-- > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            printer.printTime();

        }
    }
}
