package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list = readFileParseToArraylist(list);
		findSum(list);

	}

	private static void findSum(ArrayList<Integer> list) {
		int temp1;
		int temp2;
		int temp3;

		for(int i = 0; i <list.size()-1; i++) {
			for(int y = 0; y <list.size()-1; y++) {
				for(int x = 0; x <list.size()-1; x++) {
					temp1 = list.get(i);
					temp2 = list.get(y);
					temp3 = list.get(x);
					if(temp1+temp2+temp3 == 2020) {
						System.out.println("i="+temp1+"  y="+temp2+"  x="+temp3);
						System.out.println("sum of multiplication= "+(temp1*temp2*temp3));
					}
				}
			}
		}
	}

	private static ArrayList<Integer> readFileParseToArraylist(ArrayList<Integer> list) {
		try {
			Scanner scan = new Scanner(new File("input.txt"));
			int parsedInt;

			while (scan.hasNext()){
				parsedInt = Integer.parseInt(scan.next());
				list.add(parsedInt);
			}
			
			scan.close();
			
		}catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		}
		return list;
	}
}
