package ru.osm.dkiselev.mpreader.sections;

import java.util.List;


public class UnknownSection implements Section {
	
	public static class UnknownSectionReader implements SectionReader<UnknownSection> {

		private static final UnknownSectionReader reader = new UnknownSectionReader();
		
		private UnknownSectionReader(){};
		
		public static UnknownSectionReader instance() {
			return reader;
		};
		
		@Override
		public void setComments(List<String> comments, UnknownSection section) {

		}

		@Override
		public UnknownSection newSection() {
			return new UnknownSection();
		}

		@Override
		public void endSection(UnknownSection section) {

		}

		@Override
		public void readLine(String line, UnknownSection currentSection) {

		}

	}

	@Override
	public void setComments(List<String> comments) {
		
	}

}
