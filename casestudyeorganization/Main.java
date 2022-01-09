package casestudyeorganization;

public class Main {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setLogin("Kiran");
		System.out.println(e1.getLogin());
		
		Employee e2 = new Employee();
		e2.setLogin("ramesh");
		System.out.println(e2.getLogin());
		
		e2.setPassword("Kiran@!*&");
		System.out.println(e2.getPassword());
		
		Report r1 = new Report();
		r1.setDate("23-09-2021");
		System.out.println(r1.getDate());
		
		

	}

}
