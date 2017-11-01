public class TestCalculator{
    public static void main(String[] args){
        Calculator calculator = new Calculator();

        calculator.setOperandOne(5);
        calculator.setOperandTwo(3);
        calculator.setOperation("thing");
        int results = calculator.getResults();
        System.out.println(results);
    }
}