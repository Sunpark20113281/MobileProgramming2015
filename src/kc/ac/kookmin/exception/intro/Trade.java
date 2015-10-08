package kc.ac.kookmin.exception.intro;

import java.io.FileReader;

class Trade {
	
	public void readFile() {
		String path = Test.class.getResource("").getPath();
		FileReader Rd = new FileReader(path+"a.txt");
	}
	
	public void close() {
		try {
			
			
		}
	}

}

