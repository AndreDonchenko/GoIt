package ua.goit.group17.coreexam;

import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		Anagram anagram=new Anagram(".\\src\\ua\\goit\\group17\\coreexam\\anagram.txt"); 

		System.out.println("��������� ���������:");
		List<String> words = anagram.getAnagramFromFile();
		for (String s : words) {
			System.out.println(s);
		}
		
		System.out.println();
		String word="��������";
		System.out.println("��������� � �����: " + word + " - " + anagram.getAnagramInFile(word));
	}
	
}
