package code.program;


import java.io.Serializable;
import java.util.HashMap;



/**
 * @author 609756469
 *
 * @param <T>
 */
public class ServiceResponse<T> implements Serializable {

	private static final long serialVersionUID = 6128016096756071387L;
	/**
	 * errorType
	 */
	private String errorType;
	/**
	 * status
	 */
	private Status status;
	/**
	 * responseObject
	 */
	private T responseObject;
	/**
	 * activationException
	 */
	private Exception activationException;

	private HashMap<Object, Object> responseAttributes = new HashMap<Object, Object>();

	/**
	 * @return
	 */
	public String getStatus() {
		return status.getStatus();
	}

	/**
	 * @param status
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	/**
	 * @return
	 */
	public T getResponseObject() {
		return responseObject;
	}

	/**
	 * @param responseObject
	 */
	public void setResponseObject(T responseObject) {
		this.responseObject = responseObject;
	}

	/**
	 * @return
	 */
	public Exception getActivationException() {
		return activationException;
	}

	/**
	 * 
	 * @param activationException
	 * 
	 */
	public void setActivationException(Exception activationException) {
		this.activationException = activationException;
	}

	/**
	 * 
	 * @return
	 * 
	 */
	public String getErrorType() {
		return errorType;
	}

	public void setErrorType(String errorType) {
		this.errorType = errorType;
	}

	public Object getResponseAttribute(Object key) {
		return this.responseAttributes.get(key);
	}

	public void setResponseAttribute(Object key, Object value) {
		this.responseAttributes.put(key, value);
	}
}
