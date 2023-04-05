package sorting;

public class BubbleSort {

	public static void main(String[] args) {

		int[] data = { -2, 45, 0, 11, -9 };

		for (int i = 0; i < data.length - 1; i++) {

			for (int j = 0; j < data.length - i - 1; j++) {

				if (data[j] > data[j + 1]) {

					int tmp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tmp;
				}
			}
		}

		for (int k : data) {
			System.out.println(k);
		}

	}

}
