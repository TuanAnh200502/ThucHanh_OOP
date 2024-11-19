package Bai7;

public class ResizableCircle  extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }
    
    @Override
    public void resize(int percent) {
        System.out.println(percent);
        
    }
    public String toString(){
        return "\nRadius: " + radius + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
    }
    
    
    
    
    
}