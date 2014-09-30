
public class Task {
	private int tid;
	private String name;
	private int projectID;
	private String description;
	public String status;
	public boolean inMilestone;
	public String assignedMemeber;
	
	public Task(int TaskID, String Name, int ProjectID, String Description){
		name = Name;
		description = Description;
		tid = TaskID;
		projectID = ProjectID;
	}
	
	private void updateTask(String Name, String Description, String Status, String AssignedMember ){
		if (Name != null)
			this.name = Name;
		if (Description != null)
			this.description = Description;
		if (Status != null)
			this.status = Status;
		if (AssignedMember != null)
			this.assignedMemeber = AssignedMember;
	}
	
	public int getTID(){
		return this.tid;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String Name){
		this.name = Name;
	}
	
	public int getProjectID(){
		return this.projectID;
	}
	
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String Description){
		this.description = Description;
	}
	
	public String getStatus(){
		return this.status;
	}
	public void setStatus(String Status){
		this.status = Status;
	}
	
	public boolean getInMilestone(){
		return this.inMilestone;
	}
	public void setInMilestone(boolean InMilestone){
		this.inMilestone = InMilestone;
	}
	
	public String getAssignedMember(){
		return this.assignedMemeber;
	}
	public void setAssignedMember(String AssignedMember){
		this.assignedMemeber = AssignedMember;
	}
}

