import java.util.*;

// Milestone manager manages all milestones in the system
public class MilestoneManager{

	// Static list of all milestones in system
	protected static ArrayList<Milestone> milestoneList = new ArrayList<Milestone>();

	// Creates a new milestone and adds it to the milestone list
	public static Milestone createMilestone(String milestoneName, int projectID, Date startDate, Date endDate){
		Date newDate = new Date();
		if(startDate != null) // if date was provided set start date to then, else set to current date
			newDate = startDate;
		int newID = milestoneList.get(milestoneList.size() - 1).getID() + 1; // Get ID of last milestone in list and add 1
		Milestone newMilestone = new Milestone(newID, milestoneName, projectID, newDate, endDate);
		milestoneList.add(newmilestone);
		return newMilestone;
	}

	// Finds milestone based off of provided ID
	public static Milestone getMilestone(int milestoneID){
		int listSize = milestoneList.size() - 1; // Position of last item in list
		for(int i = 0; i < listSize; i++){
			if(milestoneList.get(i).getID() == milestoneID) // if milestone is one we're looking for
				return milestoneList.get(i);
		}
		return null;
	}

	// Removes a milestone from system
	public static void removeMilestone(int milestoneID){
		Milestone p = getMilestone(milestoneID); // Finds milestone
		milestoneList.remove(p); // Removes it
	}

}
