package ru.osm.dkiselev.mpreader.sections;

import java.util.HashMap;
import java.util.Map;


public class SectionsReaderFactory {

	private static final SectionsReaderFactory instance = new SectionsReaderFactory();
	
	private Map<String, SectionReader> readers = new HashMap<String, SectionReader>();
	
	private SectionsReaderFactory() {
		
		//Header
		readers.put(Header.NAME, Header.HeaderReader.getInstance());
		
		//Declarations
		readers.put("COUNTRIES", null);
		readers.put("REGIONS", null);
		readers.put("CITIES", null);
		readers.put("CHART INFO", null);
		
		//Advanced Declarations 
		readers.put("DICTIONARY", null);
		readers.put("BACKGROUND", null);
		readers.put("HIGHWAYS", null);
		readers.put("ZIPCODES", null);
		readers.put("DEFINITIONS", null);
		
		//Objects
		readers.put("POI", null);
		readers.put("POLYLINE", Polyline.PolylineSectionParser.getInstance());
		readers.put("POLYGON", null);
		readers.put("PLT", null);
		readers.put("WPT", null);
		readers.put("DBX", null);
		readers.put("SHP", null);
		readers.put("FILE", null);
		readers.put("RGN10", null);
		readers.put("RGN20", null);
		readers.put("RGN40", null);
		readers.put("RGN80", null);
		
	};
	
	public SectionReader getReaderForSection(String sectionName) {
		SectionReader reader = readers.get(sectionName);
		
		if(reader != null) {
			return reader; 
		}
		
		return UnknownSection.UnknownSectionReader.instance();
		
	}

	public static SectionsReaderFactory get() {
		return instance;
	}

	
}
