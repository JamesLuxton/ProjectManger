import java.util.*;

// Task manager manages all tasks in the system
public class TaskManager{

	// Static list of all tasks in system
	protected static ArrayList<Task> taskList = new ArrayList<Task>();

	// Creates a new task and adds it to the task list
	public static Task createTask(String taskName, int projectID, String taskDescription){
		int newID = taskList.get(taskList.size() - 1).getID() + 1; // Gets ID of last item in list and adds one
		Task newTask = new Task(newID, taskName, projectID, taskDescription);
		taskList.add(newTask);
		return newTask;
	}

	// Finds a task based off of task ID
	public static Task getTask(int taskID){
		int listSize = taskList.size() - 1; // get position of last item in list
		for(int i = 0; i < listSize; i++){
			if(taskList.get(i).getID() == taskID) // if task ID = provided ID
				return taskList.get(i); // return correct task
		}
		return null;
	}

	// Returns a list of tasks not assigned to a milestone
	public static ArrayList<Task> getUnassignedTasks(){
		ArrayList<Task> list = new ArrayList<Task>();
		int listSize = taskList.size() - 1; // get position of last item in list
		for(int i = 0; i < listSize; i++){
			if(taskList.get(i).isInMilestone() == false) // Will need to change this method name when class is created
				list.add = taskList.get(i); // Adds task to temp list
		}
		return list;
	}

}
