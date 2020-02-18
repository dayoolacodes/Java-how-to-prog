package com.cardvalidation;

import java.util.Scanner;

public class CardValidation {

	private int cardNumber[];

	Scanner in = new Scanner(System.in);

	public int getSize() {
		//System.out.println(this.cardNumber.length + " digits");
		return this.cardNumber.length;
	}

	public void checkCardType(int i) {
		switch (i) {
		case 4:
			System.out.println("Visa card");
			break;
		case 5:
			System.out.println("MasterCard");
			break;
		case 6:
			System.out.println("Discover Card");
			break;
		case 7:
			System.out.println("American Express");
			break;
		default:
			System.err.println("Unknown Card");
			System.exit(0);
		}
	}

	public int sumOfDoubleEvenPlace(int arr[]) {
		int evenDouble[] = new int[(int) (arr.length / 2)];
		int reversedEvenDouble[] = new int[evenDouble.length];
		for (int i = 0, u = 0; u < evenDouble.length; i += 2, u++) {
			evenDouble[u] = arr[i] * 2;
		}
		for (int i = evenDouble.length - 1, u = 0; i >= 0; i--, u++) {
			reversedEvenDouble[u] = evenDouble[i];
		}
		return getDigit(reversedEvenDouble);
	}

	public int sumOfDigitsInOddPlace(int arr[]) {
		int sumDigitInOddPlaces = 0;
		int oddPlacesDigits[] = new int[(arr.length / 2) + 1];
		for (int i = arr.length - 1, u = 0; i >= 0; i -= 2, u++) {
			oddPlacesDigits[u] = arr[i];
			sumDigitInOddPlaces += arr[i];
		}
		return sumDigitInOddPlaces;
	}

	public int getDigit(int digits[]) {
		int totalDigit = 0;
		for (int digit : digits) {
			if (digit < 10) {
				totalDigit += digit;
			} else {
				int firstDigit = digit / 10;
				int secDigit = digit % 10;
				int sumFirstNSecDigit = firstDigit + secDigit;
				totalDigit += sumFirstNSecDigit;
			}
		}
		return totalDigit;
	}

	public boolean isValid(String stringValueOfcardNumber) {
		int cardChecker []= new int[stringValueOfcardNumber.length()];
		if (cardChecker.length< 13 || cardChecker.length > 16) {
			System.out.println("Invalid card number");
			System.exit(0);
		} else {

			for (int i = 0; i < cardChecker.length; i++) {
				try {
					cardChecker[i] = Integer.parseInt(String.valueOf(stringValueOfcardNumber.charAt(i)));
				} catch (NumberFormatException e) {
					System.err.println("Wrong Card Input!");
					break;
				}
			}
			if (cardChecker[0] == 3 && cardChecker[1] == 7) {
				checkCardType(cardChecker[1]);
			} else if (cardChecker[0] == 7) {
				checkCardType(0);
			} else {
				checkCardType(cardChecker[0]);
			}
		}
		boolean isValid;
		int result = sumOfDoubleEvenPlace(cardChecker) + sumOfDigitsInOddPlace(cardChecker);
		System.out.println();
		if (result % 10 == 0) {
			isValid = true;
		} else {
			isValid = false;
		}
		return isValid;
	}

	public void runApp() {
		System.out.print("Enter Card Number: ");
		String number = in.nextLine();

		if (isValid(number)) {
			System.out.println("THIS CARD IS VALID!");
		}
		else {
			System.out.println("THIS CARD IS NOT VALID!");
		}
	}

	public static void main(String[] args) {
		CardValidation cardValidator = new CardValidation();
		cardValidator.runApp();
	}
}
