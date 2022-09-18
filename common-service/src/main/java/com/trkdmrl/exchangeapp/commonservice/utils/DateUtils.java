package com.trkdmrl.exchangeapp.commonservice.utils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {

    /**
     * Tarih değişkendeki zamanı 00:00:00 olarak günceller.
     *
     * @return date
     */
    public static LocalDateTime getStartTimeFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return getLocalDateTimeFromDate(cal.getTime());
    }

    /**
     * Tarih değişkendeki zamanı 23:59:59 olarak günceller.
     *
     * @return date
     */
    public static LocalDateTime getEndTimeFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return getLocalDateTimeFromDate(cal.getTime());
    }

    /**
     * Date objesini LocalDateTime nesnesine çevirir.
     *
     * @param date
     * @return localDateTime
     */
    public static LocalDateTime getLocalDateTimeFromDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public static LocalDateTime getLocalDateTimeFromEndDate(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 1);
        c.add(Calendar.SECOND, -1);
        return c.getTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
}