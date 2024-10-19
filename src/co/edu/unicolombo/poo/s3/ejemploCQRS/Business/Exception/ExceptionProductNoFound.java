
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Exception;

/**
 *
 * @author CLEYMER
 */
public class ExceptionProductNoFound extends Exception {

    /**
     * Creates a new instance of <code>ExceptionProductNoFound</code> without
     * detail message.
     */
    public ExceptionProductNoFound() {
    }

    /**
     * Constructs an instance of <code>ExceptionProductNoFound</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionProductNoFound(String msg) {
        super(msg);
    }
}
