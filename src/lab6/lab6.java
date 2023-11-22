package lab6;
import java.util.Scanner;

public class lab6 {

    public static void main(String[] args) {
        System.out.println("//1");
        new Proverka().proverka();
        System.out.println("//3");
        new Proverka3().proverka3();
        System.out.println("//4");
        new Proverka4().proverka4();
        System.out.println("//6");
        new proverka5().proverka5();

    }

}

abstract class Men {
    private String firstName;
    private String lastName;

    public Men(String firstName, String lastName) {
        //System.out.println("//class Peron");
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public abstract void displayInfo();
}

class Client extends Men{
    private String bankName;

    public Client(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }
    @Override
    public void displayInfo() {
        System.out.print("\nClient Information--");
        System.out.print("Name: " + getFirstName() + " " + getLastName());
        System.out.print(", Bank: " + bankName);
    }
}

class BankEmployee extends Men {
    private String bankName;

    public BankEmployee(String firstName, String lastName, String bankName) {
        super(firstName, lastName);
        this.bankName = bankName;
    }
    @Override
    public void displayInfo() {
        System.out.println("\nBank Employee Information: ");
        System.out.print("Name: " + getFirstName() + " " + getLastName());
        System.out.print(", Bank: " + bankName + "\n");
    }
}

//--2
class Proverka{
    public void proverka()

    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter client's first name: ");
        String clientFirstName = scanner.nextLine();

        System.out.print("Enter client's last name: ");
        String clientLastName = scanner.nextLine();

        System.out.print("Enter bank name: ");
        String clientBankName = scanner.nextLine();

        Client client = new Client(clientFirstName, clientLastName, clientBankName);
        client.displayInfo();


        System.out.println("\nEnter bank employee's first name: ");
        String employeeFirstName = scanner.nextLine();

        System.out.print("Enter bank employee last name: ");
        String employeeLastName = scanner.nextLine();

        System.out.print("Enter bank name: ");
        String employeeBankName = scanner.nextLine();

        BankEmployee bankEmployee = new BankEmployee(employeeFirstName, employeeLastName, employeeBankName);
        bankEmployee.displayInfo();

    }
}
//--3
class Car {
    public int weight;
    public String model;
    public char color;
    public float speed;

    public void outPut() {
        System.out.println("The weight of the: " + model + " is: " + weight + "(kg.)");
        System.out.println("The car's color is: " + color + " and its speed is: " + speed + "(km/h)");
    }
    public Car(int weight, String model, char color, float speed) {
        System.out.print("*********");

        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
        outPut();
    }
    public Car() {}
}
class Truck extends Car {
    public int numberOfWheels;
    public int maxWeight;

    public Truck(int weight, String model, char color, float speed, int numberOfWheels, int maxWeight) {
        super(weight, model, color, speed);
        this.numberOfWheels = numberOfWheels;
        this.maxWeight = maxWeight;
    }
    public void displayInfo() {
        System.out.print("Car additional iformation:");
        System.out.println("numberOfWheels:" + numberOfWheels + ", maxWeight:" + maxWeight);

    }
}
class Proverka3{
    public void proverka3()

    {
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter weight(kg)(int): ");
        int truckweight = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter model(string): ");
        String truckmodel = scanner4.nextLine();

        Scanner scanner5 = new Scanner(System.in);
        System.out.print("Enter color(string): ");
        char truckcolor = scanner5.next().charAt(0);

        Scanner scanner6 = new Scanner(System.in);
        System.out.print("Enter speed(km/h)(int): ");
        float truckspeed = scanner6.nextFloat();

        Scanner scanner7 = new Scanner(System.in);
        System.out.print("Enter numberOfWheels(int): ");
        int trucknumberOfWheels = scanner7.nextInt();

        Scanner scanner8 = new Scanner(System.in);
        System.out.print("Enter maxWeight(int): ");
        int truckmaxWeight = scanner8.nextInt();

        Truck truck = new Truck(truckweight, truckmodel, truckcolor, truckspeed, trucknumberOfWheels, truckmaxWeight);
        new Car();
        truck.displayInfo();
    }
}


//--4
class MClass {
    int number;

    public void setNumber() {
        System.out.print(number);
    }
}
class SubClass extends MClass {

    public void SubClass() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numer: ");
        super.number = scanner.nextInt();

        System.out.print("\nNumber: ");
    }
}
class SubClass1 extends MClass {
    public void SubClass1() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter numer: ");
        super.number = scanner.nextInt()-1;

        printNumber();
    }
    public void printNumber() {
        System.out.print("\nNumber: ");
    }
}
class Proverka4{
    public void proverka4()
    {
        SubClass subClass = new SubClass();
        subClass.SubClass();
        subClass.setNumber();
        
        SubClass1 subClass1 = new SubClass1();
        subClass1.SubClass1();
        subClass1.setNumber();
    }
}

//--5
class MClass5 {
    String age;
    public void getUserAge() {
        System.out.println(age);
    }
}

class SubClass5 extends MClass5 {
    String name;
    @Override
    public void getUserAge() {
        
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter age: ");
        super.age = scanner1.nextLine();
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner2.nextLine();
        super.getUserAge();
        System.out.println("Age: " + super.age + ", Name: " + name);

    }
}
class proverka5 {
    public void proverka5() {
        SubClass5 sub = new SubClass5();
        sub.getUserAge();
    }
}
