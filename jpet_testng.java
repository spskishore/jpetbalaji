package POM_JPET_TESTNG;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.utilities;
import POM_JPET.jpet_reg;
import POM_JPET.login;
import excel.jpet_excel;

public class jpet_testng extends jpet_excel{
	String url="http://jpetstore.cfapps.io/accounts/create?form";	
	WebDriver dr;
	Library.utilities a1;
//	jpet_reg a2;
	login a3;
	
	
  @BeforeClass
  public void chrome() throws FileNotFoundException {
	  a1=new utilities(dr);

	  get_testdata();
	  dr=a1.launch_browser("CHROME", url);
	
  }
  @Test(dataProvider="reg_data")
  public void reg(String uid, String pwd, String d) {
//	  a1=new utilities(dr);
//	  a2=new jpet_reg(dr);
//	  a2.do_reg("balaji1", "Balaji1234", "Balaji1234", "balaji11", "dfjsd", "bal@gmail.com", "6462541512", "jdhf", "hdjf", "jhdjf", "djhf", "563456", "djhfk", "dfjid", "hfd");
	  a3=new login(dr);
	  a3.do_login(uid,pwd);
	  String act_name=a3.getn();
//	  a1.getSS();
	  Assert.assertTrue(act_name.contains("balaj"));
	  
	  
	  
  }
  
  @DataProvider(name="reg_data")
  public String[][] provide_data()
  {
	 
	  return testdata1;
  }
  
  
  
}
