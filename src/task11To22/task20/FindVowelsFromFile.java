package task11To22.task20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FindVowelsFromFile {
	private static int count;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter path");
		String path = sc.next();
		File file = new File(path);
		if(file.exists()) {
			
		System.out.println(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		while (true) {
			int s = br.read();
			if (s == -1) {
				break;
			}
			if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' || s == 'A' || s == 'E' || s == 'I' || s == 'O'
					|| s == 'U') {
				count++;

			}
		}

		System.out.println("number of vowels is " + count);
		br.close();
	
	}else {
		System.out.println("file is not found");
	}
}

}
