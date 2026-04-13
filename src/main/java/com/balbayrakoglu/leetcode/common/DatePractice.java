package com.balbayrakoglu.leetcode.common;

import java.time.*;

public class DatePractice {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
        Instant instantNow = Instant.now();

        System.out.println("LocalDate: " + today);
        System.out.println("LocalTime: " + nowTime);
        System.out.println("LocalDateTime: " + nowDateTime);
        System.out.println("ZonedDateTime: " + zonedDateTime);
        System.out.println("Instant: " + instantNow);


        LocalDateTime instantManipulation = LocalDateTime.now();

        System.out.println("Bugün: " + instantManipulation);
        System.out.println("3 gün sonra: " + instantManipulation.plusDays(3));
        System.out.println("2 hafta sonra: " + instantManipulation.plusWeeks(2));
        System.out.println("1 ay önce: " + instantManipulation.minusMonths(1));
        System.out.println("5 yıl sonra: " + instantManipulation.plusYears(5));

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime deadLine = LocalDateTime.of(2026, 4, 15, 0, 0);

        System.out.println("today.isBefore(deadline): " + now.isBefore(deadLine)); //true
        System.out.println("today.isAfter(deadline): " + now.isAfter(deadLine)); //After
        System.out.println("today.isEqual(deadline): " + now.isEqual(deadLine)); //After

        if (now.isBefore(deadLine)) {
            System.out.println("Tarih geçmedi");
        } else if (now.isEqual(deadLine)) {
            System.out.println("Tarih bugün");
        } else {
            System.out.println("Tarih geçmedi");
        }


        LocalDateTime todayTime = LocalDateTime.now();
        LocalDateTime campaignEnd = LocalDateTime.of(2026, 4, 13, 23, 59);

        if (todayTime.isBefore(campaignEnd)) {
            System.out.println("Still active");
        } else if (todayTime.isEqual(campaignEnd)) {
            System.out.println("Last day");
        } else {
            System.out.println("ended");
        }


        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime expiryTime = now.minusHours(2);

        if (currentTime.isAfter(expiryTime)) {
            System.out.println("expired");
        } else if (currentTime.isEqual(expiryTime)) {
            System.out.println("Expires now");
        } else if (currentTime.isBefore(expiryTime)) {
            System.out.println("Still valid");
        }

      
    }

}
