package kc.ac.kookmin.exception.fileio;

import java.io.*;

/**
Makes numbered.txt the same as original.txt, but with each line numbered.
*/
public class AddLineNumber
{
  public static void main(String[] args)
  {
	 String[] TEXTLine = new String[6];
	 
     try{
        BufferedReader inputStream = 
              new BufferedReader(new FileReader("C:\\eclipse\\original.txt"));
        PrintWriter outputStream = 
              new PrintWriter(new FileOutputStream("C:\\eclipse\\numbered.txt"));

         /** �����Ͻÿ�. **/
        for(int i=0; i<6; i++) {
        	TEXTLine[i] = inputStream.readLine(); 
        }
        
        for(int j=0; j<6; j++) {
        	outputStream.println( j+1 + " " + TEXTLine[j]);
        }
            
        inputStream.close( );
        outputStream.close( );
     }
     
     /** catch() ���� �ۼ��Ͻÿ� **/
     catch (FileNotFoundException e){
    	 System.out.println("������ ã�� �� �����ϴ�.");
     }
     
     catch (IOException e){
    	 System.out.println("����");
     }
  }
}

