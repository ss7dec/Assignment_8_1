//Assignment 8.1
// Write a program for file copy.
//Note: Destination file should have same contents as Source file.


package assignment_8_1;

/*
 * This Assignment helped me to master the concepts of File handling .
 */


import java.io.*;    //importing all classes from java's io library.. Because it has File related Classes needed for this Assignment.

public class FileCopy_Demo {  //Class declaration containing main function
	
	     
	
		public static void main(String[] args) throws Exception  //main function declaration. and because it is static, program execution starts from main function. 
		{
			//In this program, we will first read from the file and we will write that content to another file.
			//We will create the object of FileInputStream and will pass the object of File containing file Path to its constructor.
			FileInputStream readSource_file = new FileInputStream("C://Users/ADMIN/Desktop/Source_file.txt");
			
			//We will create the object of FileOutputStream and will pass the object of File containing filePath to its constructors.
			FileOutputStream writeSource_file = new FileOutputStream("C://Users/ADMIN/Desktop/Destination_file.txt");
			
			byte[] readerArray = new byte[1024];     //byte array to read from the file.
			int len;     //int variable to locate the length of File.
			
			//While loop to read the file till and write in the file.
			while((len=readSource_file.read(readerArray))>0)
			{
				writeSource_file.write(readerArray, 0, len);    //writing in the file from readerArray.
			}
			
			//Closing FileInputStream and FileOutputStream Objects.
			readSource_file.close();
			writeSource_file.close();
			
				
			System.out.println("File has been created.\n\n");    //Printing Statement.
			
			System.out.println("Displaying the contents of the given Destination file as : \n\n");    //Printing Statement.
			
			//Now we are reading created file.
			//Creating the object of BufferedReader and passed the path of File by FileReader.
			BufferedReader readDestination_file = new BufferedReader(new FileReader("C://Users/ADMIN/Desktop/Destination_file.txt"));
			String lineReader;             //String reference to read the line from the file.
			
			//While loop to read from the file and printing on the console.
			while((lineReader = readDestination_file.readLine()) != null)
			{
				System.out.println(lineReader);   //Printing the Statement.
			}
			
			//Closing BufferedReader object.
			readDestination_file.close();
			
		}     //End of main function.

}

		

