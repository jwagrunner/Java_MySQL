package Workbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DeleteRow extends SearchTable{
	
	
	public void Delete () throws Exception {
		
				
				super.readDataBase();
	
			
				preparedStatement = connect
	            .prepareStatement("delete from feedback.comments where date = ? and whatexcitedme = ? and jobskillsgathered = ?"
	            		+ "and conceptslearned = ? and questionsiasked = ? and howiwaschallenged = ? and researchihavetodo = ?"
	            		+ " and whatiwouldliketosee = ? and employerdiscussions = ? and helpioffered = ?; ");
				
				preparedStatement.setString(1, "8-23-2017");
				preparedStatement.setString(2, "This course will allow us to become marketable for programming jobs");
				preparedStatement.setString(3, "none");
				preparedStatement.setString(4, "We saw what a rough IoT looks like drawn with a mobile phone connected to a server");
				preparedStatement.setString(5, "If we can use a virtual box that has Ubuntu for Linux'");
				preparedStatement.setString(6, "none");
				preparedStatement.setString(7, "none");
				preparedStatement.setString(8, "I would like to see challenging Java assignments that allows us to think");
				preparedStatement.setString(9, "none");
				preparedStatement.setString(10, "none");
				preparedStatement.executeUpdate();
				
		
            
	}
	
	
	public void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }

            if (statement != null) {
                statement.close();
            }

            if (connect != null) {
                connect.close();
            }
        } catch (Exception e) {

        }

}
	private void writeMetaData(ResultSet resultSet) throws SQLException {
        //  Now get some metadata from the database
        // Result set get the result of the SQL query

        System.out.println("The columns in the table are: ");

        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
        }
    }
	
	
	
	public void endQuery() throws Exception {
		
		try {
		
		Delete();
		resultSet = statement
	            .executeQuery("select * from feedback.comments");
	            writeMetaData(resultSet);
		} catch (Exception error) {
    		throw error; 
    	} finally {
    		
    		close();
    	} 
		
	            
	}
	
	
	

}
