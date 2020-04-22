package com.company.SingleTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public interface SingleTimeInterface {
     String getName();

     void setName(String name);

     ZonedDateTime now();

     void setTimezone(ZoneId zoneId);
}
