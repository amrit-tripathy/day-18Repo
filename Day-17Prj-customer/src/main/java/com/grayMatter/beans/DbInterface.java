package com.grayMatter.beans;

import java.util.List;

public interface DbInterface {
	
	public List<Regions>getAll();
	public Regions addRegion(Regions region);
	public String deleteRegion(int id);
	public Regions updateRegion(Regions region);
}
