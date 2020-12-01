package net.skizmflop.commons.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * Parses CSV files into a HashMap
 * @author jack
 */
public class CSVParser {
	
	/**
	 * @param csvFile
	 * @param headerLine
	 * @return Map representing CSV file.
	 */
	public static List<String[]> parseFile(File csvFile, int headerLine) {
		
		try(Scanner scanner = new Scanner(csvFile)) {
			String[] keys = {};
			for(int i=0; i<headerLine; i++) {
				if(scanner.hasNextLine()) {
					if(i == (headerLine - 1)) {
						keys = parseLine(scanner.nextLine());
					}else {
						scanner.nextLine();
					}
				}
			}
			System.out.println("Headers: " + StringUtils.join(keys, ", "));
			
			String[] values = {};
			List<String[]> csv = new ArrayList<>();
			csv.add(keys);
			for(int i=headerLine;scanner.hasNextLine();i++) {
				values = parseLine(scanner.nextLine());
				if(values.length != keys.length) {
					System.out.printf("RECORD # %,d NOT READ%n", (i - headerLine));
					for(int j=0; j<keys.length; j++) {
						System.out.printf("%s -> %s%n", keys[j], values[j]);
					}
					continue;
				}
				csv.add(values);
			}
			System.out.printf("%,d RECORDS READ INTO MEMORY", csv.size());
			return csv;
			
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			return new ArrayList<>();
		}
		
	}
	
	private static String[] parseLine(String line) {
		List<String> values = new ArrayList<>();
		for(String value: line.split("\"")) {
			if(StringUtils.equals(value, ",")) continue;
			if(StringUtils.isEmpty(value.strip())) continue;
			values.add(value.trim());
		}
		return values.toArray(new String[values.size()]);
		
	}
	
	
	/**
	 * no-args constructor is illegal
	 */
	public CSVParser() {
		throw new IllegalStateException("CSVParser cannot be instatiated");
	}
	

}
