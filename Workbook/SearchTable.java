package Workbook;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import org.omg.Messaging.SyncScopeHelper;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;

import Workbook.PopTable;



public class SearchTable extends InsertRow {
	
	
	
	public Object Searching() throws Exception {
		
		
		super.readDataBase();
		
	
		
		preparedStatement = connect
                .prepareStatement("SELECT * from feedback.comments where date = ? and whatexcitedme = ? and jobskillsgathered = ?"
                		+ "and conceptslearned = ? and questionsiasked = ? and howiwaschallenged = ? and researchihavetodo = ?"
                		+ " and whatiwouldliketosee = ? and employerdiscussions = ? and helpioffered = ?; "); 
	
		
		preparedStatement.setString(1, "9-06-2017"); 
		preparedStatement.setString(2, "Learning that pointers are not as complicated in Java as they are for C++");
		preparedStatement.setString(3, "None");
		preparedStatement.setString(4, "The TA showed me three lines of code utilizing the FileReader and Buffered Reader methods");
		preparedStatement.setString(5, "Sejal showed me what is a README file, and how to make one");
		preparedStatement.setString(6, "How to make the last attribute sorted was the most challenging for me");
		preparedStatement.setString(7, "The example shown on the JavaIntro shows incorporating the Linked List with the args.length");
		preparedStatement.setString(8, "I really want to see how the sorting function works for multiple strings");
		preparedStatement.setString(9, "None");
		
		preparedStatement.setString(10, "I showed Sejal how to use Kutools from Excel to make all possible combinations of bike attributes.");
		preparedStatement.executeQuery(); 
		
		
		
		resultSet = preparedStatement.executeQuery();
        
	
        
        PopTable wrs = new PopTable();
        Object searched = wrs.writeResultSet(resultSet);
        
        return searched; 
		
	}
	

	
}
	


