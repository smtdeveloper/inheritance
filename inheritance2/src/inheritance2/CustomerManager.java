package inheritance2;

public class CustomerManager {

	public void add( Logger logger ) {
		System.out.println("Müþteri eklendi");
		
		logger.log();
		
	//	DatabaseLogger databaseLogger = new DatabaseLogger();
	//	databaseLogger.log();
	// soyut sýnýf ( iþ yapan sýnýf new'lenmez ! )
		
	}
}
