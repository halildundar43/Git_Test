package day40_exceptions;

public class InvalidEmailIdCheckedException extends Exception {
	private static final long serialVersionUID = 1L; 
    // Java exception'lar�n tekrars�z olmas�n� sa�lamak i�in her exception'a unique bir kod verir
	
    InvalidEmailIdCheckedException(String message) {
        super(message);
    }
}