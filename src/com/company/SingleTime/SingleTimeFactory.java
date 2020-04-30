package com.company.SingleTime;

import java.time.ZoneId;
import java.util.Optional;
import java.util.Set;

public class SingleTimeFactory {

    public static SingleTimeInterface produce(String city) {
        System.out.println("start" + city);
        Set<String> timezoneNames = ZoneId.getAvailableZoneIds();

        Optional<String> result = timezoneNames.stream().filter(s -> s.contains(city)).findFirst();

        if (result.isPresent()) {
            SingleTime st = new SingleTime(ZoneId.of(result.get()), city);
            System.out.println("end" + city);
            return st;
        } else return null;


    }
}
