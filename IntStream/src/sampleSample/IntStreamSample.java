package sampleSample;

import java.util.stream.IntStream;

public class IntStreamSample {

	public void addNumbersBetweenOneToTen() {
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
		}

		System.out.println(total);

	}

	public static void addEvenNumbersBetweenOneToTen() {
		int total = 0;

		for (int i = 2; i <= 20; i += 2) {
			total += i;
		}

		System.out.println(total);

	}

	public static void multiplyEvenNumbersBetweenOneToTenWithThree() {
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				total += i * 3;
			}
		}

		System.out.println(total);

	}

	public static void main(String[] args) {
		IntStreamSample obj = new IntStreamSample();

		obj.addNumbersBetweenOneToTen();
		addEvenNumbersBetweenOneToTen();
		multiplyEvenNumbersBetweenOneToTenWithThree();

		// lambda equivalent of addNumbersBetweenOneToTen
		System.out.println(IntStream.rangeClosed(1, 10).sum());

		// lambda equivalent of addNumbersBetweenOneToTen
		System.out.println(IntStream.rangeClosed(1, 10).map((int x) -> {
			return x * 2;
		}).sum());
		// Sum the triples of the even integers from 2 through 10
		System.out.println(IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 0).map((x) -> x * 3).sum());

	}

}
