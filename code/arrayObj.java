public class arrayObj{
    public static void main(String[] args){

        Car car1 = new Car("BMW", "red");
        Car car2 = new Car("Audi", "blue");
        Car car3 = new Car("Mercedes", "green");

        Car[] cars = {car1, car2, car3};

        for(Car car : cars){
            car.color = "black";
        }

        for(Car car : cars){
            car.drive();
        }

    }
}
