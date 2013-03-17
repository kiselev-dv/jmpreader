package ru.osm.dkiselev.mpreader.sections;

import java.util.List;


public interface SectionReader<T extends Section> {

	public void setComments(List<String> comments, T section);

	public T newSection();

	public void endSection(T section);

	public void readLine(String line, T currentSection);

}
