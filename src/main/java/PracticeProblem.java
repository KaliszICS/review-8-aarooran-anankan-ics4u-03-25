public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String pluralize(String word) { //1

		word = word.toLowerCase();
		String ending;

		if (word.endsWith("ey")) {
			ending = "eys";
		}

		else if (word.endsWith("y")) {
			ending = "ies";
		}

		else if (word.endsWith("ife")) {
			ending = "ives";
		}

		else {
			ending = "s";
		}

		return ending;
	}

	public static int min(int num1, int num2, int num3) { //2
		
		int smallest;

		if (num1 < num2) {

			if (num1 < num3) {
				smallest = num1;
			}

			else {
				smallest = num3;
			}
		}

		else {

			if (num2 < num3) {
				smallest = num2;
			}

			else {
				smallest = num3;
			}
		}

		return smallest;

	}

	public static

}
