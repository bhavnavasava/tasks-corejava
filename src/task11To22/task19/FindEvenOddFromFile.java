package task11To22.task19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindEvenOddFromFile {
	public static void main(String[] args) throws IOException, FileNotFoundException {

		/*
		 * File f = new File("C:\\JAVA"); f.mkdir();
		 */
		File file = new File("C:\\JAVA\\java\\demo.txt");
		File E = new File("C:\\JAVA\\java\\even.txt");
		File O = new File("C:\\JAVA\\java\\odd.txt");

		Scanner scr = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(file);
		for (int i = 1; i <= 5; i++) {
			System.out.println("enter number:");
			int num = scr.nextInt();
			pw.println(num);
			
		}
		
		pw.close();

		BufferedReader br = new BufferedReader(new FileReader(file));
		PrintWriter pw1 = new PrintWriter(O);
		PrintWriter pw2 = new PrintWriter(E);

		while (true) {
			String num = br.readLine();
			if (num == null)
				break;

			if (Integer.parseInt(num) % 2 == 0) {
				pw1.println(num);

				System.out.println(num + " even");

			} else {
				pw2.println(num);
				System.out.println(num + " odd");
			}
		}
		br.close();
		pw1.close();
		pw2.close();
	}

}
