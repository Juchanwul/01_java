package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ex18_05_Date {
    
    public static void main(String[] args) {

        Date now = null; 
        now = new Date();
        SimpleDateFormat tf = null;
        
        //현재 날짜와 시간 출력
        tf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fo2 = tf.format(now);
        System.out.println(fo2);
        
        // 현재 연도만 출력        
        System.out.println(now.getDate()); //-------> 117
        tf = new SimpleDateFormat("yyyy");
        System.out.println(tf.format(now)); //-------> 2017
        
        // 현재 월만 출력
        tf = new SimpleDateFormat("MM");
        System.out.println(tf.format(now));
        
        // 현재 일만 출력
        tf = new SimpleDateFormat("dd");
        System.out.println(tf.format(now));
        
        // 현재 시간만 출력
        tf = new SimpleDateFormat("HH");
        System.out.println(tf.format(now));
        
        // 현재 분만 출력
        tf = new SimpleDateFormat("mm");
        System.out.println(tf.format(now));
        
        // 현재 초만 출력
        tf = new SimpleDateFormat("ss");
        System.out.println(tf.format(now));
        
        
        // 현재에 +3년, -4월, +2일 더해서 출력하시오.
        Date date = new Date();
        date.setYear(date.getYear()+3);
        date.setMonth(date.getMonth()-4);
        date.setDate(date.getDate()+2);
        
        tf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(tf.format(date));
        
        // 현재에 +4시간, -30분, +10초 더해서 출력하시오
        date.setHours(date.getHours()+4);
        date.setMinutes(date.getMinutes()-30);
        date.setSeconds(date.getSeconds()+10);
        tf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        fo2 = tf.format(date);
        System.out.println("변경 : "+fo2);
        
        String fonow = tf.format(now);
        System.out.println("now : "+fonow);
        
        
        
    }

    
}
