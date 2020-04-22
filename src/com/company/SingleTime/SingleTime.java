package com.company.SingleTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SingleTime implements SingleTimeInterface {

    private ZoneId zoneId;
    private String name;

    public SingleTime(ZoneId zoneId, String name) {
        this.zoneId = zoneId;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ZonedDateTime now() {
        return ZonedDateTime.now(this.zoneId);
    }
}
