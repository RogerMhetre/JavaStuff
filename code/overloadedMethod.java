public class overloadedMethod {
    public static void main(String[] args) {

        String pizza = bakePizza("flat bread", "Mozzarella", "pepperoni");

        System.out.println(pizza);

    }
    static String bakePizza(String bread){
        return bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " Pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " Pizza";
    }
}
