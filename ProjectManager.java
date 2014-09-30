import java.util.*;

// Project Manager manages all of the projects inside of the system
// and provides methods for other objects to interact with projects
public class ProjectManager{

	// Static list of all projects
	protected static ArrayList<Project> projectList = new ArrayList<Project>();

	// Creates new project and adds it to project list
	public static Project createProject(String projectName, Date endDate){
		Date currentDate = new Date(); // gets current date
		int newID = projectList.get(projectList.size() - 1).getID() + 1; // Get ID of last project in list and add 1
		Project newProject = new Project(newID, projectName, currentDate, endDate);
		projectList.add(newProject);
		return newProject;
	}

	// Finds project using a provided ID
	public static Project getProject(int projectID){
		int listSize = projectList.size() - 1; // get's position of last item in list
		for(int i = 0; i < listSize; i++){
			if(projectList.get(i).getID() == projectID) // if project is one we're looking for
				return projectList.get(i);
		}
		return null;
	}

 	// Removes a project from the list using an ID
	public static void removeProject(int projectID){
		Project p = getProject(projectID); // Finds project
		projectList.remove(p); // Removes project
	}

}
