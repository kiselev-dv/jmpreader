package ru.osm.dkiselev.mpreader.sections;



public class Header extends SectionBase {

	public static String NAME = "IMG ID";

	private int id;
	private String name;
	private int lblCoding = 6;
	private int codepage = 0;
	private String datum = "W84";
	private char transparent='N';
	
	private boolean mg = false;
	private boolean numbering = false;
	private boolean routing = false;
	private boolean lock = false;
	
	private int productCode = 1;
	private String copyRight = "";
	
	private char elevation = 'f';
	
	private boolean poiIndex = false;
	private boolean poiNumberFirst = true;
	private boolean poiZIPFirst = true;
	
	private String countryName = "";
	private String regionName = "";
	
	private int treeSize;
	private int rgnLimit;
	private int simplifyLevel;
	
	private char preProces='N';
	
	private int levels;
	private int[] levelN;
	private int[] zoomN;
	
	private boolean preview = false;
	
	private int drawPriority =  25;
	
	private char marine='N';
	
	private boolean leftSideTraffic = false;
	private boolean nt = false;
	
	public static class HeaderReader extends SectionReaderBase {

		private static final HeaderReader instance = new HeaderReader();
		
		private HeaderReader(){};
		
		@Override
		public Section newSection() {
			return new Header();
		}

		@Override
		public void readLine(String line, Section currentSection) {
			Pair<String, String> kv = readPair(line);
			
		}

		public static SectionReader getInstance() {
			return instance;
		}
		
	}
}
