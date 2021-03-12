package utils;

import java.util.Scanner;

public class KeyInput {
	public static String input(Scanner sc,String mess) {
		String result = sc.next(mess);
		return result;
	}
}
