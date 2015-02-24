/**
 * Write a description of class GradeTracker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GradeTracker
{
	public static void readFile()
    {
    String s;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the file name to read: ");
    s = in.nextLine();
    try{
	File file = new File(s);
    FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	StringBuffer stringBuffer = new StringBuffer();
	String line;
        while ((line = bufferedReader.readLine()) != null) {
	 	 String[] arr = line.split(" ");
	 	 double total = Double.parseDouble(arr[1]) + Double.parseDouble(arr[2]) + Double.parseDouble(arr[3]);
                 System.out.print(arr[0] +": ");
                 System.out.println(String.format("%.2f", total));
	}
	fileReader.close();
        System.out.println(stringBuffer.toString());
        } catch (IOException e) {
              e.printStackTrace();
            }
    }
    
    public static void main(String[] args)
    {
        GradeTracker g1 = new GradeTracker();
        g1.readFile();
    }
}
