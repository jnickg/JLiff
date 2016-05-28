package worldStuff;

public class World {
	public static final String[] DefaultLimitedResources = {
			"metal",
			"stone",
			"waste",
			"organics"
	};
	
	public static final String[] DefaultBottomlessResources = {
			"elevation",
			"light",
			"water",
			"temperature"
	};
	
	public static final int DefaultWidth = 1000;
	public static final int DefaultHeight = 1000;
	
	Region[][] _regions;
	
	public World() {
		this._regions = new Region[DefaultHeight][DefaultWidth];
	}

}
