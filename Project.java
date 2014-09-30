public class Project {

    private int pid_;
    private String name_;
    //private int currentDate_;
	private Date currentDate_ = new Date();
	private Date endDate_;
	// trying to find better way to store the date
	public Project(int pid, String name, Date currentDate, String endDate)
	{
		pid_ = pid;
		name_ = name;
		currentDate_ = currentDate;
		endDate_ = endDate;
	}
	// getter & setter 
    public int getPid(){
		return this.pid_;
	}
	public void setPid(int Pid){
		this.pid_ = Pid;
	}
	public String getName(){
		return this.name_;
	}
	public void setName(String Name){
		this.name_ = Name;
	}
	public Date getCurrentDate(){
		return this.currentDate_;
	}
	public void setCurrentDate(Date currentDate){
		this.currentDate_ = currentDate;
	}
	public Date getendDate(){
		return this.endDate_;
	}
	public void setEndDate(Date EndDate){
		this.endDate_ = EndDate;
	}
	
	// methods
	private void updateProject(String Name){
		if (Name != null)
			this.name_ = Name;
	}
	
}

