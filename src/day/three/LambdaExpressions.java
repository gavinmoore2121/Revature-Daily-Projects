package day.three;

@FunctionalInterface
interface Func {
	int apply(int num);
}

public class LambdaExpressions {
	public static void main(String[] args) {
		Func square = (x) -> x*x;
		System.out.println(square.apply(2));
		System.out.println(square.apply(4));
		System.out.println(square.apply(5));
	}
}
