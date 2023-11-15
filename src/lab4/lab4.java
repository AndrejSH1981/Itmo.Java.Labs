package lab4;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;


class Main {

    public static void main(String[] args) {



        num1();//1.1
        num2();//1.2
        num3();//1.3
        num4();//1.4
        num5();//1.5 and 1.6
        num22();//2.1



    }
    //1.1
    public static void num1() {
        System.out.println("//1.1\n");
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //1.2
    public static void num2() {
        System.out.println("\n//1.2");
        System.out.print("\ndivision by 3:       ");
        for (int n = 1; n <= 99; n++) {
            if (n % 3 == 0)
                System.out.print(n + ", ");
        }

        System.out.print("\ndivision by 5:       ");
        for (int n = 1; n <= 99; n++) {
            if (n % 5 == 0) System.out.print(n + ", ");
        }
        System.out.println("");
        System.out.print("division by 3 & 5:   ");
        for (int n = 1; n <= 99; n++) {
            if (n % 3 == 0 && n % 5 == 0) System.out.print(n + ", ");
        }

    }

    //1.3
    public static void num3() {
        System.out.println("\n//1.3");
        Scanner in1 = new Scanner(System.in);
        System.out.print("input number one: ");
        int x = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.print("input number two: ");
        int y = in2.nextInt();
        System.out.print("input number three: ");
        Scanner in3 = new Scanner(System.in);
        int z = in3.nextInt();


        System.out.println("result: " + result3(x, y, z));
    }

    public static boolean result3(int x1, int y1, int z1) {
        boolean chislobool = false;
        if ((x1 + y1) == z1) {
            chislobool = true;
        } else {
            chislobool = false;
        }
        return chislobool;


    }

    //1.4
    public static void num4() {
        System.out.println("\n//1.4");
        System.out.print("Input number one : ");
        Scanner in1 = new Scanner(System.in);
        int x = in1.nextInt();
        System.out.print("Input number two : ");
        Scanner in2 = new Scanner(System.in);
        int y = in2.nextInt();
        System.out.print("Input number three : ");
        Scanner in3 = new Scanner(System.in);
        int z = in3.nextInt();

        System.out.println("result: " + result4(x, y, z));
    }

    public static boolean result4(int x1, int y1, int z1) {
        boolean chislobool = false;

        if ((z1 > y1 && y1 > x1)) {
            chislobool = true;
        } else {
            chislobool = false;
        }

        return chislobool;
    }

    //1.5 массив передаётся в задание 2.1
    public static void num5() {
        System.out.println("\n//1.5");
        System.out.print("Input razmer array : ");
        Scanner in1 = new Scanner(System.in);
        int u = in1.nextInt();

        int[] array_chislo = new int[u];

        System.out.print("Input all array : ");
        Scanner in2 = new Scanner(System.in);

        for (int i = 0; i < array_chislo.length; i++) {
            String x = in2.nextLine();
            String s = x;
            array_chislo[i] = Integer.parseInt(s);

            if (i >= 9) {
                for (int n = 0; n < array_chislo.length; n++) {
                    System.out.print("all array:" + array_chislo[n] + ";");
                }

            }
//1.6

            if (array_chislo[i] == 1) {
                System.out.println("//1.6\nfound the number 1\n//1.6");
            }

            if (array_chislo[i] == 3) {
                System.out.println("//1.6\nfound the number 3\n//1.6");
            }

        }
        System.out.println("checking the input of the number of the first or last element of an array of integers : ");
        Scanner in3 = new Scanner(System.in);
        int c = in3.nextInt();
        System.out.println("result verification:" + (array_chislo[0] == c && array_chislo[array_chislo.length - 1] == c));

        num21(array_chislo);

    }


//2.1

    public static void num21(int[] array_chislo) {
        System.out.println("\n//2.1");
        int n = 0;
        for (int i = 1; i < array_chislo.length; i++) {

            if (array_chislo[i] > array_chislo[i-1]) {
                n=n+1;}
        }
        String f = Arrays.toString(array_chislo);
        System.out.println(f);
        if (n == array_chislo.length-1) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }

    }
    //2.2 массив передаётся в следующее задание
    public static void num22() {
        System.out.println("\n//2.2");

        System.out.println("Input Array length : ");
        Scanner in1 = new Scanner(System.in);
        int u = in1.nextInt();

        System.out.print("Input Numbers of array : ");
        Scanner in2 = new Scanner(System.in);

        int[] array_chislo = new int[u];

        for (int i = 0; i < array_chislo.length; i++) {
            String x = in2.nextLine();
            String s = x;
            array_chislo[i] = Integer.parseInt(s);

        }
        String f = Arrays.toString(array_chislo);
        System.out.println("Result:" + f);
        num23(array_chislo);
    }
    //2.3
    public static void num23(int[] array_chislo) {
        System.out.println("\n//2.3");

        String f = Arrays.toString(array_chislo);
        System.out.println(f);

        int y = 0;
        int u = 0;
        u = array_chislo.length;
        y = array_chislo[0];
        array_chislo[0] = array_chislo[u-1];
        array_chislo[u-1] = y;
        String f1 = Arrays.toString(array_chislo);
        System.out.println(f1);

        num24();
    }


    //2.4
    public static void num24() {
        System.out.println("\n//2.4");
        int n = 0;

        System.out.println("Input Array length : ");
        Scanner in1 = new Scanner(System.in);
        int u = in1.nextInt();

        System.out.print("Input Numbers of array : ");
        Scanner in2 = new Scanner(System.in);

        int[] array_chislo = new int[u];

        for (int i = 0; i < array_chislo.length; i++) {
            String x = in2.nextLine();
            String s = x;
            array_chislo[i] = Integer.parseInt(s);

        }
        String f = Arrays.toString(array_chislo);
        System.out.println("Result:" + f);


        int n1 = 0;
        for (int i1 = 0; i1 < array_chislo.length; i1++) {
            n1 = 0;
            for (int j = 0; j < array_chislo.length; j++) {
                if (array_chislo[i1] != array_chislo[j] && i1 != j) {
                    n1 = n1 + 1;
                }
            }

            if ((n1) == (array_chislo.length - 1)) {
                System.out.println("result ferst unicum numer:" + array_chislo[i1]);
                break;
            }

        }
        sortarray();//2.5
    }


    //2.5
    public static void sortarray()
    {        System.out.println("\n//2.5");
        int[] array1 = new int[12];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int) (Math.random() * 100) - 0);

        }
        String f = Arrays.toString(array1);
        System.out.println("Result:" + f);

        int[] result = mergesort(array1);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergesort(int[] array1) {
        int[] Arraybuffer1 = Arrays.copyOf(array1, array1.length);

        int[] Arraybuffer2 = new int[array1.length];
        int[] result = mergesortInner(Arraybuffer1, Arraybuffer2, 0, array1.length);

        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        // массивы отсортированы
        int middle = startIndex + (endIndex - startIndex) / 2;
        // System.out.println("=====:" + middle );
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle);

        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex);

        // слияние массивов
        int Arrayindex1 = startIndex;
        int Arrayindex2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;

        while (Arrayindex1 < middle && Arrayindex2 < endIndex) {
            result[destIndex++] = sorted1[Arrayindex1] < sorted2[Arrayindex2]
                    ? sorted1[Arrayindex1++] : sorted2[Arrayindex2++];
        }
        while (Arrayindex1 < middle) {
            result[destIndex++] = sorted1[Arrayindex1++];
        }
        while (Arrayindex2 < endIndex) {
            result[destIndex++] = sorted2[Arrayindex2++];
        }
        return result;
    }




}