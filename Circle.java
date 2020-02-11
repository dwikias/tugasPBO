/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circle;

import java.math.MathContext;
public class Circle {

double radius = 1;
public Circle(){
    
}
public Circle(double r){
    this.radius = r;
}
double getRadius(){
    return radius;
}
public void setradius(double r){
    this.radius = r;
}
//ini luas lingkaran
public double getArea(){
    return 3.14*radius*radius;
}
//ini keliling lingkaran
public double getCircumference(){
    return 2*Math.PI*radius;
}
@Override
public String toString(){
        return "Circle [radius = "+ this.radius + "] is Area : " + getArea()+
                "\nCircle [radius = "+ this.radius + "] is Circumference : " +getCircumference();
    }
    public static void main(String[] args) {
                // TODO code application logic here
        Circle ok1 = new Circle(2);
        Circle ok2 = new Circle(10);
        System.out.println("The radius is : "+ok1.getRadius());
        System.out.println(ok1.toString());
        System.out.println("The radius is : "+ok2.getRadius());
        System.out.println(ok2.toString());
    }
    
}
