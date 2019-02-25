/*
 There is one circle class and one cylinder class.
 circle class has area function
 Cylinder class has to calculate the circle are at the base and heifgt of its own
(CylinderVolume=circleArea*height).Using Inheritence
 */
package cylindervolume;


public class Cylinder extends CircleExample{
    
    public static void main(String[] args) {
        double height=10,cylinderVolume;
        
        CircleExample  ce = new CircleExample();
        
        ce.radius=5;
        cylinderVolume=ce.getArea()*height;
        
        System.out.println("Cylinder Volume is :"+cylinderVolume);
    }
}
