package GITHUB;

import java.util.Scanner;

public class APRIL_17 {
    public static void main(String args[]){
    // char ch11='\u0061';
    // char ch12='\u0062';
    // char ch13='\u0063';
    // char ch14='\u0064';
    // System.out.println(ch11+""+ch12+""+ch13+""+ ch14);
    Scanner sc=new Scanner(System.in);
    System.out.println(sc instanceof Scanner);

    System.out.println("first name:");
    String firstName=sc.next();
    sc.nextLine();

    System.out.println("name:");
    String name = sc.nextLine();
    sc.nextLine();

    System.out.println("age:");
    int age = sc.nextInt();
    sc.nextLine();

    System.out.println("age:");
    String agee = sc.next();
    int MyAge=Integer.parseInt(agee);
    sc.nextLine();

    System.out.println("What is user address: ");
    String address = sc.nextLine();

    System.out.println("hi" + name +" "+firstName+" "+"age :"+age+"address"+address);

   // int ages;
   // Integer class => int MyAge=Integer.parseInt(agee);

                                        // OPERATOR
        int op1=10;
        int x1=op1++;
        int x2=op1--;
        int x3=++op1;
        int x4=--op1;
        boolean correct= true;
        int val1=10;
        int val2=-10;
        boolean val3= true;
        boolean val4= true;
        boolean val5= false;
        boolean val6= false;
        int val7=10;



        System.out.println(x1+""+x2+""+x3+""+x4+""+x1+"");
        System.out.println(correct);
        System.out.println(!correct);
        System.out.println(~val1); // => -(val1+1) => -11
        System.out.println(~val2); // => -(val2+1) => 9
        System.out.println(10/3);
        System.out.println(10.0/3);
        System.out.println(10/3.0);
        System.out.println(10==10);
        System.out.println(10!=10);
        System.out.println(val3 && val4);
        System.out.println(val3 || val4);
        System.out.println(val7);
        val7++; // => val7=val7+10;
        System.out.println(val7);
        
        int x11=5;
        int x22=(27+40)-x11++*5/2+9%100;
        System.out.println(x22);



        // ternory operator
        // DataType VarName = (condition) ? (If condition is correct):(If condition is wrong)

        boolean res=(2>5)?(true):(false);
        System.out.println(res);

        // shift operator:-

        // 0110001111>>2
        // 0001100011

        // 0110001111<<2
        // 1000111100

    sc.close();
    }
}
