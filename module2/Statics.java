
public class Statics {
	// static counter var
private static int count = 0;

	// each new creation increments count var
	public Statics() {

		count++;
	}
	// getter
	public static int getCount() {
		return count;
	}

	public static void main(String args[]) {

		// makes a random number of objects from 0 to 100
		for(int i = 0; i < (int)(Math.random()*101); i++) {
			new Statics();
			System.out.println(i);
		}
		// printing num of objects made to stdout
		System.out.println(getCount());
	}
}
