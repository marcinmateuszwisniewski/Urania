package com.company.SingleTime;

import java.time.ZoneId;
import java.util.Set;

public class SingleTimeFactory {

    public static SingleTimeInterface produce(String city) {
        System.out.println("start" + city);
        String zoneId = null;
        Set<String> timezoneNames = ZoneId.getAvailableZoneIds();
        for (String timezonesName : timezoneNames) {
            if (timezonesName.contains(city)) {
                System.out.println("found" + city);
                zoneId = timezonesName;
                break;
            }
        }
        if (zoneId != null) {
            SingleTime st = new SingleTime(ZoneId.of(zoneId), city);
            System.out.println("end" + city);
            return st;
        } else return null;


    }
}
