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
	 * file with a Yogi Berra quote
	 */
	public void writeToFile() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(file));
			writer.write("When you see a fork in the road, take it.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method uses BufferedReader to take text from a file and display it to
	 * the console
	 */
	public void fileReader() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			System.out.println(reader.readLine());
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Getter for the file name variable called "file"
	 * 
	 * @return the value associated with the file variable
	 */
	public String getFile() {
		return file;
	}
}