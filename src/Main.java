public class Main {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();

 int sum = calculator.add(10, 5);
 int difference = calculator.substract(10, 5);
 int product = calculator.multiply(10, 5);

        System.out.println("Сумма: " + sum);
        System.out.println("Разность:" + difference);
        System.out.println("Произведение:" + product);
    }
}