package net.gmsworld.server.camel;

import java.util.HashMap;
import java.util.Map;

public class Feature {
	
	public final String type = "Feature";
	
	public String _id = null;
	
	public Map<String, Object> properties = new HashMap<String, Object>();
	
	public Geometry geometry;
    
}
