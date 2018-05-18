package application;
/**
 * -------------------------------------------------
 * File name: BowlerStuff.java
 * Project name: Bowler
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Apr 11, 2018
 * -------------------------------------------------
 */

/**
 * <b>Object creation</b>
 * <hr>
 * Date created: Apr 11, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class BowlerStuff {

    private int bowlerID;
    private String bowlerLastName;
    private String bowlerFirstName;
    private String bowlerMiddleInit;
    private String bowlerAddress;
    private String bowlerState;
    private String bowlerCity;
    private String bowlerZip;
    private String bowlerPhoneNumber;
    private int teamID;
    
    
    
    
	/**
	 * Description:
	 * Date: Apr 11, 2018
	 */
	public BowlerStuff() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	/**
	 * Description:
	 * @param bowlerID
	 * @param bowlerLastName
	 * @param bowlerFirstName
	 * @param bowlerMiddleInit
	 * @param bowlerAddress
	 * @param bowlerCity
	 * @param bowlerState
	 * @param bowlerZip
	 * @param bowlerPhoneNumber
	 * @param teamID
	 * Date: Apr 11, 2018
	 */
	public BowlerStuff(int bowlerID, String bowlerLastName, 
			String bowlerFirstName, String bowlerMiddleInit,
			String bowlerAddress, String bowlerCity,  String bowlerState,String bowlerZip, 
			String bowlerPhoneNumber, int teamID) 
	{
		super();
		this.bowlerID = bowlerID;
		this.bowlerLastName = bowlerLastName;
		this.bowlerFirstName = bowlerFirstName;
		this.bowlerMiddleInit = bowlerMiddleInit;
		this.bowlerAddress = bowlerAddress;
		this.bowlerCity = bowlerCity;
		this.bowlerState = bowlerState;
		this.bowlerZip = bowlerZip;
		this.bowlerPhoneNumber = bowlerPhoneNumber;
		this.teamID = teamID;
	}



	public String getBowlerCity() {
		return bowlerCity;
	}



	public void setBowlerCity(String bowlerCity) {
		this.bowlerCity = bowlerCity;
	}



	public void setBowlerPhoneNumber(String bowlerPhoneNumber) {
		this.bowlerPhoneNumber = bowlerPhoneNumber;
	}



	public int getBowlerID() {
		return bowlerID;
	}
	public void setBowlerID(int bowlerID) {
		this.bowlerID = bowlerID;
	}
	public String getBowlerLastName() {
		return bowlerLastName;
	}
	public void setBowlerLastName(String bowlerLastName) {
		this.bowlerLastName = bowlerLastName;
	}
	public String getBowlerFirstName() {
		return bowlerFirstName;
	}
	public void setBowlerFirstName(String bowlerFirstName) {
		this.bowlerFirstName = bowlerFirstName;
	}
	public String getBowlerMiddleInit() {
		return bowlerMiddleInit;
	}
	public void setBowlerMiddleInit(String bowlerMiddleInit) {
		this.bowlerMiddleInit = bowlerMiddleInit;
	}
	public String getBowlerAddress() {
		return bowlerAddress;
	}
	public void setBowlerAddress(String bowlerAddress) {
		this.bowlerAddress = bowlerAddress;
	}
	public String getBowlerState() {
		return bowlerState;
	}
	public void setBowlerState(String bowlerState) {
		this.bowlerState = bowlerState;
	}
	public String getBowlerZip() {
		return bowlerZip;
	}
	public void setBowlerZip(String bowlerZip) {
		this.bowlerZip = bowlerZip;
	}
	public String getBowlerPhoneNumber() {
		return bowlerPhoneNumber;
	}
	
	public int getTeamID() {
		return teamID;
	}
	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}



	@Override
	public String toString() {
		return "BowlerStuff [bowlerID=" + bowlerID + ", bowlerLastName=" + bowlerLastName + ", bowlerFirstName="
				+ bowlerFirstName + ", bowlerMiddleInit=" + bowlerMiddleInit + ", bowlerAddress=" + bowlerAddress
				+ ", bowlerState=" + bowlerState + ", bowlerCity=" + bowlerCity + ", bowlerZip=" + bowlerZip
				+ ", bowlerPhoneNumber=" + bowlerPhoneNumber + ", teamID=" + teamID + "]";
	}



	
	
    
}
