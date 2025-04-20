package GITHUB;
import java .util.Scanner;

public class APRIL_19 {
    public static void main(String[] args){
        int marks=32;
        if(marks>=90){
            System.out.println("you are topper as you have secured" + marks);
        }
        if(marks>35 && marks<90){
            System.out.println("your marks is : "+ marks);
        }
        if(marks<=35){
            System.out.println("You have scored only" + marks + "");
        }
        //if else
        if(marks<=35){
            System.out.println("You are pass" + marks + "");
        }
        else{
            System.out.println("you are fail!"+marks);
        }
        // if else ladder
        if(marks>=90){
            System.out.println("You are pass" + marks + "");
        }
        else if(marks>35 && marks<90){
            System.out.println("your marks is : "+ marks);
        }
        else if(marks==0){
            System.out.println("kya likha ha! "+ marks);
        }
        else{
            System.out.println("you are fail!"+marks);
        }
        //  Nested if
        if(marks>35 && marks<=100){
            if(marks>=90){
                System.out.println("You are pass" + marks + "");
            }
            else if(marks>35 && marks<90)
            System.out.println("your marks is : "+ marks);
        }
        else if(marks==0){
            System.out.println("kya likha ha! "+ marks);
        }
        else{
            System.out.println("you are fail!"+marks);
        }
        // switch statement
        int choice =2;
        switch (choice) {
            case 1:
                System.out.println("you are first");
                break;
            case 2:
                System.out.println("you are second");
                break;
            case 3:
                System.out.println("you are third");
                break;
            case 4:
                System.out.println("you are fourth");
                break;
            case 5:
                System.out.println("you are fifth");
                break;
            default:
                System.out.println("wrong!!");
                break;
            }

        // loop
        String name="Shankar";
        int len=name.length();
        for (int pos = 0; pos <len; pos++) {
            char ch=name.charAt(pos);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("hi vowel :\t"+ch);
            } 
            else{
                System.out.println("hi consonenet :\t"+ ch);
            }
        }
        
        int number=3;
        for (int i=0; i <=10; i++) {
            if(number>0){
                if(number==0){
                    break;
                }
                else{
                    System.out.println(number +"X "+i+":\t"+number * i);
                    if(i==9){
                        continue;
                    }
                }
            }
        }

        // for-each loop
        int arr[]={5,7,90};
        for (int element : arr){
            System.out.println(element);
        }


        // while
        int number1=90;
        while (number1!=0) {
            System.out.println(number);  
            number=number/2;          
        }

        // do while loop
        do{
            System.out.println(number);  
            number=number/2;
        }
        while(number1!=0);




        // question :-
        Scanner sc=new Scanner(System.in);
        int number2=sc.nextInt();
        int count=0;
        while(number2!=0){
            if (count ==5)
            {
                if (number2%2==0){
                    count++;
                    continue;
                }
                else{
                    count++;
                    number2=number2/2;
                    System.out.println(number2);
                }
            }
        }
    }  
}
