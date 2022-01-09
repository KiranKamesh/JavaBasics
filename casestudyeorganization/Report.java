package casestudyeorganization;

public class Report extends Ceo {
	private int number;
	private String date;
	private String task;
	private String project;

	public Report(String login, String password, int number, String date, String task, String project) {
		super(login, password);
		this.number = number;
		this.date = date;
		this.task = task;
		this.project = project;
	}

	public Report() {
		// TODO Auto-generated constructor stub
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		if (date.equals("23-09-2021")) {
			System.out.println("Exceeded the deadline");
		} else {
			this.date = date;
		}
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

}
