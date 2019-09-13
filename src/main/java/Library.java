
public class Library {
    
	public static void main( String[] args) {
		
		Library lib = new Library();
		
		if( lib.someLibraryMethod() ) {
			System.out.println("When the fire is gone");
		}
	}
    
    public boolean someLibraryMethod() {
    	return true;
    }
    
}
