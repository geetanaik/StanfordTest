import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {
	
	static File file= new File("/Users/GeetaDeokar/desktop/data.rtf");
	
	public List<String> ReadFile(File Source) throws IOException{
		
		if(file.exists())
		{
			System.out.println("file found");	
			//InputStream IS=new FileInputStream(file);
			List<String> datalist= new ArrayList<String>();
			BufferedReader reader= new BufferedReader(new FileReader(file));
			String s;
			while((s=reader.readLine())!=null) {
				
					System.out.println(s);
					datalist.add(s);
				}
			System.out.println(datalist);
			return datalist;
		}
		return null;
		
	}
	
    
	public static void main(String[] args)  throws IOException{
		
		new Solution1().ReadFile(file);
	/*	byte[] b=new byte[50];
		int lengthread = 0;
		File file= new File("/Users/GeetaDeokar/desktop/data.rtf");*/
		//if(file.exists()) {
		//	System.out.println("file found");
		/*	try {
				InputStream IS=new FileInputStream(file);
				while((lengthread =IS.read(b))!=-1 ) {
				
					System.out.println(b.toString());
					
				}
				
				
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		}*/
		
	}

}
