package com.qa.test;

import com.qa.testutil.Xls_Reader;

public class ExcelOperations {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("D:\\FrameWorks\\DataDriven\\src\\com\\qa\\testdata\\OracleTestData.xlsx");
        /*boolean flag = reader.addSheet("OracleSignUp"); // Adding sheet in excel 
        System.out.println(flag);*/
        
        // write in this form whenever you are adding sheet ! if True return sheet if False go to if and add sheet and return true.
        if(!reader.isSheetExist("OracleSignUp"))
        {
          reader.addSheet("OracleSignUp");
        }
		
		int colmn_count = reader.getColumnCount("OracleReg");
		System.out.println(colmn_count); // To chck now of colmns whcih are available in that particular sheet
		
	}

}
