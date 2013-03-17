package ru.osm.dkiselev.mpreader.sections;

import java.util.List;


public abstract class SectionBase implements Section {

	private List<String> comments;
	
	@Override
	public void setComments(List<String> comments) {
		this.comments = comments;
	}
	
	public List<String> getComments() {
		return comments;
	}

}
