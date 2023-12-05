package databaseTest;

import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;

public class DatabaseTest
{
  // Parallel arrays/data fields to help generate expected results within JUnit tests
  private String[] users = {"team4"};
  private String[] passwords = {"password"};
  private Database db;
  private Connection conn;
  private int rando;
  
  @Before
  public void setUp() throws Exception 
  {
    db = new Database(); 
    rando = ((int)Math.random() * users.length); 
  }

  @Test
  public void testQuery()
  {
    // Use Random # to extract username and expected password
    String username = users[rando]; 
    String expected = passwords[rando];
    
    // Build a query that will select one password based on a randomly selected username
    String query = "SELECT aes_decrypt(password, 'key') FROM users WHERE username='" + username + "'";
    
    // Verify that the password is correct
    ArrayList<String> result = db.query(query);
    
    // Check that result is not null and contains the correct password
    assertNotNull("Result should not be null.\n", result);
    assertFalse("Result should not be empty.\n", result.isEmpty());
    String actual = result.get(0);
    
    // Set errorMsg and compare
    String errorMsg = "Actual value not equivalent to expected value";
    assertEquals("Actual value not equivalent to expected value", expected, actual);
  }

  @Test
  public void testExecuteDML() throws SQLException
  {
    // Build DML statement that will insert a new username with any desired password
    String newUsername = "Test4";
    String newPassword = "1234567";
 
    String dml = "INSERT into users values('" + newUsername + "',aes_encrypt('" +newPassword+"','key'),0)";
    
    try
    {
      // Execute DML
      db.executeDML(dml);
      
    } catch (SQLException e)
    {
      // Fail the test if exception occurs
      fail("Exception occured: " + e.getMessage());
    }
  }
}
