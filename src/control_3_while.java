import java.util.Scanner;

public class control_3_while {
    public static void main(String[] args){
        // 打印0~4
//        int i = 0;
//        while (i<5){
//            System.out.println(i++);
//        }

        // do while, do中语句至少执行一次
//        int i = 0;
//        do{
//            System.out.println(i++);
//        } while(i<5);

        // ex1: 求N的阶乘
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int sum = n;
        while (n > 1){
            sum *= (--n);
        }
        System.out.println(sum);

    }
}
