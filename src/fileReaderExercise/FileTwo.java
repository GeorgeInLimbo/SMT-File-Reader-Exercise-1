package fileReaderExercise;

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

	private FileOne one = new FileOne("TextFile.txt");
	private FileOne two = new FileOne("TextFile2.txt");

	/**
	 * Main method which runs the executeProcedure() method to accomplish the given
	 * prompt
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileTwo two = new FileTwo();
		two.executeProcedure();
	}

	/**
	 * This method runs the procedure which allows us to read the file from Object
	 * 1, retrieve that information, and save it to a new file.
	 * @throws IOException 
	 */
	public void executeProcedure() throws IOException {
		one.fileReader();
		two.writeToFile(one.getTextFromFile().toUpperCase());
	}
}