package task11To22.task21;

import java.io.File;
import java.util.Scanner;

class File1 {
	@Override
	public String toString() {
		String file = null;
		return file;
	}
}

public class FileFoundFromFolder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter path");
		String path = sc.next();
		File file = new File(path);
		System.out.println(file);

		if (file.isDirectory()) {
			int count = 0;

			// File[] f=file.listFiles();
			File[] files = file.listFiles();
			for (File file1 : files) {
				if (file1.getName().endsWith("java")) {
					count++;
				}
			}
			System.out.println("number of java files is " + count);

		} else {
			System.out.println("invalid");
		}
	}
}