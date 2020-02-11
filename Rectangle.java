/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author dwiki
 */
public class Rectangle {

    private float length;
    private float width;
    
    //ini constructor
    public Rectangle(){
        
    }
    public Rectangle(float p,float l ){
        this.length = p;
        this.width = l;
    }
    float getLength(){
        return length;
    }
    void setLength(float length){
        this.length = length;
    }
    float getWidth(){
        return width;
    }
    void setWidth(float width){
        this.width = width;
    }
    double getArea(){
        return length*width;
    }
    double getPerimeter(){
        return 2*(length+width);
    }
    @Override
     public String toString(){
        return "Rectangle [length = "+this.length+",width = "+this.width+"] is Area = "
                +getArea()+
                "\nRectangle [length = "+this.length+",width = "+this.width+
                "] is perimeter = "+getPerimeter();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle ok1 = new Rectangle(2,3);
        Rectangle ok2 = new Rectangle(10,2);
        System.out.println("The length is : "+ok1.getLength());
        System.out.println("The width is : "+ok1.getWidth());
        System.out.println(ok1.toString());
        System.out.println("The length is : "+ok2.getLength());
        System.out.println("The width is : "+ok2.getWidth());
        System.out.println(ok2.toString());
    }
 
}
