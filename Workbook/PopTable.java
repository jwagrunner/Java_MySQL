package Workbook;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;

import Workbook.SearchTable;

public class PopTable {
	
	protected Connection connect = null;
    protected Statement statement = null;
    protected PreparedStatement preparedStatement = null;
    protected ResultSet resultSet = null;
    
    public Object writeResultSet(ResultSet resultSet) throws SQLException {
        // ResultSet is initially before the first data set
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
        	
        	String date = resultSet.getString("Date");
            String excitedme = resultSet.getString("WhatExcitedMe");
            String jobskills = resultSet.getString("JobSkillsGathered");
            String concepts = resultSet.getString("ConceptsLearned");
            String questions = resultSet.getString("QuestionsIasked");
            String challenge = resultSet.getString("HowIWasChallenged");
            String research = resultSet.getString("ResearchIHaveToDo");
            String see = resultSet.getString("WhatIWouldLikeToSee");
            String discussions = resultSet.getString("EmployerDiscussions");
            String helpioffered = resultSet.getString("HelpIOffered");
            System.out.println("Date:" + date);
            System.out.println("What excited me: " + excitedme);
            System.out.println("Jobs skills gathered: " + jobskills);
            System.out.println("Concepts learned: " + concepts);
            System.out.println("Questions I asked: " + questions);
            System.out.println("How I was challenged: " + challenge);
            System.out.println("Research I have to do: " + research);
            System.out.println("What I would like to see: " + see);
            System.out.println("Employer discussions: " + discussions);
            System.out.println("Help I offered: " + helpioffered);
        	
        }
		return resultSet;
    }
	

    public Object readDataBase() throws Exception {
    
    	Class.forName("com.mysql.jdbc.Driver");
        // Setup the connection with the DB
    	connect = DriverManager
                .getConnection("jdbc:mysql://localhost/feedback?"
                        + "user=root&password=Xcadet17**18");

        // Statements allow to issue SQL queries to the database
        statement = connect.createStatement();
        // Result set get the result of the SQL query
        resultSet = statement
                .executeQuery("select * from feedback.comments");
       Object a = writeResultSet(resultSet);
        
        return a; 
}
}
