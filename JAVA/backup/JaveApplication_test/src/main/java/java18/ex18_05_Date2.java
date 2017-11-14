package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex18_05_Date2 {
    
    public static void main(String[] args) {

        Date now = null; 
        now = new Date();
        
        //현재 날짜와 시간 출력
        
        SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fo2 = fo.format(now);
        System.out.println(fo2);
        // 현재 연도만 출력        
        fo = new SimpleDateFormat("yyyy");
        fo2 = fo.format(now);
        System.out.println(fo2);
        
        // 현재 월만 출력
        fo = new SimpleDateFormat("MM");
        fo2 = fo.format(now);
        System.out.println(fo2);
        
        // 현재 일만 출력
        fo = new SimpleDateFormat("dd");
        fo2 = fo.format(now);
        System.out.println(fo2);
        
        // 현재 시간만 출력
        fo = new SimpleDateFormat("HH");
        fo2 = fo.format(now);
        System.out.println(fo2);
        
        // 현재 분만 출력
        fo = new SimpleDateFormat("mm");
        fo2 = fo.format(now);
        System.out.println(fo2);
        
        // 현재 초만 출력
        fo = new SimpleDateFormat("ss");
        fo2 = fo.format(now);
        System.out.println("ss"+fo2);
        
        
        // 현재에 +3년, -4월, +2일 더해서 출력하시오.
        Date date = new Date();
        date.setYear(date.getYear()+3);
        date.setMonth(date.getMonth()-4);
        date.setDate(date.getDate()+2);
        
        fo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fo2 = fo.format(date);
        System.out.println(fo2);
        
        // 현재에 +4시간, -30분, +10초 더해서 출력하시오
        date.setHours(date.getHours()+4);
        date.setMinutes(date.getMinutes()-30);
        date.setSeconds(date.getSeconds()+10);
        fo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fo2 = fo.format(date);
        String fonow = fo.format(now);
        System.out.println("now : "+fonow);
        System.out.println("변경 : "+fo2);
        
        
    }
    
}
