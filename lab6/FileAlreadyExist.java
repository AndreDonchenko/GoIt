package ua.goit.andre.lab6;

public class FileAlreadyExist extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String fileName;

	public FileAlreadyExist(String fileName) {
		super();
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}	
}
