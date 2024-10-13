
package Exercise_10_03;

/**
 * 
,----------------------------------------------.
|MyInteger                                     |
|----------------------------------------------|
|-value: int                                   |
|+MyInteger(value:int)                         |
|+getValue() : int                             |
|+isEven() : boolean                           |
|+isOdd() : boolean                            |
|+isPrime() : boolean                          |
|+equals(other : int) : boolean                |
|+equals(other : MyInteger) : boolean          |
|{static} +isEven(value : int) : boolean       |
|{static} +isOdd(value : int) : boolean        |
|{static} +isPrime(value : int) : boolean      |
|{static} +isEven(value : MyInteger) : boolean |
|{static} +isOdd(value : MyInteger) : boolean  |
|{static} +isPrime(value : MyInteger) : boolean|
|{static} +parseInt(values : char[]) : int     |
|{static} +parseInt(values : String) : int     |
`----------------------------------------------'
 * UML done by https://www.plantuml.com/
 * @author DejanD
 */
public class MyInteger {
    private final int value;
    
    public MyInteger(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    public boolean isEven() {
        return MyInteger.isEven(value);
    }
    public boolean isOdd(){
        return MyInteger.isOdd(value);
    }
    public boolean isPrime(){
        return MyInteger.isPrime(value);
    }
    public static boolean isEven(int value){
        return value % 2 == 0;
    }
    public static boolean isOdd(int value){
        return value % 2 != 0;
    }
    public static boolean isPrime(int value){    
        for (int i = 2; i <= Math.sqrt(value); i++){
            if (value % i == 0) return false;
        }
        return true;
    }
    public boolean isEven(MyInteger i){
        return isEven(i.value);
    }
    public boolean isOdd(MyInteger i){
        return isOdd(i.value);
    }
    public boolean isPrime(MyInteger i){
        return isPrime(i.value);
    }
    
    public boolean equals(int value){
        return this.value == value;
    }
    public boolean equals(MyInteger i){
        return this.value == i.value;
    }
    
    public static int parseInt(char[] arr){
       return Integer.parseInt(new String(arr));
    }
    public static int parseInt(String arr){
           return parseInt(arr.toCharArray());
    }
}
