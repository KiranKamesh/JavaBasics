package casestudyeorganization;

public class Project extends Ceo{
	private int ID;
	private int taskID;
	private int accessNumber;
	private String name;
	
	public Project(String login, String password, int iD, int taskID, int accessNumber, String name) {
		super(login, password);
		ID = iD;
		this.taskID = taskID;
		this.accessNumber = accessNumber;
		this.name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getTaskID() {
		return taskID;
	}
	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	public int getAccessNumber() {
		return accessNumber;
	}
	public void setAccessNumber(int accessNumber) {
		this.accessNumber = accessNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
