package java18;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class jv18_09_LocalDateTime {
    
    public static void main(String[] args) {
        
        // 현재 날짜
        LocalDate today = LocalDate.now();
        
        // 현재 연도만 출력
        System.out.println(today.get(ChronoField.YEAR));
        
        // 현재 월만 출력
        System.out.println(today.get(ChronoField.MONTH_OF_YEAR));
        
        // 현재 일만 출력
        System.out.println(today.get(ChronoField.DAY_OF_MONTH));
        
        // 현재 시간
        LocalTime curtime = LocalTime.now();
        
        // 현재 시간만 출력
        System.out.println(curtime.get(ChronoField.HOUR_OF_DAY)); // 24시간
        System.out.println(curtime.get(ChronoField.HOUR_OF_AMPM));// 12시간
        
        // 현재 분만 출력
        System.out.println(curtime.get(ChronoField.MINUTE_OF_HOUR));
        
        // 현재 초만 출력
        System.out.println(curtime.get(ChronoField.SECOND_OF_MINUTE));
        
        // 현재에 +3년, -4월, +2일, +4시간, -30분, +10초 더해서 출력하시오. "yyyy-MM-dd HH:mm:ss" 형태로 출력
        LocalDateTime n = LocalDateTime.now();
        
        n = n.plusYears(+3);
        n = n.minusMonths(4);
        n = n.plusDays(+2);
        n = n.plusHours(+4);
        n = n.minusMinutes(30);
        n = n.plusSeconds(+10);
        String s = n.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(s);
        
        // 다른함수
        LocalDateTime n2 = LocalDateTime.now();
        
        n2 = n2.plus(+3,ChronoUnit.YEARS);
        n2 = n2.minus(4,ChronoUnit.MONTHS);
        n2 = n2.plus(+2,ChronoUnit.DAYS);
        n2 = n2.plus(+4,ChronoUnit.HOURS);
        n2 = n2.minus(30,ChronoUnit.MINUTES);
        n2 = n2.plus(+10,ChronoUnit.SECONDS);
        String s2 = n2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(s2);
        
        
    }
    
}
