package inheritance2;

public class LogManager {

	public void log( int logType ) {
		
		if( logType == 1  ) {
			System.out.println("VeriTabanýna Loglandý");
		}else if( logType == 2 ) {
			System.out.println("Dosya'ya Loglandý");
		}else {
			System.out.println("Mail'e Loglandý");
		}
		
	}
	
}

// 1- Database
// 2- File
// 3- Email