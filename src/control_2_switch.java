import java.util.Scanner;

public class control_2_switch {
    public static void main(String[] args){
        int day = 7;
        Scanner s = new Scanner(System.in);

        int month = s.nextInt();

        // use if else
        if (day == 1)
            System.out.println("星期一");
        else if (day == 2)
            System.out.println("星期二");
        else if (day == 3)
            System.out.println("星期三");
        else if (day == 4)
            System.out.println("星期四");
        else if (day == 5)
            System.out.println("星期五");
        else if (day == 6)
            System.out.println("星期六");
        else if (day == 7)
            System.out.println("星期天");
        else
            System.out.println("error!");

        // use switch case
        switch (day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
                default:
                System.out.println("error!");
                break;
        }

        // ex1: judge seasons
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("Spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Winter");
                break;
                default:
                    System.out.println("Error!");
                    break;
        }

        //
    }
}
