package com.devlabs.testNG.utilities;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] getTestData(String excelFileName) throws IOException {
		// Open the excel file
		XSSFWorkbook book = new XSSFWorkbook("./testdata/" + excelFileName + ".xlsx");
		// Open a particular sheet
		// Type - I => XSSFSheet sheet = book.getSheet("Sheet1");
		// Type - II
		XSSFSheet sheet = book.getSheetAt(0);
		// How many no of rows of data
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count: " + rowCount);

		// How many no of cols of data
		short colCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Col Count: " + colCount);

		// Create a 2D array to store the data
		String[][] testData = new String[rowCount][colCount];

		// Iterating over the rows
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow eachRow = sheet.getRow(i);
			for (int j = 0; j < colCount; j++) {
				XSSFCell eachCell = eachRow.getCell(j);
				String data = eachCell.getStringCellValue();
				testData[i - 1][j] = data;
				System.out.println(data);
			}
		}

		// To close the excel file
		book.close();
		return testData;

	}
}
