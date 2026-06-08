package week3.day1;

public interface RBI {
	public int minimumBalance=5000;
	
	/**
	 * Using this method the customer can submit their KYC by providing
	 * UID, Aadhar Card, PAN, DL or any GOI authorized resident proof. 
	 * @return boolean - true If KYC is submitted
	 * @return boolean - false If KYC is not submitted
	 */
	public boolean submitKYC();
	public void buyCreditCard1();
	

}
