package utilities;

import java.util.List;
import java.util.Map;

public class Excel {

	public static void main(String[] args) {
		ExcelUtil excelObject = new ExcelUtil("C:/Users/erkan/OneDrive/Masaüstü/MOCK_DATA.xlsx","data");
        
		System.out.println("column Count "+excelObject.columnCount());
		System.out.println("Row Count "+excelObject.rowCount());
		
		List<String> columndNamen=excelObject.getColumnsNames();
		System.out.println(columndNamen);
		 
		String[][] dataArray= excelObject.getDataArray();
		for (String[] row :dataArray) {
			
			for (String  value : row) {
				System.out.print(value+"\t"+"\t");
			}
			System.out.println();
		}
		
		
List<Map<String,String>> dataList = excelObject.getDataList();
		
		System.out.println(dataList);
		
		for (Map<String, String> row : dataList) {
			System.out.println(row);
		}
		
		// name of the product in the 3rd row
		System.out.println("Name of the PRODUCT in the 3rd row");
		
		System.out.println(dataList.get(3).get("Product"));
		
		// get data by index
		System.out.println(excelObject.getCellData(0, 0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
