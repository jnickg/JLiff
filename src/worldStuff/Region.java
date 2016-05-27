package worldStuff;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class Region {
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
	
	public static final Integer DefaultLimitedResourceAmount = 1000;
	public static final Double DefaultBottomlessResourcePresence = 1.0;
	
	private Map<String, Integer> _limitedResources = new HashMap<String, Integer>();
	private Map<String, Double> _bottomlessResources = new HashMap<String, Double>();
	private double _cFactor = 1.0;
	
	private Set<Life> _life = new HashSet<Life>();

	public Region() {
		for (String rsc : DefaultLimitedResources) {
			this._limitedResources.put(rsc, DefaultLimitedResourceAmount);
		}
		for (String rsc : DefaultBottomlessResources) {
			this._bottomlessResources.put(rsc, DefaultBottomlessResourcePresence);
		}
		
	}

}
