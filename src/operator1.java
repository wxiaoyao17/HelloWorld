import java.util.Scanner;

public class operator1 {
    public static void main(String[] args){
//        int a = 5;
//        int b = 6;
//        int c = 5;

//        System.out.println(a>b);  // false
//        System.out.println(a>=c); // true
//
//        System.out.println(a==b); // false
//        System.out.println(a!=b); // true

//        Scanner s = new Scanner(System.in);
//
//        int a = s.nextInt();
//        int b = s.nextInt();
//
//        if (a == b){
//            System.out.println("a==b");
//        }
//        else if (a < b){
//            System.out.println("a<b");
//        }
//        else{
//            System.out.println("a>b");
//        }

//        System.out.println(5&3);

//        int i1 = 2;
//        System.out.println((i1 == 1) & (i1++ == 2)); // & 即使左边是false，两边都会被运算，i1++执行，i1=3
//        System.out.println(i1);
//
//        int j1 = 2;
//        System.out.println((j1 == 1) && (j1++ == 2)); // && 左边是false，右边不会被运算，j1++不执行，j1=2
//        System.out.println(j1);

//        int i2 = 2;
////        System.out.println(i2++ == 2); // true
//        System.out.println((i2 == 2) | (i2++ == 2)); // | 即使左边是true，两边都会被运算，i2++执行，i2=3
//        System.out.println(i2);
//
//        int j2 = 2;
//        System.out.println((j2 == 2) || (j2++ == 2)); // || 左边是true，右边不会被运算，j2++不执行，j=2
//        System.out.println(j2);

//        boolean a = true;
//        boolean b = false;
//
////        System.out.println(!a);
//        System.out.println(a^b);
//        System.out.println(a^!b);
//        System.out.println(!a^b);

        int i = 1;
        boolean b = !(i++ == 3) ^ (i++ ==2) && (i++ ==3);
        //             !false   ^    true     &&左边为false，后面不执行
        System.out.println(b);
        System.out.println(i);
    }
}
