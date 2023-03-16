package orginfosys;

public class UserDetails {
	
	public void userName() {
		System.out.println("print the user name");
	}
	
	public void passWord() {
		System.out.println("type the password");

	}
	public static void main(String[] args) {
		UserDetails a = new UserDetails();
		a.userName();
		a.passWord();
	}

}
