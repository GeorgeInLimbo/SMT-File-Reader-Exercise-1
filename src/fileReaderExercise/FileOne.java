package fileReaderExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/****
 * 
 * <b>Title:</b> FileOne.java<br>
 * <b>Project:</b> fileReaderExercise<br>
 * <b>Description:</b>This class serves as Object 1 in the assignment prompt. It
 * contains a constructor that takes a file name as an argument. It contains 2
 * methods, one to write a file and one to read the text from the file.<br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 12 2023
 * @updates:
 ****/

public class FileOne {

	private String file;
	private String textFromFile;

	/**
	 * Constructor that accepts a file name as an argument
	 * 
	 * @param fileName
	 */
	public FileOne(String fileName) {
		this.file = fileName;
	}

	/**
	 * This method uses BufferedWriter to create a text file, and populates that
	 * file with text from the file
	 */
	public void writeToFile(String fileText) throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(getFile()));
		writer.write(fileText);
		writer.close();
	}

	/**
	 * This method uses BufferedReader to take text from a file and display it to
	 * the console
	 */
	public void fileReader() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(getFile()));
		setTextFromFile(reader.readLine());
		reader.close();
	}

	/**
	 * Getter for the file name variable called "file"
	 * 
	 * @return the value associated with the file variable
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Sets the value for the textFromFile variable
	 * 
	 * @param the value for textFromFile to set
	 */
	public void setTextFromFile(String textFromFile) {
		this.textFromFile = textFromFile;
	}

	/**
	 * Gets the value in the textFromFile variable
	 * 
	 * @return the textFromFile value
	 */
	public String getTextFromFile() {
		return textFromFile;
	}
}