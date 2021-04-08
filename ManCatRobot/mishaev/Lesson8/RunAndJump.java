package mishaev.Lesson8;

public interface RunAndJump {
	
	
	public String getName();
	
	public void setName(String name);
	
	public int getMaxDist();
	
	public void setMaxDist(int maxDist);
	
	public int getMaxHeight();
	
	public void setMaxHeight(int maxHeight);
	
	public boolean getSposobnost();
	
	public void setSposobnost(boolean sposobnost);
	
	public void run(RunRoad distance);
	
	public void jump(Wall height);
	
	
	
	
}
