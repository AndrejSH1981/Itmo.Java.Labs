package lab5;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class lab5 {

    public static void main(String[] args) {

        lab51();//1
        lab52();//2
        lab53();//3
        lab54();//4
        lab55();//5

    }


    public static void lab51(){
        System.out.println("\n//1");
        Scanner in1 = new Scanner(System.in);

        String text = in1.nextLine();
        String[] words = text.trim().split("\\W+");
        int maxLength = 0;
        List<String> maxWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxWords.clear();
                maxWords.add(word);
            } else if (word.length() == maxLength) {
                maxWords.add(word);
            }
        }

        System.out.println("of the longest word:");
        for (String maxWord : maxWords) {
            System.out.println(maxWord);
        }




    }

    public static void lab52(){

        System.out.println("\n//2");
        System.out.print("Input word to check for palindrome : ");
        Scanner in2 = new Scanner(System.in);
        String x = in2.nextLine();
        char[] charArray= x.toCharArray();
        int[] length = new int[charArray.length];
        int n = 0;
        for(int i = 0; i < charArray.length; i++)
        {

            if(charArray[i] == (charArray[charArray.length-1-i])) {

                n = n + 1;
            }
        }
        if (n == charArray.length) {
            System.out.println("String is a palindrome.");
        }
        else {
            System.out.println("String is not a palindrome.");
        }
        System.out.println("word lenght:" + charArray.length);
        System.out.println("coincidences:" + n);

    }




    public static void lab53(){
        System.out.println("\n//3");
        System.out.print("enter a string with the words byaka : ");
        Scanner proposal = new Scanner(System.in);
        String text = proposal.nextLine();
        String text2 = text.replaceAll("byaka", "/hidden by censorship/");
        //text2 = text2.replaceAll("byaka","/hidden by censorship/");
        System.out.println("after censorship:" + text2);

    }

    public static void lab54() {
        System.out.println("\n//4");
        Scanner x = new Scanner(System.in);
        String text = x.nextLine();

        Scanner x2 = new Scanner(System.in);
        String text2 = x2.nextLine();

        char[] charArray = text.toCharArray();

        char[] charArray2 = text2.toCharArray();

        int n = 0;
        int n1 = 0;
        int ni = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray2[ni]) {
                n = 0;
                ni = 0;
            }
            if (charArray[i] == charArray2[ni]) {
                n = n + 1;
                ni = ni + 1;
            }
            if (n == charArray2.length) {
                n1 = n1 + 1;
                ni = 0;
            }
            if (i == charArray.length - 1) {
                System.out.println("by entering a substring string:" + n1);
            }
        }
    }
    public static void lab55() {
        System.out.println("\n//5");
        String text = "Sample Output: \n The given string is: \n This is a test string \n The string reversed word by word is: \n sihT si a tset gnirts ";
        System.out.println(text);

        char[] charArray = text.toCharArray();

        String probel = " ";
        char[] charArray2 = probel.toCharArray();
        String dvoetochie = ":";
        char[] charArray5 = dvoetochie.toCharArray();

        int u = charArray.length;
        char[] charArray3 = new char[u];

        int u1 = 0;
        int n = 0;
        int y = 0;
        int y3 = 0;
        int r1 = 0;

        String str = "";
        String str3 = "";
        int r = 0 ;
        for (int i = 0; i < charArray.length; i++) {

            if ((charArray[i] != charArray2[n]) && (charArray[i] != charArray5[n]))
            {

                r1=r1+1;
                y = y + 1;

            }
            else {
                u1 = r1;
                u1 = charArray.length;
                charArray3 = new char[u1];
                for (r = 0; r < r1; r++) {
                    y3 = y - r;
                    charArray3[r] = charArray[y3-1];
                    if (charArray[i] == charArray5[n]){
                        charArray3[i] = charArray5[n];
                    }
                }
                str = String.valueOf(charArray3);
                str3 = str3+" "+str;
                str =null;
                y =y+1;
                r1=0;
            }
        }
        System.out.println("Begin--- - - - - - ---//\n"+str3+"\n//---- - - - - ---The end");

    }

}
