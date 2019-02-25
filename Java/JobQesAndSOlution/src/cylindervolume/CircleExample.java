/*
 There is one circle class and one cylinder class.
 circle class has area function
 Cylinder class has to calculate the circle are at the base and heifgt of its own
(CylinderVolume=circleArea*height).Using Inheritence
 */
// Dutch Bangla Bank Ques 2016 Pagla
package cylindervolume;

public class CircleExample {

    public double area;
    public double radius;

    public double getArea() {
        area = 3.1416 * radius * radius;
        return area;
    }
}
