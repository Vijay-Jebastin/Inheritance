package orginfosys;

public class SignIn extends UserDetails {
	
	public void logIn() {
		System.out.println("enter user details");
	}

	public void name() {
		System.out.println("Vijay");
	}
	public static void main(String[] args) {
		SignIn a = new SignIn();
		a.logIn();
		a.name();
		a.userName();
		a.passWord();
	}
	
}
