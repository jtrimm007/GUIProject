/**
 * -------------------------------------------------
 * File name: FXMLBowlersTableController.java
 * Project name: GUIProject
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Apr 13, 2018
 * -------------------------------------------------
 */

package application;

import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellEditEvent;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;


/**
 * 
 * <b>Controller</b>
 * <hr>
 * Date created: Apr 14, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class FXMLBowlersTableController {

	@FXML
	TextField idFirstName;

	@FXML
	TextField idLastName;

	@FXML
	TextField idMiddleInit;

	@FXML
	TextField idAddress;

	@FXML
	TextField idCity;

	@FXML
	TextField idState;

	@FXML
	TextField idZip;

	@FXML
	TextField idPhone;

	@FXML
	private TableView<BowlerStuff> idBowlerTableView;

	@FXML
	ComboBox<String> idTeamComboBox;

	@SuppressWarnings("unchecked")

	/**
	 * 
	 * Method description: initialize arrayList
	 * Date: Apr 14, 2018
	 * @return void
	 */
	public void initialize()
	{



		TableColumn<BowlerStuff, Number> bowlerID = new TableColumn<BowlerStuff, Number>("Bowler ID");
		TableColumn<BowlerStuff, String> bowlerFirstName = new TableColumn<BowlerStuff, String>("First Name");
		TableColumn<BowlerStuff, String> bowlerLastName = new TableColumn<BowlerStuff, String>("Last Name");
		TableColumn<BowlerStuff, String> bowlerMiddleInit = new TableColumn<BowlerStuff, String>("Middle Init");
		TableColumn<BowlerStuff, String> bowlerAddress = new TableColumn<BowlerStuff, String>("Address");
		TableColumn<BowlerStuff, String> bowlerCity = new TableColumn<BowlerStuff, String>("City");
		TableColumn<BowlerStuff, String> bowlerState = new TableColumn<BowlerStuff, String>("State");
		TableColumn<BowlerStuff, String> bowlerZip = new TableColumn<BowlerStuff, String>("Zip");
		TableColumn<BowlerStuff, String> bowlerPhoneNumber = new TableColumn<BowlerStuff, String>("Phone Number");
		TableColumn<BowlerStuff, String> bowlerTeamID = new TableColumn<BowlerStuff, String>("Team ID");


		bowlerID.setCellValueFactory(new PropertyValueFactory<BowlerStuff, Number>("bowlerID"));
		bowlerFirstName.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerFirstName"));
		bowlerLastName.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerLastName"));
		bowlerMiddleInit.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerMiddleInit"));
		bowlerAddress.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerAddress"));
		bowlerCity.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerCity"));
		bowlerState.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerState"));
		bowlerZip.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerZip"));
		bowlerPhoneNumber.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("bowlerPhoneNumber"));
		bowlerTeamID.setCellValueFactory(new PropertyValueFactory<BowlerStuff, String>("teamID"));


		idBowlerTableView.getColumns().addAll(bowlerID, bowlerFirstName, bowlerLastName, bowlerMiddleInit, bowlerAddress, bowlerCity, 
				bowlerState, bowlerZip, bowlerPhoneNumber, bowlerTeamID);

		
		//Start Bowler First Name
		bowlerFirstName.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerFirstName.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerFirstName(t.getNewValue());
						updateBowlerFirstName(tempBowler);
					}
				}

				);
		
		//Start Bowler Last Name
		bowlerLastName.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerLastName.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerLastName(t.getNewValue());
						updateBowlerLastName(tempBowler);
					}
				}

				);
		
		//Start Bowler Middle Init
		bowlerMiddleInit.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerMiddleInit.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerMiddleInit(t.getNewValue());
						updateBowlerMiddleInit(tempBowler);
					}
				}

				);
		
		//Start Bowler Middle Init
		bowlerMiddleInit.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerMiddleInit.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerMiddleInit(t.getNewValue());
						updateBowlerMiddleInit(tempBowler);
					}
				}

				);
		
		//Start Bowler address
		bowlerAddress.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerAddress.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerAddress(t.getNewValue());
						updateBowlerAddress(tempBowler);
					}
				}

				);
		
		//Start Bowler State
		bowlerState.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerState.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerState(t.getNewValue());
						updateBowlerState(tempBowler);
					}
				}

				);
		
		//Start Bowler zip
		bowlerZip.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerZip.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerZip(t.getNewValue());
						updateBowlerZip(tempBowler);
					}
				}

				);
		
		//Start Bowler Phone Number
		bowlerPhoneNumber.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerPhoneNumber.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setBowlerPhoneNumber(t.getNewValue());
						updateBowlerPhoneNumber(tempBowler);
					}
				}

				);
		
		// State TeamID
		bowlerTeamID.setCellFactory(TextFieldTableCell.forTableColumn());
		bowlerTeamID.setOnEditCommit(

				new EventHandler<CellEditEvent<BowlerStuff, String>>()
				{
					@Override
					public void handle(CellEditEvent<BowlerStuff, String> t)
					{
						BowlerStuff tempBowler = ((BowlerStuff) t.getTableView().getItems().get(t.getTablePosition().getRow()));
						tempBowler.setTeamID(Integer.parseInt(t.getNewValue()));
						updateBowlerTeamID(tempBowler);
					}
				}

				);


	}
	/**
	 * 
	 * Method description: updateBowlerLastName
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerLastName(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerLastName(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * Method description: updateBowlerFirstName
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerFirstName(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerFirstName(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Method description: updateBowlerMiddleInit
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerMiddleInit(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerMiddleInit(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * Method description: updateBowlerAddress
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerAddress(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerAddress(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * Method description: updateBowlerState
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerState(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerState(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * Method description: updateBowlerPhoneNumber
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerPhoneNumber(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerPhoneNumber(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	/**
	 * 
	 * Method description: updateBowlerZip
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerZip(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerZip(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Method description: updateBowlerTeamID
	 * Date: Apr 14, 2018
	 * @param bowler
	 * @return void
	 */
	public void updateBowlerTeamID(BowlerStuff bowler)
	{
		try
		{
			DataAccessLayer dal = new DataAccessLayer();
			boolean results = dal.updateBowlerTeamID(bowler);
		}
		catch(SQLException e)
		{			
		e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * Method description: onCloseEvent
	 * Date: Apr 14, 2018
	 * @param event
	 * @return void
	 */
	@FXML
	public void onCloseEvent(ActionEvent event)
	{
		System.exit(0);
	}

}
