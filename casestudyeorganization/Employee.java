package casestudyeorganization;

public class Employee extends Ceo {

	private int ID;
	private String login;
	private String password;

	public Employee(String login, String password, int iD, String login2, String password2) {
		super(login, password);
		ID = iD;
		login = login2;
		password = password2;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		if (login.equals("Kiran")) {
			System.out.println("Not authorized");
		} else {
			this.login = login;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.contains("*!@&")) {
			this.password = password;

		}else {
			System.out.println("Invalid password");
		}
	}

}
