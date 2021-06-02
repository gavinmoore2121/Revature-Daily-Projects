package calculator.mini.project;

public class Test {

	public static void main(String[] args) {
		Compute addition = new Addition();
		Compute subtraction = new Subtraction();
		Compute multiplication = new Multiplication();
		Compute division = new Division();
		
		UseCompute computer = new UseCompute();
		
		int n = 6;
		int m = 3;
		
		computer.useCom(addition, n, m);
		computer.useCom(subtraction, n, m);
		computer.useCom(multiplication, n, m);
		computer.useCom(division, n, m);
	}

}
