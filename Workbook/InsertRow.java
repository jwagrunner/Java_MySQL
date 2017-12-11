package Workbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class InsertRow extends PopTable {
	
	
	@SuppressWarnings("deprecation")
	public void Insert() throws Exception {
		
		
	super.readDataBase();
    

	
	preparedStatement = connect
	
            .prepareStatement("insert into  feedback.comments values (?, ?, ?, ? , ?, ?, ?, ?, ?, ?)");
	
	
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
	
	preparedStatement.setString(1, "8-30-2017");
	preparedStatement.setString(2, "Finding out that we can learn Java easily by watching the four hour video");
	preparedStatement.setString(3, "none");
	preparedStatement.setString(4, "How the built linked list works with how a node is linked to another in a built list");
	preparedStatement.setString(5, "none");
	preparedStatement.setString(6, "none");
	preparedStatement.setString(7, "none");
	preparedStatement.setString(8, "none");
	preparedStatement.setString(9, "none");
	preparedStatement.setString(10, "none");
	preparedStatement.executeUpdate();
	
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
	preparedStatement.executeUpdate(); 
	
	preparedStatement.setString(1, "9-13-2017"); 
	preparedStatement.setString(2, "The different desserts theme and their costs/taxes for Assignment 2 was interesting to work with.");
	preparedStatement.setString(3, "None");
	preparedStatement.setString(4, "A four threaded system consists of a fetch, decoders, portions to execute, and WB (writes)");
	preparedStatement.setString(5, "I emailed Dr. Mukherjee on if the Checkout GUI is needed ");
	preparedStatement.setString(6, "Writing the Checkout class, where you need to list each item that was inputted using TestCheckout");
	preparedStatement.setString(7, "None");
	preparedStatement.setString(8, "How would using ArrayList compare to using Vectors for Assignment 2, in terms of the complexity?");
	preparedStatement.setString(9, "None");
	preparedStatement.setString(10, "I showed Nayan the algorithm of how to get the costs for each node of the vector.");
	preparedStatement.executeUpdate(); 
	
	preparedStatement.setString(1, "9-20-2017"); 
	preparedStatement.setString(2, "You can inject data into a database with just using Java code that communicates with mysql");
	preparedStatement.setString(3, "None");
	preparedStatement.setString(4, "Multi-threading - where a thread can start counting down, stops, and another starts counting down");
	preparedStatement.setString(5, "I asked Mr. Seal on how to specifically incorporate a Linked List into my code.");
	preparedStatement.setString(6, "Problems: Communication errors in Java for connecting to mysql, and learning how myphpadmin works");
	preparedStatement.setString(7, "None");
	preparedStatement.setString(8, "None");
	preparedStatement.setString(9, "None");
	preparedStatement.setString(10, "None");
	preparedStatement.executeUpdate(); 
	
	preparedStatement.setString(1, "10-1-2017"); 
	preparedStatement.setString(2, "Seeing how the packaging system works for FedEx, where every node is connected to two nodes");
	preparedStatement.setString(3, "None");
	preparedStatement.setString(4, "Learning how threads are to access mysql, but not simultaneously");
	preparedStatement.setString(5, "I asked Dr. Mukherjee if the top-level class was the main function");
	preparedStatement.setString(6, "None");
	preparedStatement.setString(7, "How to have certain methods of different classes correspond with each other.");
	preparedStatement.setString(8, "How what I learned for mysql and programming in Java comes together with Android Studio");
	preparedStatement.setString(9, "None");
	preparedStatement.setString(10, "None");
	preparedStatement.executeUpdate(); 
	
    }
    
    
	}
	
	

