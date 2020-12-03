package chapter6;

import java.util.Scanner;
/*
   - main needs to be static, because that's how java is build
   - However, all of our other things don't necessarily have to be static.
   - And now that we've talked about classes and objects, we can talk a little bit more
   about static.
   - Static is used when you don't want to create a new instance of that class but yet you want
   to access to the things inside of it. So it has no state.
   - Static Non-Access Modifier: Static is used for members of a class which can be
   accessed without using an instance of the class to do so. Because it’s not associated
   with an instantiation, these members have no state.
   - in static context there is not such thing as state.
   - An state is, for example, a Rectangle with its width and length defined, ie: width=25, length= 50
   - If we don't want to use static and we want to keep state, then what we would need to do is create an instance
   and then call the methods.  This is why we instantiated the class HomeAreaCalculatorRedo and now we can use
   getRoom method because this method is not static.
   In Java a default constructor is always defined implicit.
 */

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();


        double area = calculator.calculateTotalArea(kitchen,bathroom);

        System.out.println("The total area is: " + area);

        calculator.scanner.close();
    }

    public Rectangle getRoom(){

        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();

       return new Rectangle(length, width);
    }

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }
}
