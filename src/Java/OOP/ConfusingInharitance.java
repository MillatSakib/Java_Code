/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java.OOP;

/**
 *
 * @author Sakib
 */

 class Shape{
     public String name;
     
     public Shape(String name){
        this.name = name;
     }
     
     public String getName(){
        return name;
     }
}


class Circle extends Shape{
        public Circle(){
        super("Circle");
        }
}

class Square extends Shape {
    public Square(){
        super("Square");
    }
}


class DrawingBoard{

       public void draw(Shape shape){
        System.out.println("Drawing a shape : "+shape.getName());
        String typeName = shape.getClass().getTypeName();
        String superClassType = shape.getClass().getSuperclass().getTypeName();
           System.out.println("TypeName: "+typeName);
           System.out.println("SuperClass Type: "+superClassType);
    }

}

public class ConfusingInharitance {
    
    public static void main(String[] args){
        DrawingBoard drawingBoard = new DrawingBoard();
        Circle circle = new Circle();
        Square square = new Square();
        drawingBoard.draw(circle);
        drawingBoard.draw(square);
        
    }
}
