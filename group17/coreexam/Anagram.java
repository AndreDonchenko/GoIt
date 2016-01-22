package ua.goit.group17.coreexam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Anagram {

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

	public List<String> getAnagramFromList(List<String> words) {
		LinkedList<String> resultList = new LinkedList<String>();
		StringBuilder resultString;
		boolean isFindAnagram = false;
		List<String> wordsClone = words;
		
		for (String s1: words) {
			resultString=new StringBuilder(s1);
			isFindAnagram=false;
			
			for (String s2: wordsClone) {
					if (isAnagram(s1, s2)) {
						isFindAnagram = true;
						resultString.append(", " + s2);
					}
			}
			if (isFindAnagram) resultList.add(resultString.toString());
		}
		return resultList;
	}
	
	public String getAnagramInList(List<String> words, String word) {
		for (String s: words) {
			if (isAnagram(word, s)) return s;
		}
		return "";
	}
}
