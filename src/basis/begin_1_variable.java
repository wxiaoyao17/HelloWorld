package basis;

public class begin_1_variable {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        long val = 26L;
//        int decVal = 26;
//        int hexVal = 0x1a;
//        int oxVal = 032;
//        int binVal = 0b11010;
//        System.out.println(decVal);
//
//        float f1 = 123.4F;
//        double d1 = 123.4;
//        double d2 = 1.234e2;
//        System.out.println(d2);
//
//        String name = "盖伦";
//        char a = 'c';

//        char tab = '\t';    // 制表符
//        char carriageReturn = '\r'; // 回车
//        char newLine = '\n';    // 换行
//        char doubleQuote = '\"';    // 双引号
//        char singleQuote = '\'';    // 单引号
//        char backslash = '\\';  // 反斜杠
//        System.out.println(backslash);

//        byte b = 12;
//        short s = 256;
//        int i = 1234;
//        long l = 1234L;
//        float f = 12.34F;
//        double d = 123.456;
//        char c = 'x';
//        String str = "中国";
//
//        c = (char) s;
////        s = c;    // can't convert directly
//        System.out.println(c);

        long l = 50L;
        int i = 50;
        l = (long) i;   // 低精度向高精度转换

        // 高精度向低精度转换
        byte b = 5;
        int i1 = 10;
        int i2 = 0b100000001;
        b = (byte) i1;
        System.out.println(b);
        b = (byte) i2;  // 强制转换，丢失最高位的1
        System.out.println(b);
        System.out.println(Integer.toBinaryString(i2));

        int a$d12 = 5;
        int $ab12 = 10;
//        int 123$a = 15;
    }
}
