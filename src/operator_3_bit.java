import java.util.Scanner;

public class operator_3_bit {
    public static void main(String[] args){
//        int i = 5;
//        String b = Integer.toBinaryString(i);
//        System.out.println(b); // 0b101
//
//        byte a = 0b00001000;
//        String c = Integer.toBinaryString(a);
//        System.out.println(c);
//        System.out.printf("%x", a);

////        byte i = 6;
////        byte i = 0b01111111;
//        int i = 0xffffffff;
//
//        System.out.println(i);
//        System.out.println(Integer.toBinaryString(i));
//
//        System.out.println(i<<1);
//        System.out.println(Integer.toBinaryString(i<<1));
//
//        System.out.println(i>>1);
//        System.out.println(Integer.toBinaryString(i>>1));
////        System.out.println(Integer.toBinaryString(i>>33));  // 33会被取模，等效于1

        // 符号位扩展
//        byte b = (byte)0x83;
//        short s1 = (short)b;            // 进行符号位扩展，前面补1
//        short s2 = (short)(b&0xff);     // 0xff是int，实际是0x0000 00ff
//        System.out.println(s1);
//        System.out.println(s2);
//        String b1 = Integer.toBinaryString(s1);
//        String b2 = Integer.toBinaryString(s2);
//        System.out.println(b1);
//        System.out.println(b2);

//        // 练习1
//        int i = 3;
//        int j = 2;
//        int c = ((i|j)^(i&j))<<2>>>1;
//        System.out.println(c);

//        // 练习2 赋值操作，从右边起执行
//        int i = 1;
//        i+=++i;
//        System.out.println(i); // 1+2=3

//        // 三元操作符 a?b:c
//        int i = 5;
//        int j = 6;
//        int k = i<j ? 99 : 88;
//        System.out.println(k);
//
//        // 相当于
//        if (i<j){
//            k = 99;
//        } else{
//            k = 88;
//        }
//        System.out.println(k);

        // 练习3 输入1-7 判断是工作日还是周末
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();
        String a = (i>5) ? "周末" : "工作日";
        System.out.println(a);
    }
}
