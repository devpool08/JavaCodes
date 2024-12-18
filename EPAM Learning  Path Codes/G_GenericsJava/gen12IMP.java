package G_GenericsJava;

enum calculator{
    ADD, SUBTRACT, MULTIPLY, DIVIDE;
    public <T extends Number> double calculate(T a,T b) {
        switch ((this)){
            case ADD -> {
                return a.doubleValue()+b.doubleValue();
            }
            case SUBTRACT -> {
                return a.doubleValue()-b.doubleValue();
            }
            case MULTIPLY -> {
                return a.doubleValue()*b.doubleValue();
            }
            case DIVIDE -> {
                if(b.doubleValue()!= 0)
                    return a.doubleValue()/b.doubleValue();
                else
                    throw new ArithmeticException("Division by zero");
            }
        }
        return 0;
    }
}
public class gen12IMP {
    public static void main(String[] args) {
        calculator calc = calculator.ADD;
        System.out.println(calc.calculate(10, 20)); // 30

        calc = calculator.SUBTRACT;
        System.out.println(calc.calculate(20, 10)); // 10

        calc = calculator.MULTIPLY;
        System.out.println(calc.calculate(10, 20)); // 20

        calc = calculator.DIVIDE;
        System.out.println(calc.calculate(20, 10)); // 2.0

        calc = calculator.DIVIDE;
        try {
            System.out.println(calc.calculate(20, 0)); // Throws ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
