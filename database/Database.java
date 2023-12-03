package database;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.*;

public class Database
{
  private Connection conn;
  
  //Add any other data fields you like – at least a Connection object is mandatory
  public Database() 
  {
    //1. Create a Properties Object
	Properties properties = new Properties();
	
	//2. create FileInput Stream object based on db properties

	FileInputStream fis = null;
	try {
		fis = new FileInputStream("lab7out/db.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//3. Use the FileInput Stream Object into load of Properties object
	try {
		properties.load(fis);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//4. Use the getProperties method to retrieve user password and url
	String user = properties.getProperty("user");
	String pass = properties.getProperty("password");
	String url = properties.getProperty("url");
	
	try {
		conn = DriverManager.getConnection(url, user, pass);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
  
  public ArrayList<String> query(String query)
  {
	  try
	  {
	  //Variable Declaration/Initialization
	  ArrayList<String> list = new ArrayList<String>();
	  
	  //1. Create a Statement from the Connection Object
	  Statement stmt = conn.createStatement();
	  
	  //2. Execute query on the stmt
	  ResultSet rs = stmt.executeQuery(query);
	  
	  //3. Get the # of columns from the ResultSet
	  ResultSetMetaData rmd = rs.getMetaData();
	  int noOfColumns = rmd.getColumnCount();
	  
	  while(rs.next())
	  {
		  String record = "";
		  
		  for (int i = 0; i <noOfColumns; i++)
		  {
			  String field = rs.getString(i +1);
			  record += field;
			  if (i <(noOfColumns-1))
				 record += ",";
		  }
		  list.add(record);
	  }
	  
	  // Check for empty dataset
	  if(!list.isEmpty())
		  return list;
	  else
		  return null;
	  
	  }
	  catch (SQLException exception)
	  {
		  exception.printStackTrace();
		  return null;
	  }
  }
  
  public void executeDML(String dml) throws SQLException
  {
    //1. Create a statement from conn
	  Statement stmt = conn.createStatement();
	  stmt.execute(dml);
  }
  
}

