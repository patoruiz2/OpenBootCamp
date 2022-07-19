public class Main {
    public static void main(String[] args) {

        Car myCar = new Car(3, 100);
        myCar.accelerate();
        System.out.println(myCar.actualSpeed);
        System.out.println(myCar.maxSpeed);
        System.out.println(myCar.numberOfDoors);
        myCar.decelerate();

//        Car myCar2 = new Car();
//        myCar2.accelerate();
//        System.out.println((myCar2.actualSpeed));
//        myCar2.decelerate();
    }
}

class Car{
    int numberOfDoors;
    int maxSpeed;
    float actualSpeed;

    public Car(int numberOfDoors, int maxSpeed){
        this.numberOfDoors = numberOfDoors;
        this.maxSpeed = maxSpeed;
    }
    public Car(){// Without parameters, this constructor will be executed
        numberOfDoors = 5;
        maxSpeed = 120;
    }
    public void accelerate (){
        actualSpeed += 15;
    }
    public void decelerate (){
        actualSpeed -= 15;
    }
}