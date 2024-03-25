import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());

        Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());

        System.out.println("***********");

        HRManager hrManager = new HRManager(1, "John Doe", 5000);

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(2, "Jane Doe", 3000);
        hrManager.addEmployee(juniorDeveloper);

        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(5, "Johnny Doe", 3000);
        hrManager.addEmployee(juniorDeveloper2);

        JuniorDeveloper juniorDeveloper3 = new JuniorDeveloper(6, "Jenny Doe", 3000);
        hrManager.addEmployee(juniorDeveloper3);

        JuniorDeveloper juniorDeveloper4 = new JuniorDeveloper(7, "Jan Doe", 3000);
        hrManager.addEmployee(juniorDeveloper4);

        JuniorDeveloper juniorDeveloper5 = new JuniorDeveloper(8, "Jon Doe", 3000);
        hrManager.addEmployee(juniorDeveloper5);

        JuniorDeveloper juniorDeveloper6 = new JuniorDeveloper(9, "June Doe", 3000);
        hrManager.addEmployee(juniorDeveloper6);

        MidDeveloper midDeveloper = new MidDeveloper(3, "Jean Doe", 4000);
        hrManager.addEmployee(midDeveloper);

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(4, "Joan Doe", 6000);
        hrManager.addEmployee(seniorDeveloper);

        System.out.println(hrManager);
    }
}