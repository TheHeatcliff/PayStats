/**
 * 
 */
package ar.com.gl.paystadistics.exceptions;

/**
 * @author n.gonzalez
 *
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message,Throwable e) {
        super(message,e);
    }

}
