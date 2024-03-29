package code.bind;

import java.io.IOException;
import java.io.PrintWriter;

import org.xml.sax.SAXException;


public class RunCommandTest {
	
	public static void main(String[] args) throws Exception {
		/*
		String gelatinParsedFilePath="C:\\Users\\611890557\\desktop\\deployment\\gelatin_parsed\\PE1-DUR-AF.cisco-config_gelatin_parsed.xml";
		String replacePart="\\";
		
		gelatinParsedFilePath=gelatinParsedFilePath.replace("\\","\\".substring(0));
		System.out.println("gelatinParsedFilePath::"+gelatinParsedFilePath);
		
		String[] command={"cmd",};
		Process p;
		try{
			p=Runtime.getRuntime().exec(command);
			// new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            // new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
             PrintWriter stdin = new PrintWriter(p.getOutputStream());
             
             stdin.println("cd C:\\Users\\611890557\\desktop\\test\\Gelatin-master\\Gelatin-master");
             String outputfile_name="C:\\Users\\611890557\\desktop\\test\\output_PE4.txt";
             String gel_location="C:\\Users\\611890557\\desktop\\test\\Gelatin-master\\Gelatin-master\\gel";
             String config_file="C:\\Users\\611890557\\desktop\\deployment\\all_configs_2017\\PE1-KEF-EU.cisco-config";
             stdin.println("python runtest.py  "+outputfile_name+" "+gel_location+" "+config_file);
            // Thread.sleep(10000);
           
          System.out.println("complete");
             stdin.close();
             p.waitFor();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	*/
		
	}
	
	
}
