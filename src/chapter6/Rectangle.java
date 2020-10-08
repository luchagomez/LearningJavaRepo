package chapter6;

public class Rectangle {

    private double length;
    private double width;
/*
 Global variables are also known as fields, in this example the length and the width are the fields of the rectangle.
 DEFAULT CONSTRUCTOR:
 *  - Must have the same name of the class.
 *  - Does not have a parameters list. If someone wants to create a Rectangle object does not need to set the length or
 *  width.
 *  - It is typically used to assign default values to the fields.
 *  - Are used to initialize the object or set up the state.
 *  - You can have however many constructors you want. All of their names must be exactly as the class name. What
 *  differs is the parameters that they accept.

 ENCAPSULATION:
 *  - Classes should practice encapsulation. Encapsulation is one of the key principles of object-oriented programming.
 *  - When you create a class, it is going to represent an object and their fields need to be private.
 *   - It specifies that the data (fields) of a class should be private and the methods (behaviour) of the class can be
 *  exposed (public) to other classes to use.
 *  - None classes can access to the private fields in this class.
 *  - Only classes on this package can access to those fields that are not public.
 *  - Protected: if anything is marked as protected, it means that other classes within this same package can access it.
 *  - It's similar to having no access modifier at all.
 */
    // default constructor
    public Rectangle(){
        length=0;
        width=0;
    }
    // another constructor different than the default
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(double width){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }

}
