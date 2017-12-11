package Workbook;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import Workbook.PopTable;

public class TestMyFeedback extends DeleteRow {
	
	    public static void main(String[] args) throws Exception {
	    	
	        
	        InsertRow ir = new InsertRow();
	        ir.Insert(); 
	        
	        DeleteRow dr = new DeleteRow();
	        dr.Delete(); 
	    	
	        SearchTable sea = new SearchTable();
	        sea.Searching(); 

	}
	   
		
	 
	    
}
	
	
	
	