
/**
 * @class InvalidTypeException
 * @author chahat
 * @description InvalidTypeException is a custom exception class which is raised 
 * when user enters the type of item other than raw, manufactured and imported.
 */

package business.exception;

public class InvalidTypeException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTypeException(String msg) {
		super(msg);
	}

}
