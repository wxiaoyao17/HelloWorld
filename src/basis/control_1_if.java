package basis;

import java.util.Scanner;

public class control_1_if {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();

        // 闰年判断
        if (((i%4 == 0) && (i%100 != 0)) || (i %400 == 0)){
            System.out.println(i + "是闰年");
        } else{
            System.out.println(i + "非闰年");
        }
    }
}
