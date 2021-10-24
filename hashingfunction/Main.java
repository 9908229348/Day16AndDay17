package hashingfunction;

public class Main {
	public static void main(String[] args) {
		OrderedList[] order = new OrderedList[11];
		File object = new File();
		int[] retArray = object.integerFileReader();

		for (int i = 0; i < retArray.length; i++) {
			int rem = (int) retArray[i] % 11;
			if (order[rem] == null) {
				order[rem] = new OrderedList();
				order[rem].addItem(retArray[i]);
			} else {
				order[rem].addItem(retArray[i]);
			}
		}
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
			if (order[i] != null) {
				order[i].display();
			}
		}
	}
}
