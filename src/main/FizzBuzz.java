package main;

public class FizzBuzz {
    public String fizzBuzzFinder(String fb){
        Integer num = Integer.valueOf(fb);
        if(num % 5 == 0){
            return num % 3 == 0 ? "FizzBuzz" : "Buzz";
        }
        return num % 3 == 0 ? "Fizz" : fb;
    }
}
