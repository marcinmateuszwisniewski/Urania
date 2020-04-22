package com.company.TimePrinter;

import com.company.SingleTime.SingleTimeInterface;

import java.time.format.FormatStyle;

public class IntervalTimePrinter implements TimePrinterInterface {
    private TimePrinterInterface printer;
    private int interval;

    public IntervalTimePrinter(TimePrinterInterface printer, int interval) {
        this.printer = printer;
        this.interval = interval;
    }



    @Override
    public void printTime() {
        int limit = 100; //for debug purpose
        while (limit-- > 0) {
            try {
                Thread.sleep(this.interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            printer.printTime();

        }
    }
}
