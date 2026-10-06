package MyInteger;

// Create the MyInteger object class. Write a client program that tests all methods in the class.
public class Main {
    public static void main(String[] args) {
        MyInteger myInt = new MyInteger(7);

        System.out.println("Value: " + myInt.getValue());
        System.out.println("Is Even: " + myInt.isEven());
        System.out.println("Is Odd: " + myInt.isOdd());
        System.out.println("Is Prime: " + myInt.isPrime());

        System.out.println("Static isEven(4): " + MyInteger.isEven(4));
        System.out.println("Static isOdd(5): " + MyInteger.isOdd(5));
        System.out.println("Static isPrime(7): " + MyInteger.isPrime(7));
        System.out.println("Static isEven(myInt): " + MyInteger.isEven(myInt));
        System.out.println("Static isOdd(myInt): " + MyInteger.isOdd(myInt));
        System.out.println("Static isPrime(myInt): " + MyInteger.isPrime(myInt));

        System.out.println("Equals 7: " + myInt.equals(7));
        System.out.println("Equals myInt: " + myInt.equals(new MyInteger(7)));
        System.out.println("ParseInt from char array: " + MyInteger.parseInt(new char[]{'1', '2', '3'}));
        System.out.println("ParseInt from string: " + MyInteger.parseInt("456"));
    }
}

