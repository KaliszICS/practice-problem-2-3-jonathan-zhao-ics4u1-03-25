
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] str) {
		boolean swapped = true;
		String temp = "";
		for(int i = 0; i < str.length - 1 && swapped; i++ ) {
			swapped = false;
			for(int j = 0; j < str.length - 1 - i; j++) {
				if(str[j].compareToIgnoreCase(str[j + 1]) > 0) {
					temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
					swapped = true;
				}
			}
		}
	}

}
