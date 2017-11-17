package java06;

public class jv06_02_왜메서드를쓰는가 {
    
    public static int getsum(int start, int end) {
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        
        return sum;
        
    }
    
    public static void main(String[] args) {
        
        // 1부터 10까지의 합계를 구하고
        // 그 합계를 sum에 저장하고 sum의 값을 출력한다.
        int sum = getsum(1, 10);
        System.out.println("1부터 10까지의 합계 : " + sum);
        
        // 1부터 100까지의 합계를 구하고
        // 그 합계를 sum2에 저장하고 sum2의 값을 출력한다.
        int sum2 = getsum(1, 100);
        
        System.out.println("1부터 100까지의 합계 : " + sum2);
        
        // 100부터 sum2까지의 합계를 구하고
        // 그 합계를 sum3에 저장하고 sum3의 값을 출력한다.
        int sum3 = getsum(100, sum2);
        
        System.out.println("1부터 100까지의 합계 : " + sum3);
        
    }
}
