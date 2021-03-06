package java18;

import java.text.SimpleDateFormat;
import java.util.Date;

public class jv18_05_Date {
    
    public static void main(String[] args) {
        
        Date date = null;
        date = new Date(114, 2 , 18); // 1900-01-01 --------->2014-03-18
        System.out.println("Date(114, 2, 18)>> "+ date);
        
        date = new Date(114, 0 , 18); // 1900-01-01 --------->2014-01-18
        System.out.println("Date(114, 0, 18)>> "+ date);
        
        date = new Date(114, 12 , 18); // 1900-01-01 --------->2015-01-18
        System.out.println("Date(114, 12, 18)>> "+ date);
        
        //날짜 출력 포맷 지정 하기 : SimpleDateFormat 클래스 사용
        Date from = new Date();
        SimpleDateFormat tf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //HH는 24시간 기준
        String fo2 = tf.format(from);
        System.out.println(fo2);
        
        tf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); //hh는 12시간 기준
        fo2 = tf.format(from);
        System.out.println(fo2);
                
        
        
        
        
        
    }
    
}
