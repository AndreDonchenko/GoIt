package ua.goit.group17.coreexam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Anagram {
	private ArrayList<String> words=null;

	public static boolean isAnagram(String str1, String str2){	
		if (str1.compareToIgnoreCase(str2)==0) return false;
		if (str1.length()!=str2.length()) return false;
		
		char[] charsStr1 = str1.toUpperCase().toCharArray();
		char[] charsStr2 = str2.toUpperCase().toCharArray();
		
		Arrays.sort(charsStr1);
		Arrays.sort(charsStr2);
		
		if (Arrays.equals(charsStr1, charsStr2)) return true;
				else return false;
	}
	

	public Anagram(String fileName) {
		Scanner s=null;
		words = new ArrayList<String>();
		try {
			s = new Scanner (new BufferedReader(new FileReader(fileName)));
			while (s.hasNext()) {
				words.add(s.next().trim());
			}
		} catch (FileNotFoundException e) {
			/* !!!! акнй дндекюрэ !!!!*/
			e.printStackTrace();
		} finally {
			if (s!=null) {
				s.close();
			}
		}	
	}
	
	
	public List<String> getAnagramFromFile() {
		LinkedList<String> resultList = new LinkedList<String>();
		String resultString;
		boolean isFindAnagram;
		
		for (int i=0; i < words.size(); i++) {
			resultString=words.get(i);
			isFindAnagram=false;
			
			for (int j=0; j < words.size(); j++) {
				if (i!=j) {
					if (isAnagram(words.get(i), words.get(j))) {
						isFindAnagram = true;
						resultString = resultString + " - " + words.get(j);
					}
				}
			}
			if (isFindAnagram) resultList.add(resultString);
		}
		return resultList;
	}
	
	
	public String getAnagramInFile(String word) {
		for (int j=0; j < words.size(); j++) {
			if (isAnagram(word, words.get(j))) {
				return words.get(j);
			}
		}
		return "";
	}
}
