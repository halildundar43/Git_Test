package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {
	private static final long serialVersionUID = 1L; 
    // Java exception'larýn tekrarsýz olmasýný saðlamak için her exception'a unique bir kod verir
	
    InvalidEmailIdCheckedException(String message) {
        super(message);
    }
}