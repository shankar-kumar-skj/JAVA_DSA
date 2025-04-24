package GITHUB;
public class April_24{
    public static void main(String[] args){
        // DIGIT EXTRACTION
        // num%10 = unit digit
        // num / 10 = unit digit remove
        // num / 2 => 0,1

        decimalToAnyBase(5,2);
        anyBaseToDecimal(101,2);

        findEvenOdd(23);
        ReverseNum(2343);

        powerFunction(23, 3);

        FastExponantial1(23, 3);
        FastExponantial2(23, 3);

    }

    static void decimalToAnyBase(int decimalNum,int base){

        int resNum = 0;
        int power=0;
        while(decimalNum>0){
            int rem=decimalNum%base;
            decimalNum/=base; 
            resNum+= rem * Math.pow(10,power);
            power++;
        }
        System.out.println("Result is"+ resNum);
    }
    static void anyBaseToDecimal(int binaryNum,int base){

        int resNum = 0;
        int power=0;
        while(binaryNum>0){
            int unitDigit=binaryNum%10;
            binaryNum/=10;
            resNum+= unitDigit * Math.pow(base,power);
            power++;
        }
        System.out.println("Result is"+ resNum);
    }

    static void findEvenOdd(int num ){
        if(num%2==0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER"); 
        }
    }

    static void ReverseNum(int num1){
        int ReverseNum1=0;
        while(num1>0){
            int digit1=num1%10;
            ReverseNum1=(ReverseNum1*10 )+ digit1;
            num1/=10;
        }
        System.out.print("REVERSE NUMBER : "+ReverseNum1);
    }

    static double powerFunction(int num2,int power2){
        double result2=1;
        for(int i=0;i<power2;i++){
            result2=result2*num2;
        }
        System.out.println(result2);
        return result2;
    }
    
    // fast exponential (Method - 1)
    static double FastExponantial1(int num3,int power3){
        double result3=0;
        while(power3>0){
            if(power3 %2!=0){
                result3=result3*num3;
                power3=(power3-1)/2;
            }
            else{
                power3/=2;
            }
            num3=num3*num3;
        }
        System.out.println(result3);
        return result3;
    }

    // fast exponential (Method - 2)
    static double FastExponantial2(int num4,int power4){
        double result4=0;
        while(power4>0){
            if(power4 %2!=0){
                result4=result4*num4;
                power4=(power4-1)/2;
            }
            power4/=2;
            num4=num4*num4;
        }
        System.out.println(result4);
        return result4;
    }
}

// EUHA PANA KA DARD THA
// KHONA KA NAHI
// ENHA SMALHA KA DARD THA
// TARPANA KA NAHI!!
