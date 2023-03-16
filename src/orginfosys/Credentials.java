package orginfosys;

public class Credentials extends SignIn {
	
	private void childMethod() {
		System.out.println("contains all perks");
	}
public static void main(String[] args) {
	Credentials a = new Credentials();
	a.childMethod();
	a.logIn();
	a.passWord();
	
}
}
