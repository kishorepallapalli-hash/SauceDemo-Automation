package tests;

import base.BaseClass;
import pages.Cartpage;
import pages.Checkoutpage;
import pages.Loginpage;
import pages.Paymentpage;
import pages.Productpage;

import org.testng.annotations.Test;
public class saucelabsTest extends BaseClass {
	
	
	
	
	@Test
	public void End2endtest()throws InterruptedException{
		Loginpage lp=new Loginpage();
		lp.loginsetup("standard_user","secret_sauce");
		
		
	
	
		Productpage pp = new Productpage();
		pp.SelectProducts();
		
	
		Cartpage cp=new Cartpage();
		
		cp.checkoutProduct();
	
		Checkoutpage cop =new Checkoutpage();
		
		cop.Details("kishore", "kumar", "600096");
	
		Paymentpage pay = new Paymentpage();
		pay.orderconfirm();
	}

}
