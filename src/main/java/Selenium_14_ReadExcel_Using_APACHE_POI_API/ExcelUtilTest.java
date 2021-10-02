package Selenium_14_ReadExcel_Using_APACHE_POI_API;

public class ExcelUtilTest {

	public static void main(String[] args) {
		
//		.jar file developed by naveen is available in below path -
//		https://github.com/naveenanimation20/NewExcelUtil2020_ApachePOI/blob/master/ExcelUtil-jar-with-dependencies.jar
		
//		Utility developed by Naveen is available in GitHub - 
//		https://github.com/naveenanimation20/NewExcelUtil2020_ApachePOI/blob/master/src/main/java/com/excel/lib/util/Xls_Reader.java
		
//		Dependencies available in below path - 
//		https://github.com/naveenanimation20/NewExcelUtil2020_ApachePOI/blob/master/pom.xml

		Xls_Reader_Utility reader = new Xls_Reader_Utility ("C:\\Users\\Mitansh\\Desktop\\SampleExcel.xlsx");
//		Xls_Reader_Utility reader = new Xls_Reader_Utility ("C:\\Users\\Mitansh\\eclipse-workspace\\SeptMorningSeleniumBatch\\src\\main\\java\\Selenium_14_ReadExcel_Using_APACHE_POI_API\\SampleExcel.xlsx");
		
//		1. getCellData
		String sheetName = "login";
		String data = reader.getCellData(sheetName, 0, 2);
		System.out.println(data);
		
//		2. getRowCount
		int rowCount = reader.getRowCount(sheetName);
		System.out.println("Total Rows: " + rowCount);
		
//		3. addColumn
//		reader.addColumn(sheetName, "Status");
		
//		4. addSheet
//		reader.addSheet("Registration");
		
//		5. isSheetExist
		if (! reader.isSheetExist("Registration")) {
			reader.addSheet("Registration");
		}
		
//		6. setCellData
		reader.setCellData(sheetName, "Status", 2, "Pass");
		
//		7. getCellData
		System.out.println(reader.getCellData(sheetName, "Username", 3));
		
//		8. getColumnCount
		System.out.println(reader.getColumnCount(sheetName));
		
//		9. removeColumn
//		reader.removeColumn("Registration", 0);
		
		
		System.out.println(reader.getCellData("Registration", "Phone", 2));
		System.out.println(reader.getCellData("Registration", "Age", 2));
		
		
		System.out.println(reader.getCellData("Registration", "Phone", 3));
		
	}

}
