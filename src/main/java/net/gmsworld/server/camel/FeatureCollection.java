package net.gmsworld.server.camel;

import java.util.Collection;

public class FeatureCollection {
	
	public final String type = "FeatureCollection";
	
	public Collection<Feature> features;

	public String name = null;
	
	public String deviceId = null;
}
