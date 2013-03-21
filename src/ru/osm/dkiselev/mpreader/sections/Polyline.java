package ru.osm.dkiselev.mpreader.sections;

import java.util.List;

public class Polyline extends SectionBase {

	private String type;
	
	private String subType;
	
	private boolean marine = false;
	
	private String label;
	
	private int endLevel;
	
	private List<Point> data0;
	private List<Point> data1;
	
	private String streetsDesc;
	private boolean dirIndicator;
	
	private String cityName;
	private String regionName;
	private String countryName;

	private String routeParam;
	
	public static class PolylineSectionParser extends SectionReaderBase<Polyline>
	{
		private static final PolylineSectionParser instance = new PolylineSectionParser();
		
		public static PolylineSectionParser getInstance() {
			return instance;
		}

		private PolylineSectionParser(){};

		@Override
		public Polyline newSection() {
			return new Polyline();
		}

		@Override
		public void readLine(String line, Polyline currentSection) {
			
			Pair<String, String> pair = readPair(line);
			
			if(pair.getKey().equals("Data0")) {
				currentSection.setData0(parsePointsLine(pair.getValue()));
			}

			if(pair.getKey().equals("Data1")) {
				currentSection.setData1(parsePointsLine(pair.getValue()));
			}

			if(pair.getKey().equals("Label")) {
				currentSection.setLabel(pair.getValue());
			}
		}

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public boolean isMarine() {
		return marine;
	}

	public void setMarine(boolean marine) {
		this.marine = marine;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getEndLevel() {
		return endLevel;
	}

	public void setEndLevel(int endLevel) {
		this.endLevel = endLevel;
	}

	public List<Point> getData0() {
		return data0;
	}

	public void setData0(List<Point> data0) {
		this.data0 = data0;
	}

	public List<Point> getData1() {
		return data1;
	}

	public void setData1(List<Point> data1) {
		this.data1 = data1;
	}

	public String getStreetsDesc() {
		return streetsDesc;
	}

	public void setStreetsDesc(String streetsDesc) {
		this.streetsDesc = streetsDesc;
	}

	public boolean isDirIndicator() {
		return dirIndicator;
	}

	public void setDirIndicator(boolean dirIndicator) {
		this.dirIndicator = dirIndicator;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRouteParam() {
		return routeParam;
	}

	public void setRouteParam(String routeParam) {
		this.routeParam = routeParam;
	}
	
}
