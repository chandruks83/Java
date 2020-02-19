
public class TestAccount {

	public static void main(String[] args) {
		Account chandruAcnt = new Account("Chandru", 1234, 9886, 1000);
		chandruAcnt.withDraw(200);
		chandruAcnt.depositeAmount(500);
	}
}
