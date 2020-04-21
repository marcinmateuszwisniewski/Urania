package com.company;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class SingleTimeFactory {

    public static SingleTime produce(String city) {
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
            SingleTime st = new SingleTime();
            st.setTimezone(ZoneId.of(zoneId));
            st.setName(city);
            System.out.println("end" + city);
            return st;
        } else return null;


    }
}
