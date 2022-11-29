import java.io.*;
import java.text.*;
import java.util.*;
public class StudentList
{

	public static String getlineFromFile() throws  Exception{
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
		String line = bufferedReader.readLine();
		return line;
	}
	public  static BufferedWriter getFileBufferedWriter() throws Exception{
		return new BufferedWriter(new FileWriter("students.txt", true));
	}


	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.err.println("Invalid number of argument");
			System.err.println("Exiting Program.");
			System.exit(1);
		}

//		Check arguments
		if(args[0].equals("a"))
		{
			System.out.println("Loading data ...");			
			try
			{
			String line = getlineFromFile();
			String students[] = line.split(", ");
			for(String student : students) { System.out.println(student);
			}
			}

			catch (Exception e)
			{

			}
			System.out.println("Data Loaded.");
		}

		else if(args[0].equals("r")) 
		{
			System.out.println("Loading data ...");			
			try
			{
			String line = getlineFromFile();

			String students[] = line.split(", ");
			Random random = new Random();
				int index = random.nextInt(students.length);
					System.out.println(students[index]);
			}
			catch (Exception e)
			{

			}
			System.out.println("Data Loaded.");			
		}
		else if(args[0].contains("+"))
		{
			System.out.println("Loading data ...");			
			try
			{
			BufferedWriter bufferedWriter = getFileBufferedWriter(); 	
			String new_data  = args[0].substring(1);
	        Date date = new Date();
	        String date_format_pattern  = "dd-mm-yyyy-hh:mm:ss a";
	        DateFormat dateFormat = new SimpleDateFormat(date_format_pattern );
	        String fd= dateFormat.format(d);
			bufferedWriter.write(", "+new_data+"\nList last updated on "+formate_date);
			bufferedWriter.close();
			}
			catch (Exception e)
			{
				
			}
							
			System.out.println("Data Loaded.");	
		}
		else if(args[0].contains("?")) 
		{
			System.out.println("Loading data ...");			
			try
			{
				
			String line - getlineFromFile();
			String students[] = line.split(",");
			boolean done = false;
			String new_data  = args[0].substring(1);
			for(int idx = 0; idx<i.length && !done; idx++)
			{
				if(students[idx].equals(new_data))


				{
					System.out.println("We found it!");
						done=true;
				}
			}
			}
			catch (Exception e)
			{

			}
			System.out.println("Data Loaded.");				
		}
		else if(args[0].contains("c")) 
		{
			System.out.println("Loading data ...");			
			try
			{
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("students.txt"))); 
			String line = bufferedReader.readLine();
			char students[] = line.toCharArray();
			boolean in_word = false;
			int count=0;
			for(char student:students)
			{
				if(student  ==' ')
				{
					if (!in_word) {	count++; in_word =true;
					}
					else { in_word=false;
					}
				}
			}
			System.out.println(count +" word(s) found ");
			}
			catch (Exception e){}
			System.out.println("Data Loaded.");				
		}

		else
		{
			System.err.println("Invalid number of argument");
			System.err.println("Exiting Program.");
			System.exit(2);
		}
	}
}