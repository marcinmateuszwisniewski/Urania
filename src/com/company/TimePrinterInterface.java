package com.company;

import java.time.format.FormatStyle;

public interface TimePrinterInterface {
    void addTime(SingleTimeInterface time);

    void setFormat(FormatStyle formatStyle);

    void clear();

    void printTime();
}
