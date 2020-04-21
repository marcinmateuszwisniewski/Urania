package com.company;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class SingleTime implements SingleTimeInterface {

    private ZoneId zoneId;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ZonedDateTime now() {
        return ZonedDateTime.now(this.zoneId);
    }

    @Override
    public void setTimezone(ZoneId zoneId) {
        this.zoneId = zoneId;
    }
}
