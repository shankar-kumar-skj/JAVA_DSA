package GITHUB;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class April_25 {
    public static void main(String[] args){
        countDigitys(9800);
        // countDigitys(080035);// octal digit
        countDigitysVaiLog(34);
        arstrongNumber(343);
        PalindromNumber(454);
        allDivisor(45);
        primeNumber(42);
        sieveAlgorithm(65);
        newtonRaphsonRoot(36);
        GCD(78,98);
        euclideanGCD(24, 68);
        effectiveEuclideanGCD(24, 68);
        lcm(24,36);
        LimitFastExponentiation(1234567,5,1000000000);
        factorial(5);

    }

    public static void countDigitys(int num){
        if (num==0){
            System.out.println("DIGIT ARE = 1 ");
            return;
        }
        int counter=0;
        while(num>0){
            num/=10;
            counter++;
        }
        System.out.println("Digit are : "+ counter);
    }

    public static void countDigitysVaiLog(int num1){
        if (num1==0){
            System.out.println("DIGIT ARE = 1 ");
            return;
        }
        int count1=(int)(Math.log(num1)/Math.log(10))+1;
        // int count1=(int)(Math.log10(num1)) + 1; // directly function of log
        System.out.println("Digit are : "+ count1);
    }

    // ARMSTORNG NUMBER => 153 = (1*1*1) + (5*5*5) + (3*3*3) => 153
    public static void arstrongNumber(int num2){
        int res2=0;
        int copy2=num2;
        while(num2>0){
            int digit2=num2%10;
            res2=res2+(int) Math.pow(digit2,3);
            num2/=10;
        }
        System.out.println(res2==copy2);
    }

    // PALINDROM NUMBER => 121 => 121 (REVERSE IS SAME)
    public static void PalindromNumber(int num3){
        int res3=0;
        int copy3=num3;
        while(num3>0){
            int lastdigit3=num3%10;
            res3=res3*10+lastdigit3;
            num3/=10;
        }
        if (copy3==res3){
            System.out.println("palandrom number : " + num3);
        }
        else{
            System.out.println("Not palandrom number : " + num3);
        }
    }

    // DIVISOR OF A NUMBER 
    public static void allDivisor(int num4){
        int counter4=0;
        int sq_root4=(int)Math.sqrt(num4);
        while(counter4<=sq_root4){
            if (num4%counter4==0){
                System.out.println(counter4 + " is a divisor of "+num4);
                int otherNumber4=num4/counter4 ;
                if(otherNumber4!=counter4){
                    System.out.println(otherNumber4+ " is a divisor of "+num4);
                }
            }
        }
    }

    // prime number
    public static void primeNumber(int num5){
        int counter5=2;
        int sq_root5=(int)Math.sqrt(num5);
        while(counter5<=sq_root5){
            if(num5%counter5==0){
                System.out.println(num5 + "is not a prime number");
                return;
            }
            System.out.println(num5 + "is a prime number");
        }
    }

    // sieve of ertosthenes (all the prime number between the number given by the user)
    public static void sieveAlgorithm(int num6){
       boolean arr[]=new boolean[num6+1];
       Arrays.fill(arr, true);
       int counter6=2;
       while(counter6<=num6){
        if (arr[counter6]==true){
            for(int factor=counter6+counter6;factor<=num6;factor+=counter6){
                arr[factor]=false;
            }
        }
        counter6++;
       }
       for(int i=2;i<=num6;i++){
        System.out.println(i+" : "+ arr[i]);
       }    
    }

    // Newton Raphson Method :-
    //  X -> assumed root
    // N -> number
    // tollerence level => 0.1  

    // root = 0.5 * (X + (N/X))
    public static double newtonRaphsonRoot(int num7){
        double tolerence7=0.0001;
        double root;
        double X=num7;
        while(true){
            root = 0.5*(X+(num7/X));
            double ans7=X-root;
            if(ans7<tolerence7){
                break;
        }
        X=root;
        }
        System.out.println("ROOT : "+(int)root);
        return root; 
    }

    // GREATEST COMMON DIVISIOR

    public static void GCD(int num8,int num9){
        int min=(num8<=num9)?num8:num9;
        while(min>0){
            if(num8%min==0 && num9%min ==0){
                System.out.println("GCD IS : "+ min);
                break;
            }
            min--;
        }
        int max=(num8<=num9)?num9:num8;
        System.out.println("GCD IS : "+max);
    }

    // euclideanGCD using subtraction method:-
               // gcd (a,b)=gcd(a-b,b) where a>b

    public static void euclideanGCD(int num10,int num11){
       while(num10!=0 && num11!=0){
        if(num10>num11){
            num11-=num10;
        }
        else{
            num11-=num10;
        }
       }
       int res10=num10;
       if(num11==0){
        res10=num11;
       }
       System.out.println("GCD IS : "+ res10);
    }

// Or

    // Effective EuclideanGCD using modulus method:-
    // gcd (a,b)=gcd(a%b,b) where a>b
    public static int effectiveEuclideanGCD(int num10,int num11){
        while(num10!=0 && num11!=0){
         if(num10>num11){
             num11%=num10;
         }
         else{
             num11%=num10;
         }
        }
        int res10=num10;
        if(num11==0){
         res10=num11;
        }
        // System.out.println("GCD IS : "+ res10);
        return res10;
     }

    //  LCM OF 2 NUMBERS :-
    //  LCM * GCD = a * b
    public static void lcm(int num12,int num13){
        int res12=(num12 * num13)/effectiveEuclideanGCD(num12, num13);
        System.out.println("LCM IS : "+ res12);
    }

    // fast exponentiation code :-
    static double fastExponentiation(int num14,int power14){
        double res14=1;
        while(power14 > 0){
            if (power14 %2!=0){
                res14=(res14*num14);
            }
            power14 /= 2;
            num14=num14*num14;
        }
        System.out.println(res14);
        return res14;
    }

    // MODULAR ARITHMATICS 
    // 1. ( (A % M)+(B % M) ) %  M = (A+B) % M
    // 2. ( (A % M)-(B % M) ) %  M = (A-B) % M
    // 3. ( (A % M)*(B % M) ) %  M = (A*B) % M
    // 4. ( A % M ) %  M = A % M
    // 5.  M  % M = 1 [true for all positive value of M]
    // 6. ( A / B ) %  M = (A % M) * ((B ^ -1) % M) % M

        // MODULAR ARITHMATICS IN fast exponentiation code IN LIMIT:-
    static double LimitFastExponentiation(long num15,long power15,long limit15){
        double res15=1;
        while(power15 > 0){
            if (power15 %2!=0){
                res15=(res15 * ( num15 % limit15)% limit15);
                // res14=(res14*num14);
            }
            power15 /= 2;
            num15=((num15 % limit15) * ( num15 % limit15))% limit15;
            // num15=num15*num15;
        }
        System.out.println(res15);
        return res15;
    }

    // factorial of the number
    public static void factorial(int num16) {
        double res16=1;
        while(num16>1){
            res16*=num16;
            num16--;
        }
        System.out.println(res16);
    }

    // finding trailing zeroes in a factorial
    // 1. if it is 0, add the count
    // 2. if it non zero ,break the loop

    public static void findTrailingZerosInFactorial(int num17){
        double res17=0;
        for(int i=5;i<=num17;i=i*i){
            res17=res17+ Math.floor(num17/i);
        }
        System.out.println(res17);
    }
}

