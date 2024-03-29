package code.program;


import java.util.List;



public class NetworkHandlerResponse {

	public static final String SUCCESS = "success";
	public static final String FAILURE = "fail";
	private String status;
	private String errorCode;
	private String errorText;
	private List<String> responseList;
	private Exception activationException;
	
	
	
	public NetworkHandlerResponse(String status, String errorCode, String errorText,  List<String> responseList, Throwable exception) {
		super();
		this.status = status;
		this.errorCode = errorCode;
		this.errorText = errorText;
		this.responseList = responseList;
		this.activationException = activationException;
	}

	public Exception getActivationException() {
		return activationException;
	}

	public void setActivationException(Exception activationException) {
		this.activationException = activationException;
	}

	public List<String> getResponseList() {
		return responseList;
	}

	public void setResponseList(List<String> responseList) {
		this.responseList = responseList;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @return the errorText
	 */
	public String getErrorText() {
		return errorText;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param errorCode
	 *            the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @param errorText
	 *            the errorText to set
	 */
	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DeviceResponse [status=" + status + ", errorCode=" + errorCode + ", errorText=" + errorText + "]";
	}
}
