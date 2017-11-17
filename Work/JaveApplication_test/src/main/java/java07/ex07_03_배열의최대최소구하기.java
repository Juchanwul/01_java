package java07;

public class ex07_03_배열의최대최소구하기 {
    
    public static void main(String[] args) {
        
        int[] arr = { 23, 96, 35, 42, 81, 19, 8, 77, 50, 64 };
        
        printArrayBef(arr);
        java.util.Arrays.sort(arr);
        printArrayAft(arr);
        
        maxmin(arr);
        
    }
    
    private static void maxmin(int[] arr) {
        System.out.println("최소값 : " + arr[0]);
        System.out.println("최대값 : " + arr[arr.length - 1]);
        
    }
    
    private static void printArrayBef(int[] x) {
        System.out.print("배열 정렬 전 : ");
        for (int i = 0; i <= x.length - 1; i++) {
            if (i == x.length - 1) {
                System.out.println(x[i] + ".");
            } else {
                System.out.print(x[i] + ", ");
            }
        }
        
    }
    
    private static void printArrayAft(int[] x) {
        System.out.print("배열 정렬 후 : ");
        for (int i = 0; i <= x.length - 1; i++) {
            if (i == x.length - 1) {
                System.out.println(x[i]+".");
            } else {
                System.out.print(x[i] + ", ");
            }
            
        }
        
    }
}
