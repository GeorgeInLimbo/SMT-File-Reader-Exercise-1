package fileReaderExercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/****
 * 
 * <b>Title:</b> FileTwo.java<br>
 * <b>Project:</b> fileReaderExercise<br>
 * <b>Description:</b>This class serves as Object 2 in the assignment prompt and
 * will print the text from the file written in Object 1, save the text to
 * uppercase, and save it to a second text file. <br>
 * <b>Copyright:</b> Copyright (c) 2023<br>
 * <b>Company:</b> Silicon Mountain Technologies<br>
 * 
 * @author George Clam
 * @version 1.0
 * @since Jan 12 2023
 * @updates:
 ****/

public class FileTwo {

	private String yogiQuote;
	private FileOne one = new FileOne("TextFile.txt");

	/**
	 * Main method which runs the executeProcedure() method to accomplish the given
	 * prompt
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FileTwo two = new FileTwo();
		two.executeProcedure();
	}

	/**
	 * This method runs the procedure which allows us to read the file from Object
	 * 1, retrieve that information, and save it to a new file.
	 */
	public void executeProcedure() {
		one.writeToFile();
		one.fileReader();
		retrieveYogiQuote();
		createFileTwo();
		System.out.println(yogiQuote); // For testing

	}

	/**
	 * This method reads the Yogi Berra quote from the text file from Object 1 and
	 * sets it to the Object 2 member variable yogiQuote
	 */
	public void retrieveYogiQuote() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(one.getFile()));
			setYogiQuote(reader.readLine().toUpperCase());
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method creates a new file and populates it with text in the form of a
	 * Yogi Berra quote
	 */
	public void createFileTwo() {
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("TextFile2.txt"));
			writer.write(yogiQuote);
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param quote the yogiQuote to set
	 */
	public void setYogiQuote(String quote) {
		this.yogiQuote = quote;
	}
}