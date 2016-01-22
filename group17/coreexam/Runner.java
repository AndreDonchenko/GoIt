package ua.goit.group17.coreexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {

		
		Scanner inList=null;
		ArrayList<String> words = new ArrayList<String>();
		try {
			inList = new Scanner (new BufferedReader(new FileReader(".\\src\\ua\\goit\\group17\\coreexam\\anagram.txt")));
			while (inList.hasNext()) {
				words.add(inList.next().trim());
			}
		} catch (FileNotFoundException e) {
			/* !!!! БЛОК ДОДЕЛАТЬ !!!!*/
			e.printStackTrace();
		} finally {
			if (inList!=null) {
				inList.close();
			}
		}	
		
		Anagram anagram=new Anagram(); 

		System.out.println("Найденные анаграммы:");
		List<String> anagrams = anagram.getAnagramFromList(words);
		for (String s : anagrams) {
			System.out.println(s);
		}
		
		System.out.println();
		String word="спаниЕль";
		System.out.println("Анаграмма к слову: " + word + " - " + anagram.getAnagramInList(words, word));
	}
	
}
