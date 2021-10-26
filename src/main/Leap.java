package main;

public class Leap {
    public boolean checkLeap(int year) {
        return (year % 4 == 0) && !(year % 100 == 0 && year % 400 != 0);
    }

    public static void main(String[] args) {
        System.out.println("Jai Swaminarayan");
    }
}
