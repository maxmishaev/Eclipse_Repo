package mishaev.Lesson8;

public class RunRoad implements Prepyatstviya {
	private String type;
	private int distRoad;
	
	RunRoad(String type, int distRoad) {
		this.type = type;
		this.distRoad = distRoad;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getRoadDist() {
		return distRoad;
	}
	
	public void setRoadDist(int distRoad) {
		this.distRoad = distRoad;
	}
	
}