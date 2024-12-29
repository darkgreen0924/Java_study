package com.lq.date;

import lombok.extern.slf4j.Slf4j;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

/**
 * JDK8Date
 *
 * @author qingqing
 * @date 2024/12/29
 */

@Slf4j
public class JDK8Date {
    public static void main(String[] args) {
        // Date
        // 时间戳
        Instant instant = Instant.now();
        log.info("instant:{}", instant);
        Instant instant1 = Instant.ofEpochMilli(System.currentTimeMillis());
        log.info("instant1:{}", instant1);
        Instant instant2 = Instant.ofEpochSecond(System.currentTimeMillis() / 1000);
        log.info("instant2:{}", instant2);

        ZoneId zoneId1 = ZoneId.systemDefault();
        log.info("zoneId1:{}", zoneId1);
        ZoneId zoneId2 = ZoneId.of(ZoneId.SHORT_IDS.get("PST"));
        log.info("zoneId2:{}", zoneId2);

        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, zoneId2);
        log.info("zonedDateTime:{}", zonedDateTime);
        ZonedDateTime zonedDateTime2 = ZonedDateTime.ofInstant(instant, zoneId1);
        log.info("zonedDateTime2:{}", zonedDateTime2);

        // 日期格式化类
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        log.info(dateTimeFormatter.format(zonedDateTime2));
        log.info(zonedDateTime2.format(dateTimeFormatter));

        // 日历类
        LocalDate localDate = LocalDate.now();
        log.info("localDate:{}", localDate);

        LocalTime localTime = LocalTime.now();
        log.info("localTime:{}", localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        log.info("localDateTime:{}", localDateTime);

        // 工具类
        // Period 计算年月时间间隔
        LocalDate localDate1 = LocalDate.of(2000, 10, 21);
        LocalDate localDate2 = LocalDate.of(2004, 10, 18);
        Period period = Period.between(localDate1, localDate2);
        log.info("years:{}", period.getYears());
        log.info("months:{}", period.getMonths());
        log.info("days:{}", period.getDays());
        //Duration 计算时分秒间隔
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(10, 2, 10);
        Duration duration = Duration.between(localTime1, localTime2);
        log.info("hours:{}", duration.getSeconds());

        //ChronoUnit 所有单位间隔
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = LocalDateTime.of(2000, 10, 21, 10, 10, 10);

        log.info("{}", ChronoUnit.YEARS.between(localDateTime1, localDateTime2));
        log.info("{}", ChronoUnit.MONTHS.between(localDateTime1, localDateTime2));
        log.info("{}", ChronoUnit.DAYS.between(localDateTime1, localDateTime2));
        log.info("{}", ChronoUnit.HOURS.between(localDateTime1, localDateTime2));
        log.info("{}", ChronoUnit.MINUTES.between(localDateTime1, localDateTime2));
        log.info("{}", ChronoUnit.SECONDS.between(localDateTime1, localDateTime2));

    }
}
