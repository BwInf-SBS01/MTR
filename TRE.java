public class TRE extends IllegalArgumentException {
	private static final long serialVersionUID = 1L;
	public String message;
	public TRE(String message) {
		super(message);
		this.message = message;
	}
}
