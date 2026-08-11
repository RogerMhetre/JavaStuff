class Car {
    String brand;
    int price;

    void display(){
        System.out.println("Car brand: " + this.brand);
        System.out.println("Car price: " + "$" + this.price);
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Challenger";
        car1.price = 30000;
        car1.display();

        car2.brand = "Corvette";
        car2.price = 25000;
        car2.display();

        int a = 1;

        switch(a){
            case 1 -> System.out.println("a is 1");
            case 2 -> System.out.println("a is 2");
        }
    }
}
