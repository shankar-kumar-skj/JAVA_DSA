package GITHUB;

import java.util.Scanner;

public class April_23 {
    public static void main(String[] args){

        April_23 obj=new April_23();

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Welcome! to my Calculator ");

        // take input from user and decide which operation to perform

    do{
        System.out.println("Choose an Operation : (*,+,-,%,/)");
        System.out.println("->");
        String input =sc.next();
        char ch=input.charAt(0);

        if(input.length()!=1){
            System.out.println("wrong input, please try again!");
        }
        else{
            obj.chooseOperation(ch);
        }
        boolean exit=obj.exitProgram();
        if (exit){
            break;
        }

    }while(true);        
    System.out.println("Thanks for using our app!!");
}

public boolean exitProgram(){

    Scanner sc=new Scanner(System.in);
    int times=0;
    int retry=5;
    for(times=0;times<retry;times++){
        System.out.println("do you want to continue? (y/n)");
        String exitInput =sc.next();
        char ch1=exitInput.charAt(0);
        if(exitInput.length()==1 && ch1=='n' || ch1=='N'){
            return true;
        }
        else if(exitInput.length()==1 && ch1=='y' || ch1=='Y'){
            return false;
        }
        else{
            System.out.println("wrong input,please try again");
        }
    }
    if(times>=retry){
        System.out.println("Maximum retry count exceeded ! Exiting forcefully ");
        return true;
    }
    return false;
}

public int getInteger(){
    Scanner sc=new Scanner(System.in);
    int num =sc.nextInt();
    return num;
}

public void chooseOperation(char ch){

    switch(ch){
    case '*':
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num1=getInteger();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int num2=getInteger();
        System.out.println("multiplication = " + (num1*num2) );
        break;
    case '+':
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num3=getInteger();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int num4=getInteger();
        System.out.println("Addition = " + (num3+num4) );
        break;
    case '-':
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num5=getInteger();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int num6=getInteger();
        System.out.println("Subtraction = " + (num5-num6) );
        break;
    case '/':
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num7=getInteger();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int num8=getInteger();
        if (num8==0){
            break;
        }
        System.out.println("Divide = " + (num7/num8) );
        break;
        case '%':
        System.out.println("ENTER THE FIRST NUMBER : ");
        int num9=getInteger();
        System.out.println("ENTER THE SECOND NUMBER : ");
        int num10=getInteger();
        if (num10==0){
            break;
        }
        System.out.println("Modulo = " + (num9%num10) );
        break;
    default:
        System.out.println("Unknown Opertion");
        }
    }
}
