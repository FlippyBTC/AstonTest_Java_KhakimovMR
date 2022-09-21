import java.util.ArrayList;
import java.util.Scanner;

public class TestWork3 extends Exception {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> myArray = new ArrayList<>();
		try {
			System.out.println("Введите длину массива");
			Scanner scanner = new Scanner(System.in);
			int arrayLenght = scanner.nextInt();

			for (int i = 0; i < arrayLenght; i++) {
				System.out.println("Введите элемент массива: ");

				Scanner scanner1 = new Scanner(System.in);
				int numberArray = scanner1.nextInt();

				myArray.add(numberArray);
			}
			System.out.println("Числа, которые кратны 3-м: ");
			for (Integer integer : myArray) {
				if (integer % 3 == 0) {

					System.out.print(integer + " ");
				}
			}
		} catch (Exception e) {
			throw new Exception("Вы ввели некорректные данные");
		}


	}
}