package ua.goit.andre.lab8;

import java.util.ArrayList;

import ua.goit.andre.lab3.file.File;
import ua.goit.andre.lab3.flower.Flower;
import ua.goit.andre.lab3.music.MusicInstrument;

public class ObjectsList {
	private ArrayList <File> fileList;
	private ArrayList <Flower> flowerList;
	private ArrayList <MusicInstrument> musicList;
	
	public ObjectsList() {
		super();
		fileList=new ArrayList<File>();
		flowerList=new ArrayList<Flower>();
		musicList=new ArrayList<MusicInstrument>();
	}

	public void add(Object addedObject) {
		if (addedObject instanceof File) {
			fileList.add((File)addedObject);
		}
		if (addedObject instanceof Flower) {
			flowerList.add((Flower)addedObject);
		}
		if (addedObject instanceof MusicInstrument) {
			musicList.add((MusicInstrument)addedObject);
		}
	};
	
	private int findIndex(Object addedObject, ArrayList list) {
		if (list.isEmpty()) return 0; else {
			for (int i=0; i<list.size(); i++) {
				if (list.get(i).toString().compareTo(addedObject.toString()) > 0) return i;
			}
			return list.size();
		}
	}

	public void addSorted(Object addedObject) {
		if (addedObject instanceof File) {
			fileList.add(findIndex(addedObject, fileList), (File) addedObject);
		}
		if (addedObject instanceof Flower) {
			flowerList.add(findIndex(addedObject, flowerList), (Flower)addedObject);
		}
		if (addedObject instanceof MusicInstrument) {
			musicList.add(findIndex(addedObject, musicList), (MusicInstrument)addedObject);
		}
	};

	public void showList() {
		System.out.print("| FileList              ");
		for (File f : fileList) {
			System.out.printf("| %-12s ", f.toString());
		}
		System.out.println("|");
		
		System.out.print("| Flower List           ");
		for (Flower f : flowerList) {
			System.out.printf("| %-12s ", f.toString());
		}
		System.out.println("|");
		
		System.out.print("| Music Instrument List ");
		for (MusicInstrument m : musicList) {
			System.out.printf("| %-12s ", m.toString());
		}
		System.out.println("|");
	}

}
