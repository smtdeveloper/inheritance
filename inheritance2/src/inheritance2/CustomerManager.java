package inheritance2;

public class CustomerManager {

	public void add( Logger logger ) {
		System.out.println("M��teri eklendi");
		
		logger.log();
		
	//	DatabaseLogger databaseLogger = new DatabaseLogger();
	//	databaseLogger.log();
	// soyut s�n�f ( i� yapan s�n�f new'lenmez ! )
		
	}
}
