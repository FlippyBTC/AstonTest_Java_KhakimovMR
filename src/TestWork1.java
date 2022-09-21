import java.util.Scanner;

public class TestWork1 extends Exception {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println("Введи число: ");
			Scanner scanner = new Scanner(System.in);

			for (int i = 0; i < 10; i++) {

				int number = scanner.nextInt();

				if (number > 7) {
					System.out.println("Привет!");
				} else {
					System.out.println("Это твоя попытка №: " + i + ", попробуй еще раз");
				}
			}

		} catch (Exception e) {
			throw new Exception("Это значение не подходит для ввода");
		}
	}
}