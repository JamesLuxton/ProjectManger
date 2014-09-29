import java.util.Date;
import java.util.List;

public class Milestone {
	
	private int Mid; 
	private String Name;
	private int ProjectPointer;	// ID of project created in
	private Date StartDate;
	private Date EndDate;
	private List<Task> TaskList;
	
	public TaskManager taskManager = new TaskManager();
	
	/**
	 * Create a new Milestone when provided with a name
	 * @param MileID = ID to assign the new Milestone
	 * @param MileName = Name of the new MileStone
	 * @param MileStartDate = Date the Milestone will begin
	 * @param MileEndDate = Date Milestone will be checked for completion
	 * @param ProjectID = current project ID
	 */
	public Milestone(int MileID, String MileName, Date MileStartDate, Date MileEndDate, int ProjectID){
		Mid = MileID;
		Name  = MileName;
		ProjectPointer = ProjectID; 
		StartDate = MileStartDate;
		EndDate = MileEndDate;
	}
	
	public int getID(){
		return this.Mid;
	}
	
	public int getPointer(){
		return this.ProjectPointer;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public Date getStartDate(){
		return this.StartDate;
	}
	
	public Date getEndDate(){
		return this.EndDate;
	}
	
	public void setName(String setName){
		this.Name = setName;
	}
	
	/**
	 * Adds a Task to the current Milestone
	 * @param Tid = Task ID to be added to the Milestone
	 */
	public void AssignTask(int Tid){
		TaskList.add(TaskManager.getTask(Tid));
	}
}
