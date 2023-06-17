package vTigerPOJOLibraries;

/**
 * 
 * @author Chaitra M
 *
 */
public class UserLibrary {

	// Step 1: declare variable globally
	String name;
	String job;

	// Step 2: Create a constructor for initilaisation
	public UserLibrary(String name, String job) {
		this.name = name;
		this.job = job;
	}

	// Step 3: provide getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

}
