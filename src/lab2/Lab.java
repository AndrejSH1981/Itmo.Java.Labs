package lab2;

import java.util.Scanner;

class lab2 {

    //ввод чисел доубле только через точку(.)

    public static void main(String[] args) {
        System.out.println("2.1-calculator");


        long num103 = 0;
        long num123 = 0;


        Scanner in = new Scanner(System.in);
        System.out.println("input num1");
        String x1 = in.nextLine();
        int num101 = 0;
        double num102 = 0;
        long num101l = 0;

        boolean workint1 = false;
        boolean workint2 = false;
        boolean workdouble1 = false;
        boolean workdouble2 = false;
        boolean worklong1 = false;
        boolean worklong2 = false;

        if (x1.matches("^\\d+(\\,\\d+)?")) {
            num101l = Long.valueOf(x1);
        }

        if ((x1.matches("^\\d+(\\,\\d+)?")) && ((num101l < 2147483647) && (num101l > -2147483648))) {
            //it is INT

            System.out.println("it is INT");
            System.out.println(x1);
            num101 = Integer.valueOf(x1);
            workint1 = true;

        } else if ((((x1.matches("^\\d+(\\,\\d+)?")) && ((num101l > 2147483647)) || (num101l < -2147483648)) && (workint1 == false))) {

            //it is LONG
            num101 = 0;
            System.out.println("it is LONGE");
            worklong1 = true;
            workint1 = false;
        } else {
            // it is DOUBLE0

            num102 = Double.valueOf(x1);
            num103 = 0;
            System.out.println("it is DOUBLE0");
            workdouble1 = true;
            workint1 = false;
        }

        Scanner in2 = new Scanner(System.in);
        System.out.println("input num2");
        String x2 = in2.nextLine();

        int num121 = 0;
        double num122 = 0;
        long num121l = 0;
        if (x2.matches("^\\d+(\\,\\d+)?")) {
            num121l = Long.valueOf(x2);
        }


        System.out.println("input num2");
        if (((x2.matches("^\\d+(\\,\\d+)?")) && ((num121l < 2147483647) && (num121l > -2147483648))) && workint1 == true) {
            //it is INT
            System.out.println("it is INT");

            num121 = Integer.valueOf(x2);

            workint2 = true;


        } else if ((((x2.matches("^\\d+(\\,\\d+)?")) && ((num121l > 2147483647) || (num121l < -2147483648) || (worklong1 == true)) && (workint2 == false)) && workdouble1 == false)) {

            num123 = Long.valueOf(x2);
            //it is LONG

            num103 = Long.valueOf(x1);
            num101 = 0;
            System.out.println("it is LONGE");
            worklong2 = true;
            workint2 = false;
            worklong1 = true;
            workint1 = false;
        } else {
            // it is DOUBLE1
            System.out.println("it is DOUBLE1");

            num122 = Double.valueOf(x2);

            num102 = Double.valueOf(x1);
            num101 = 0;
            num121 = 0;
            num103 = 0;
            num123 = 0;


            workdouble1 = true;
            workdouble2 = true;
            workint1 = false;
            workint2 = false;
            worklong1 = false;
            worklong2 = false;
        }


        char operation = getOperation();

        boolean printint = false;
        boolean printdouble = false;
        boolean printlong = false;

        new Calculator();

        if (workint1 == true && workint2 == true) {
            new Calculator().calcint(num101, num121, operation);

            System.out.println("int");
            int result =  new Calculator().calcint(num101, num121, operation);
            System.out.println(result);
            printint = true;
            printdouble = false;
            printlong = false;

        }

        if (workdouble1 == true && workdouble2 == true) {
            new Calculator().calcdouble(num102, num122, operation);

            System.out.println("double");
            double result2 =  new Calculator().calcdouble(num102, num122, operation);
            System.out.println(result2);
            printint = false;
            printdouble = true;
            printlong = false;
        }

        if (worklong1 == true && worklong2 == true) {
            new Calculator().calclong(num103, num123, operation);

            System.out.println("long");
            long result3 =  new Calculator().calclong(num103, num123, operation);
            System.out.println(result3);
            printint = false;
            printdouble = false;
            printlong = true;
        }


        if (printint == true || printdouble == true || printlong == true) {

            //2.2 ---для второго задания
            double a = 0;
            double b = 0;
            double c = 0;
            double d = 0;

            Scanner in10 = new Scanner(System.in);
            System.out.println("2.2-Input sides of the triangle");
            a = in10.nextDouble();
            b = in10.nextDouble();
            c = in10.nextDouble();
            d = in10.nextDouble();





            new Rectangle(a, b, c, d);
            new Rectangle();

            //2.2 ---для второго задания
        }


    }

    static char getOperation() {
        System.out.println("Input operation:");
        Scanner scanner = new Scanner(System.in);
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error, this is not operation");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
}

class Calculator{
    static int calcint(int num101, int num121, char operation) {

        int result;
        double result2;

        switch (operation) {
            case '+':
                result = num101 + num121;
                break;
            case '-':
                result = num101 - num121;
                break;
            case '*':
                result = num101 * num121;
                break;
            case '/':
                result = num101 / num121;
                break;

            default:

                System.out.println("Operation not recognized");
                result = calcint(num101, num121, new lab2().getOperation());

        }
        return result;

    }

    static double calcdouble(double num102, double num122, char operation) {
        double result2;

        switch (operation) {
            case '+':
                result2 = num102 + num122;
                break;
            case '-':
                result2 = num102 - num122;
                break;
            case '*':
                result2 = num102 * num122;
                break;
            case '/':
                result2 = num102 / num122;
                break;

            default:
                //return3 = 5;
                System.out.println("Operation not recognized");
                result2 = calcdouble(num102, num122, new lab2().getOperation());
                //System.out.println(result2);
        }
        return result2;

    }

    static long calclong(long num103, long num123, char operation) {
        long result3;

        switch (operation) {
            case '+':
                result3 = num103 + num123;
                break;
            case '-':
                result3 = num103 - num123;
                break;
            case '*':
                result3 = num103 * num123;
                break;
            case '/':
                result3 = num103 / num123;
                break;

            default:
                //return3 = 5;
                System.out.println("Operation not recognized");
                result3 = calclong(num103, num123, new lab2().getOperation());
                //System.out.println(result2);
        }
        return result3;
    }

}
class Rectangle{


    double a = 0;
    double b = 0;
    double c = 0;
    double d = 0;





    public Rectangle(){
        a=10;
        b=10;
        c=10;
        d=10;
        System.out.println("-sides of the rectangle from the constructor, without parameters:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    ;
    public  Rectangle(double aa, double bb, double cc, double dd){

        this.a = aa;
        this.b = bb;
        this.c = cc;
        this.d = dd;

        System.out.println("-sides of the rectangle from the constructor with parameters:");
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);

    }

}


