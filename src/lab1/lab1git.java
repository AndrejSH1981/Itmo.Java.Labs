package lab1;
import java.util.Scanner;
public class lab1git {


    public static void main(String[] args) {

        // 1.
        System.out.println("Я\n" +
                "хорошо\n" +
                "знаю\n" +
                "Java.\n");

        // 2.
        System.out.println((46+10)*(10/3.0f));

        System.out.println((29)*(4)*(-15));

        // 3.
        int number = 10500;
        double result = 0;
        result = (number/10)/10;
        System.out.println(result);

        // 4.
        result = 0;
        result = (3.6*4.4*5.9);
        System.out.println(result);

        // 5.
        Scanner in = new Scanner(System.in);
        System.out.print("// 5.\n введите целое число №1: ");
        int num = in.nextInt();

        Scanner in2 = new Scanner(System.in);
        System.out.print("введите целое число №2: ");
        int num2 = in2.nextInt();

        Scanner in3 = new Scanner(System.in);
        System.out.print("введите целое число №2: ");
        int num3 = in.nextInt();

        System.out.printf("Введённое число №1: %d \n", num);
        System.out.printf("Введённое число №2: %d \n", num2);
        System.out.printf("Введённое число №3: %d \n", num3);


        // 6.
        //int b = scan.nextInt();


        System.out.print("// 6.\n Введите целое число b:");

        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        if(b % 2 == 0){System.out.println ("Чётное");}
        else{System.out.println ("Нечётное");}
        if(b%2 == 0 && b >= 101 ){System.out.println ("Выход за пределы диапазона");}

        System.out.println ("FIN lab1");

//---------------------------
        in.close();

    }
}