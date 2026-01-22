@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}
public class Demo_13 {
    public static void main(String[] args) {

        int x =5;
	int y =3;
        Calculator add = (a,b) -> a+b;
        Calculator multiply = (a,b) -> a*b;
        System.out.println("Addition: " + add.calculate(x, y));       
        System.out.println("Multiplication: " + multiply.calculate(x, y)); 
    }
}


