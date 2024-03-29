package code.program;


public enum Status {
	SUCCESS("success"), FAILURE("failure");

	String statusText;

	Status(String statusText) {
		this.statusText = statusText;
	}

	public String getStatus() {
		return this.statusText;
	}
}