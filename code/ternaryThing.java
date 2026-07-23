public class ternaryThing {
        public static void main(String[] args) {

            // ternary operator ?= Return 1 of 2 values based on a condition

            // variable = (condition) ? ifTrue : ifFalse;

            int income = 60000;

            double taxRate = (income >= 40000) ? 0.25 : 0.15;

            System.out.println("Tax rate: " + taxRate);

        }
}
