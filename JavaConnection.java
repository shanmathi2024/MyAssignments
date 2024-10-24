package week2.day4;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Connecting to the database...");
		
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnecting from the database...");
		
	}

	@Override
	public void executeUpdate() {
		 System.out.println("Executing update");
		
	}
	@Override
	public void executeQuery() {
		 System.out.println("Executing query");
		
	}

	public static void main(String[] args) {
		JavaConnection c= new JavaConnection();
        
		c.connect();
		c.executeUpdate();
		c.disconnect();
		c.executeQuery();
    }}
	


