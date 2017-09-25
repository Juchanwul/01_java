package java06;

public class jv06_04_어떻게메서드를만드는가 {
    
    public static void main(String[] args) {
        
        // 1부터 10까지의 합계를 구하고
        // 그 합계를 sum에 저장하고 sum의 값을 출력한다.
        int sum = getsum(1,10);
        System.out.println(sum);
        
        // 1부터 100까지의 합계를 구하고
        // 그 합계를 sum2에 저장하고 sum2의 값을 출력한다.
        int sum2 = getsum(1,100);
        System.out.println(sum2);
        
        // 100부터 sum2까지의 합계를 구하고
        // 그 합계를 sum3에 저장하고 sum3의 값을 출력한다.
        int sum3 = 0;
        for (int k = 100; k <= sum2; k++) {
            sum3 = sum3 + k;
        }
        System.out.println(sum3);
    }

    public static int getsum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end ; i++) {
            sum = sum + i;
        }
        return sum;
    }
    
}
