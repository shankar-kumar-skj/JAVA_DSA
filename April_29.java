package GITHUB;

public class April_29 {
    // BITS MANUPULATION => UNIT AT WHICH DATA STORE 
    // N BITS = 2(POWER OF N)-1

    // 1 BYTE = 8 BITS

    //  _  _  _  _
    //  |  |  |  |
    // MSB      LSB 
    // LM        RM

    // MSB => MOST SIFNICIENT BIT (SIGN => 0-> POSITIVE , 1 -> NEGATIVE NUMBER )
    // LSB => LEAST SIFNICIENT BIT
    // LM =>  LEFT MOST
    // RM =>  RIGHT MOST

    // 2's compliment of any number (to convert (52) -> (-52) )
    // => first find the binary 
    // => then make it inverse (convert 0 -> 1 and 1 -> 0)
    // => add 1

    // shift 
    // => (1.) Right shift (a>>b) => a / (2 (power of b))
    //        => 101>>1 -> 010
    //        => 101>>2 -> 001
    // right shift ma 2 ka power decrease hota  ha

    // => (2.) Left shift (a<<b) => => a * (2 (power of b))
    //        => 101<<1 -> 1010
    //        => 101<<2 -> 10100
    // left shift ma 2 ka power increase hota  ha
}
