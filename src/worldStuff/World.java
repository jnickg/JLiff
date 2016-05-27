package worldStuff;

public class World {
	public static final int DefaultWidth = 1000;
	public static final int DefaultHeight = 1000;
	
	Region[][] _regions;
	
	public World() {
		this._regions = new Region[DefaultHeight][DefaultWidth];
	}

}
