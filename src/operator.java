import java.util.Scanner;

public class operator {
    public static void main(String[] args){
//        Scanner s = new Scanner(System.in);
//        int a = s.nextInt();
//        System.out.println("first:"+a);
//        int b = s.nextInt();
//        System.out.println("second:"+b);

//        float c = s.nextFloat();
//        System.out.println("third::"+c);

//        String nr = s.nextLine();   // 读取回车换行\r\n
//        String d = s.nextLine();
//        System.out.println("fourth:"+d);

//        int a = 5;
//        long b = 6;
//        int c = (int) (a+b);    // a+b为long
//        long d = a+b;

//        byte a = 1;
//        byte b = 2;
//        byte c = (byte)(a+b); // a+b是int
//        int d = a+b;

//        System.out.println(b++);
//        System.out.println(b);
//        System.out.println(++b);

//        int i = 1;
//        int j = ++i + i++ + ++i + ++i + i++; // ++前置
//        System.out.println(j);  // 2 + 2 + 4 + 5 + 5
//        System.out.println(i);  // 2 2(+1) 4   5   5(+1)
        Scanner s = new Scanner(System.in);
        float hight = s.nextFloat();
        System.out.println("hight:"+hight);
        float weight = s.nextFloat();
        System.out.println("weight:"+weight);
        float bmi = weight/(hight*hight);
        System.out.println("bmi:"+bmi);

        if (bmi<18.5)
            System.out.println("体重过轻");
        else if ((bmi>=18.5) && (bmi<24))
            System.out.println("正常范围");
        else if ((bmi>=24) && (bmi<27))
            System.out.println("体重过重");
        else if ((bmi>=27) && (bmi<30))
            System.out.println("轻度肥胖");
        else if ((bmi>=30) && (bmi<35))
            System.out.println("中度肥胖");
        else if (bmi>=35)
            System.out.println("重度肥胖");
        else
            System.out.println("error");
    }
}
