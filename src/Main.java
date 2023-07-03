
import a.A;
import chair.Chair;
import chair.OfficeChair;
import point.MovablePoint;

public class Main {

    public static void main(String[] args) {

        A a = new A();
        a.publicInt = 0;
//        a.protectedInt = 0;
//        a.defaultInt = 0;

        Chair c1 = new Chair("office",4,40.5);
        Chair c2 = new Chair("office",4,40.5);
        Chair c3 = new Chair("sofa",4,100.5);
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.equals(c3));
//        System.out.println(c2.equals(c3));

        OfficeChair oc1 = new OfficeChair(112,true,true,true,20);
        OfficeChair oc2 = new OfficeChair(113,true,true,false,0);

//        System.out.println(oc1);
//        System.out.println(oc2);

        Parrot parrot1 = new Parrot("Jared");
//        parrot1.fly();

        Plane plane1 = new Plane("two",16);

//        makeThemFly(parrot1);
//        makeThemFly(plane1);

//        MovablePoint movablePoint = new MovablePoint(1,1);
//        System.out.println(movablePoint);
//        movablePoint.moveDown();
//        System.out.println(movablePoint);
//        movablePoint.moveRight();
//        System.out.println(movablePoint);
        //Animal animal = new Animal("Tom");


    }

    public static void makeThemFly(Flyable f){
        f.fly();
    }

    public static void printAnimalName(Animal a){
        
    }
}