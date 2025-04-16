// lecture 4 nad 5 :-
// https://www.youtube.com/watch?v=1Z2QzcbLicY&list=PLQ7ZAf76c0ZPVdhV1bAjFv0bQc1xHURzE&index=5

package GITHUB;

// 1.
// // for run this write in terminal => java APRIL_16
// public class APRIL_16 {
//     public static void main(String[] args) {
//         System.out.println("APRIL_16 shankar kumar");
//         // Hello.main(args);
//         System.out.println("soona -- gold ");
//         return; // no return so it can we used in void
//     }
//     public static void main1(String[] args) {
//         System.out.println("APRIL_16 shankar kumar");
//     }
// }

// 2.
// // for run this write in terminal => java APRIL_16 AALLU
// public class APRIL_16 {
//     public static void main(String[] args) {
//         System.out.println(" soona -- gold ");
//     }
// }
// // OUTPUT => AALLU soona -- gold

// 3.
// for run this write in terminal => java APRIL_16 AALLU TAMATOR CHAT
public class APRIL_16 {
    static int cop=20; //instance variable
    int poc=20; //instance variable
    public static void main(String[] args) {
        System.out.println(args + " soona -- gold ");
        System.out.println(args[0] + " soona -- gold ");
        System.out.println(args[1] + " soona -- gold ");
        System.out.println(args[2] + " soona -- gold ");
 //     System.out.println(poc); //wrong
 //     System.out.println(cop);
        APRIL_16 obj1=new APRIL_16();
        System.out.println(obj1.poc);


    }
    //
    // void myfun(){
    //     System.out.println(poc);
    //     System.out.println(cop);
    // }
}
// OUTPUT => AALLU soona -- gold

// 4.
// for run this write in terminal => java Hello
class Hello {
    public static void main(String[] args) {
        System.out.println("HELLO");
        // Hy.main(args);
    }
}

// 5.
// for run this write in terminal => java Hy
class Hy {
    public static void main(String[] args) {
        System.out.println("Hy");
    }
}

// function -> ask()
// array -> hhhs[]
// class -> class Aks
// SINGLE LINE COMMENT
/*
 * MULTI
 * LINE 
 * COMMENT
 */
 
                            //  LECTURE 5

// TO MAKE BYTE FILE (CLASS FILE) AND JAVA FILE IN DIFFERENT FOLDERS

// CLASS FILE -> bin FOLDER
// COMPILE TIME CHANGES to make class fil through compile
//         => javac -d ../bin April16.java

// JAVA FILE -> src FOLDER
// RUN JAVA FILE
//        => java -classpath ../bin April16

// BINARY => 2 (0 TO 1)
// OCT => 8 (0 TO 7)
// DEC => 10 (0 TO 9)
// HEXA-DECEMAL => 10 (0 TO 9 ,A,B,C,D,E,F)

// variable 
// int a = 36;
// here , 
        //  int => DATATYPE
        //  a => VARIABLE
        //  26 => LITERIALS (WHEN THE VARIABLE DATA IS NOT COMPILE IT IS NOT STORED IN THE MEMORY SO IT IS CALLED LITERALS )

//  TYPES OF LITERALS :-  
// 1. INTEGRAL LITERAL => byte,short,int,long
        // a) binary literals (base 2) => int x=0b10
        // b) decimal literals (base 10) => int x=10
        // c) octal literals (base 8) => int x=010
        // d) hexa-decimal literals (base 16) => int x=0X10

        // int a1 = 25;
        // byte a2 = 25;
        // long a3 = 25l;
        // short a4 = 252;
        // short a5 = 32767; // => output ==> -32767
        // short a6 = (short)32768; // => output ==> -32767 // explict typecasting


// 2. FLOATING - POINT LITERAL => float
        // float a7=89.9f;

// 3. CHAR LITERAL => string
        // char ch='a'; // => output ==> a
        // char ch1=062; // => output ==> 2
        // char ch2=62; // => output ==> >
        // char ch3=0x12A; // => output ==> ?

// 4. STRING LITERAL
        // string s1="hello"; // => output ==> hello
// 5. BOOLEAN LITERAL

// MIXED MODE OPERATION

// System.out.println(10+30+" HELLO "+"E3 "30+43)

// FINAL => not reinitialize after declare and initialize
// final int xyz; //declare
// xyz = 4747; //initialize

// type of variable:-
// LOCAL =>
// STATIC => 



