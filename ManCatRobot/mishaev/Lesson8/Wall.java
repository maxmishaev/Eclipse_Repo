package mishaev.Lesson8;

public class Wall implements Prepyatstviya {
	private String type;
	private int heightWall;
	
	Wall(String type, int heightWall) {
		this.type = type;
		this.heightWall = heightWall;
		
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getWallHeight() {
		return heightWall;
	}
	
	public void setWallHeight(int heightWall) {
		this.heightWall = heightWall;
	}
		
}
