package kc.ac.kookmin.exception.intro;

import java.io.*;

class Trade {
	
	BufferedReader MEMORY = null;
	public void readFile() {
		try {
		FileReader TEST = new FileReader("C:\\eclipse\\a.txt");
		MEMORY = new BufferedReader(TEST);
		String M;
		M = MEMORY.readLine();
		System.out.println(M);
		System.out.println(MEMORY.readLine());
		}
		
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
		
		finally {
			try {
				MEMORY.close();
				System.out.println("종료");
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void close() {
		try {
			if (MEMORY!=null){
				MEMORY.close();
				System.out.println("종료");
			}
		}
		
		catch (FileNotFoundException e){
			e.printStackTrace();
		}
		catch (IOException e){
			e.printStackTrace();
		}
	}

}

