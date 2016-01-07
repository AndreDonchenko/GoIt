package ua.goit.andre.lab6;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Directory extends DirectoryItem{
	TreeMap <String, DirectoryItem> entries;

	public Directory (String name) {
		super(name);
		entries=new TreeMap <String, DirectoryItem>();
	}
	
	public void  add(DirectoryItem name){
		if (entries.containsKey(name.getName())) {
			try {
				throw new FileAlreadyExist(name.getName());
			} catch (FileAlreadyExist e) {
				System.out.println("Error!!! File or Directory " + e.getFileName() + " already exists");
			}
		} else {
			entries.put(name.getName(), name);			
		}
	}
	
	
	public void  del(String name) {
		entries.remove(name);
	}
	
	public void showDirectory(String prefix) {
		for (Entry<String, DirectoryItem> entry: entries.entrySet() ) {
			DirectoryItem value = entry.getValue();

			System.out.println(prefix + value.getName());
			
			if (Directory.class.equals(value.getClass())) { 
				Directory dir = (Directory)value;
				dir.showDirectory(prefix + "\\----");
			};
		}		
	}

}
