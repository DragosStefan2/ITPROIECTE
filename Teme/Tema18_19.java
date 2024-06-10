package Teme;

public class Tema18_19 {
    /**Problem Statement:
     Design a class named Rectangle that contains:

     Two private double data fields named width and height that specify the width and height of the rectangle. The default values are 1 for both width and height.
     A no-arg constructor that creates a default rectangle.
     A constructor that creates a rectangle with the specified width and height.
     A method named getArea() that returns the area of this rectangle.
     A method named getPerimeter() that returns the perimeter.*/

}
    class Rectangle {

        private double width;
        private double height;

        public Rectangle() {
            this.width = 1;
            this.height = 1;
        }

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }


        public double getArea() {
            return width * height;
        }

        public double getPerimeter() {
            return 2 * (width + height);
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }
    class Main2 {
        public static void main(String[] args) {
            //verificarea clasei
            Rectangle r1 = new Rectangle();
            System.out.println(r1.getArea());
            System.out.println(r1.getPerimeter());
        }
    }
