package java18;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex18_07_Calendar {
    
    public static void main(String[] args) {
        
        Calendar d = Calendar.getInstance();
        System.out.println(d);

        
        // 현재에 +3년, -4월, +2일 더해서 출력하시오. "yyyy-MM-dd" 형태로 출력
        d.set(Calendar.YEAR, d.get(Calendar.YEAR)+3);
        d.set(Calendar.MONTH, d.get(Calendar.MONTH)-4);
        d.set(Calendar.DATE, d.get(Calendar.DATE)+2);
        
        SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = tf.format(d.getTime());
        System.out.println(formatted);
        
        // 현재에 +4시간, -30분, +10초 더해서 출력하시오. "HH:mm:ss" 형태로 출력
        d.set(Calendar.HOUR, d.get(Calendar.HOUR)+3);
        d.set(Calendar.MINUTE, d.get(Calendar.MINUTE)-30);
        d.set(Calendar.SECOND, d.get(Calendar.SECOND)+10);
        
        tf = new SimpleDateFormat("HH:mm:ss");
        formatted = tf.format(d.getTime());
        System.out.println(formatted);
    }
    
}
