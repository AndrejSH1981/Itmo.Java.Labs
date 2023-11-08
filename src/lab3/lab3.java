package lab3;

import java.time.Year;
import java.util.Scanner;

//1
class JavaProgram {
    public static void main(String[] args) {
        //TODO
        System.out.println("3.1");
        String course = "leane Java - its easy!";
        Study study = new Study(course);
        System.out.println(study.printCourse());


//для 2 задания

        Simple.car();
//для 3 задания
        new Home3().sethome();
//для 4 задания
        new Tree();

        int agetree = 0;
        boolean lifetree = false;
        String nametree = null;


        Tree tree1 = new Tree(agetree, nametree);
        new Tree(agetree, lifetree, nametree);
        new Tree();


    }
}

class Study {

    private String course;
    //TODO
    public  Study(String course1){
        this.course = course1;
    }

    public String printCourse() {
        return this.course;
    }
}


class Simple {
    String name;
    String color;
    int weight;

    public static void car (){
        System.out.println("\n");
        System.out.println("3.2");

        Simple simpleOne = new Simple();
        Simple simpleTwo = new Simple();

        simpleOne.name = "dodge";
        simpleOne.color = "yelloy";
        simpleOne.weight = 950;

        simpleTwo.name = "wv";
        simpleTwo.color = "red";
        simpleTwo.weight = 850;

        System.out.println("input 1,2,3,11,22,33:");
        Scanner in1 = new Scanner(System.in);
        int x1 = in1.nextInt();
        if (x1 == 1){
            new Simple(simpleOne.color);
        }
        if (x1 == 2){
            new Simple(simpleOne.color, simpleOne.weight);
        }
        if (x1 == 3){
            new Simple();
        }
        if (x1 == 11){
            new Simple(simpleTwo.color);
        }
        if (x1 == 22){
            new Simple(simpleTwo.color, simpleTwo.weight);
        }
        if (x1 == 33){
            new Simple();
        }

    }

    public Simple(String color){
        this.color = color;
        SimpleMetod();
    }
    public Simple(String color, int weight){
        this.color = color;
        this.weight = weight;
        SimpleMetod();
    }

    public Simple(){

        SimpleMetod();
    }

    public void SimpleMetod(){
        System.out.println("name car: " + name);
        System.out.println("color car: " + color);
        System.out.println("weight car: " + weight);
    }

}
//3

class Home3 {

    int flors;
    int earebuild;
    String name;

    int currentYear = Year.now().getValue();

    public void sethome() {

        Home3 home1 = new Home3();
        System.out.println("\n");
        System.out.println("3.3");
        System.out.println("----enter the house's characteristics1");

        Scanner in1 = new Scanner(System.in);
        System.out.println("set flors");
        flors = home1.flors = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("set year of construction");
        earebuild = home1.earebuild = in2.nextInt();
        Scanner in3 = new Scanner(System.in);
        System.out.println("set name");
        name = home1.name = in3.nextLine();

        printset();
        System.out.println("years built:" + dataoutbuild(currentYear, earebuild));


        Home3 home2 = new Home3();
        System.out.println("----enter the house's characteristics2");

        Scanner in4 = new Scanner(System.in);
        System.out.println("set flors");
        flors = home2.flors = in4.nextInt();
        Scanner in5 = new Scanner(System.in);
        System.out.println("set year of construction");
        earebuild = home2.earebuild = in5.nextInt();
        Scanner in6 = new Scanner(System.in);
        System.out.println("set name");
        name = home2.name = in6.nextLine();

        printset();

        System.out.println("years built:" + dataoutbuild(currentYear, earebuild));

    }

    public void printset() {
        System.out.println("flors:" + flors);
        System.out.println("year of construction:" + earebuild);
        System.out.println("name object:" + name);
    }

    public static int dataoutbuild(int currentYear, int earebuild){
        int dataoutbuild1 = currentYear - earebuild;
        //System.out.println(currentYear);
        return dataoutbuild1;
    }

}

class Tree{
    int agetree;
    boolean lifetree;
    String nametree;

    public Tree(int agetree,String nametree){
        System.out.println("\n");
        System.out.println("3.4");

        Scanner in10 = new Scanner(System.in);
        System.out.println("set agetree-");
        agetree = in10.nextInt();

        Scanner in11 = new Scanner(System.in);
        System.out.println("set nametree-");
        nametree = in11.nextLine();

        System.out.println(agetree);
        System.out.println(nametree);
    }

    public Tree(int agetree,boolean lifetree,String nametree){
        Scanner in10 = new Scanner(System.in);
        System.out.println("set agetree-");
        agetree = in10.nextInt();

        Scanner in11 = new Scanner(System.in);
        System.out.println("set lifetree(true-life or false-not life)-");
        lifetree = in11.nextBoolean();

        Scanner in12 = new Scanner(System.in);
        System.out.println("set nametree-");
        nametree = in12.nextLine();

        System.out.println("agetree" + agetree);
        System.out.println("lifetree" + lifetree);
        System.out.println("nametree" + nametree);
    }

    public Tree(){

        System.out.println("an empty constructor was triggered");


    }

}