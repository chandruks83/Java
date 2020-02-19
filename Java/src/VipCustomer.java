
public class VipCustomer {
	private String name;
	private long creditLimit;
	private String email;
	
	public VipCustomer() {
		this("default", 20, "a@b.com");
	}
	
	public VipCustomer(String name, long creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}
	
	public VipCustomer(String name, String email) {
		this(name, 1000, email);
	}

	public String getName() {
		return name;
	}

	public long getCreditLimit() {
		return creditLimit;
	}

	public String getEmail() {
		return email;
	}
}
