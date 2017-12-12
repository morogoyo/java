package kraken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Array;

public class XmlReading {

	    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
	    public static String TEST_XML_STRING = "test.xml";
	    private static String fileContent ;
	        

	    public static void main(String[] args) {

			BufferedReader br = null;

			try {

				String sCurrentLine;

				br = new BufferedReader(new FileReader("C:/Users/RTORRES/workspace/kraken/src/kraken/test.xml"));

				while ((sCurrentLine = br.readLine()) != null) {
					//System.out.println(sCurrentLine);
					fileContent = sCurrentLine;
					//System.out.println(fileContent);// test print to the console 
					
				}

			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null)br.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			
		writeFile(fileContent);
		System.out.print(fileContent);
	    
	    }
	    
public static void writeFile(String file){
	    	
	    	try{
				PrintWriter w = new PrintWriter(file);
				w.write(file);
				w.close();
				System.out.println("the file print worked");
				
				
			}catch(Exception e ){
				System.out.print(e);
				System.out.print("se jodio lol");
				
			}
	    }
	    

	}