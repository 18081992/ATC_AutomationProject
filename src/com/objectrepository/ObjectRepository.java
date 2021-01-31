package com.objectrepository;

public class ObjectRepository {
	
	//login
	public static String signInLink="Sign In";
	public static String email="//input[@name='email']";
	public static String password="//input[@name='passwd']";
	public static String SignInButton="//*[contains(text(),'Sign in')]";
	public static String myAccount="//*[contains(text(),'MY ACCOUNT')]";
	public static String myAddresses="//a[@title='Addresses']/span";
	public static String addNewAddress="//a[@title='Add an address']/span";
	
	//New Address
	public static String firstName="//input[@name='firstname']";
	public static String lastName="//input[@name='lastname']";
	public static String company="//input[@name='company']";
	public static String address1="//input[@name='address1']";
	public static String address2="//input[@name='address2']";
	public static String city="//input[@name='city']";
	public static String state="//input[@name='id_state']";
	public static String zipCode="//input[@name='postcode']";
	public static String country="//input[@name='id_country']";
	public static String homePhone="//input[@name='phone']";
	public static String mobileNumber="//input[@name='phone_mobile']";
	public static String submitAddress="//button[@name='submitAddress']/span";
	public static String alias="//input[@name='alias']";
	public static String validationMessage="//*[contains(text(),'Your addresses are listed below.')]";
	
	//SelectItems
	public static String linkWomen="//a[@title='Women']";
	public static String summerDresses="//*[contains(text()='Summer Dresses')]";
	public static String list="//a[@title='List']/i";
	public static String item1="(//img[@class='replace-2x img-responsive'])[2]";
	public static String item2="(//img[@class='replace-2x img-responsive'])[3]";
	public static String item3="(//img[@class='replace-2x img-responsive'])[4]";
	public static String quantity="//input[@name='qty']";
	public static String size="//input[@name='group_1']";
	public static String colour="//a[@title='Orange']";
	public static String addToCart="//p[@id='add_to_cart']/button[@type='submit']/span";
	public static String continueShopping="//span[@title='Continue shopping']/span/i";
	public static String proceedToCheckout="//a[@title='Proceed to checkout']/span";
	public static String checkBox_termsAndConditions="//input[@type='checkbox']";
	public static String paymentByBank="//a[@title='Pay by bank wire']";
	public static String confirmOrder="//a[@type='submit']/span";
	public static String orderConfirmationMessage="//p[@class='cheque-indent']/strong";
	public static String userProfile="//a[@title='View my customer account']/span";
	public static String orderHistoryAndDetails="//a[@title='Orders']/span";
	public static String signOut="//a[@title='Log me out']";
	public static String createAnAccountText="//*[contains(text(),'CREATE AN ACCOUNT')]";
}
