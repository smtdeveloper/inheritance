package inheritance2;

public class LogManager {

	public void log( int logType ) {
		
		if( logType == 1  ) {
			System.out.println("VeriTaban�na Logland�");
		}else if( logType == 2 ) {
			System.out.println("Dosya'ya Logland�");
		}else {
			System.out.println("Mail'e Logland�");
		}
		
	}
	
}

// 1- Database
// 2- File
// 3- Email