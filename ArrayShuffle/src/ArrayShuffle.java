import java.security.SecureRandom;

public class ArrayShuffle {

	public static void shuffle() {
		SecureRandom rand = new SecureRandom();

		// int [] array1 = {21,22,23,24};
		int[] array1 = { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
		int[] array2 = new int[20];
		int[] array3 = new int[20];

		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[rand.nextInt(20)];

			for (int j = 0; j < i; j++) {
				if (array2[i] == array2[j]) {
					array2[j] = array1[rand.nextInt(20)];
					break;
				}
			}

		}

		for (int j = 0; j < array1.length; j++) {
			System.out.print(array2[j] + " ");
		}
	}

	public static void main(String... args) {
	//	shuffle();
		String name = new String("dayo");
		String oruko = new String("dayo");
		//System.out.println(oruko.compareTo(name));
		//name.compareTo(oruko);
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(oruko));
		System.out.println(name.equals(oruko));
		System.out.println(name==oruko);
	
		
	}

}
