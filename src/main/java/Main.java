public class Main {
	public static void main(String[] args) {
		System.out.println(checkIfNumberIsPositive(5));
		System.out.println(checkIfNumberIsNegative(-5));
	}
	
	public static boolean checkIfNumberIsPositive(int number) {
		return (number >= 0);
	}
	
	public static boolean checkIfNumberIsNegative(int number) {
		return (number < 0);
	}
}