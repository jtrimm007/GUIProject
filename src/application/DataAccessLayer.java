/**
 * -------------------------------------------------
 * File name: DataAccessLayer.java
 * Project name: GUIProject
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Apr 13, 2018
 * -------------------------------------------------
 */
package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * <b>Model</b>
 * <hr>
 * Date created: Apr 13, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class DataAccessLayer {

	private String connectionString = "jdbc:mysql://mysql1208.ixwebhosting.com:3306/plowbow_bowlingleague?user=plowboy_NE1&password=NE_Plow_!1";
	Connection connection = null;
	java.sql.Statement statement = null;

	/**
	 * 
	 * Description:DataAccessLayer
	 * @throws Exception
	 * Date: Apr 13, 2018
	 */
	public DataAccessLayer() throws Exception
	{
		try
		{
			connection = DriverManager.getConnection(connectionString);
			statement = connection.createStatement();
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	/**
	 * 
	 * Method description: 
	 * Date: Apr 13, 2018
	 * @return
	 * @throws SQLException
	 * @return ObservableList<BowlerStuff>
	 */
	public ObservableList<BowlerStuff>getAllBowlers() throws SQLException
	{
		ObservableList<BowlerStuff> bowlers = FXCollections.observableArrayList();

		ResultSet rs = null;
		String query = "SELECT * FROM Bowlers";

		try {
			rs = statement.executeQuery(query);

			while(rs.next())
			{
				BowlerStuff bowler = new BowlerStuff(rs.getInt("BowlerID"), 
						rs.getString("BowlerLastName"), 
						rs.getString("BowlerFirstName"), rs.getString("BowlerMiddleInit"), 
						rs.getString("BowlerAddress"),  rs.getString("BowlerCity"), 
						rs.getString("BowlerState"), rs.getString("BowlerZip"), 
						rs.getString("BowlerPhoneNumber"), rs.getInt("TeamID"));

				bowlers.add(bowler);
			}

		}
		catch(SQLException e)
		{
			throw e;
		}
		return bowlers;
	}


	
	/**
	 * 
	 * Method description: updateBowlerFirstName
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerFirstName(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerFirstName = bowler.getBowlerFirstName();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerFirstName + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}
	/**
	 * 
	 * Method description: updateBowlerLastName
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerLastName(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerLastName = bowler.getBowlerLastName();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerLastName + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}

	/**
	 * 
	 * Method description: updateBowlerMiddleInit
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerMiddleInit(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerMiddleInit = bowler.getBowlerMiddleInit();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerMiddleInit + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}

	/**
	 * 
	 * Method description: updateBowlerAddress
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerAddress(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerAddress = bowler.getBowlerAddress();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerAddress + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}

	/**
	 * 
	 * Method description: updateBowlerCity
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerCity(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerCity = bowler.getBowlerCity();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerCity + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}

	/**
	 * 
	 * Method description: updateBowlerState
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerState(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerState = bowler.getBowlerState();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerState + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}
	/**
	 * 
	 * Method description: updateBowlerZip
	 * Date: Apr 13, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerZip(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerZip = bowler.getBowlerZip();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerZip + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}
	/**
	 * 
	 * Method description: updateBowlerPhoneNumber
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerPhoneNumber(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		String bowlerPhoneNumber = bowler.getBowlerPhoneNumber();

		String query = "UPDATE Bowlers SET BowlerZip = '" + bowlerPhoneNumber + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}
	/**
	 * 
	 * Method description: updateBowlerTeamID
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return
	 * @throws SQLException
	 * @return boolean
	 */
	public boolean updateBowlerTeamID(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		int bowlerID = bowler.getBowlerID();
		int teamID = bowler.getTeamID();

		String query = "UPDATE Bowlers SET BowlerZip = '" + teamID + "' WHERE BowlerID = " + bowlerID;
		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}

	// End of updates

	public boolean insertANewBowler(BowlerStuff bowler) throws SQLException
	{
		boolean success = true;
		String query = "INSERT INTO Bowlers (BowlerLastName, BowlerFirstName, BowlerMiddleInit, BowlerAddress, BowlerCity, BowlerState, BowlerZip, BowlerID, BowlerPhoneNumber)" + 
				"VALUES ('" + bowler.getBowlerLastName() + " ' , ' " + bowler.getBowlerFirstName() + " ' , ' "  + bowler.getBowlerMiddleInit()  +  " ' , ' "  + bowler.getBowlerAddress()  +
				" ' , ' "  + bowler.getBowlerCity()  +  " ' , ' "  + bowler.getBowlerState()  +  " ' , ' "  + bowler.getBowlerZip()  +  " ' , ' "  + bowler.getBowlerID()  + " ' , ' "  + bowler.getBowlerPhoneNumber()  +")";


		int rowCount = statement.executeUpdate(query);
		if(rowCount == 0)
		{
			success = false;

		}
		return success;
	}


	/**
	 * 
	 */
	public void finalize()
	{
		try
		{
			connection.close();

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

}
