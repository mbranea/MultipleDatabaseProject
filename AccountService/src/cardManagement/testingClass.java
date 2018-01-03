package cardManagement;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import accountCreation.WrongDataEnteredException;
import login.AccountLogin;

public class testingClass {

	public static void main(String args[]) throws NoSuchAlgorithmException, UnsupportedEncodingException 
	{
		AccountLogin accountLogin = new AccountLogin();
		try {
			System.out.println(accountLogin.verifyLogin("steve1","stevepass"));
		} catch (WrongDataEnteredException e) {
			System.out.println("Empty Login attempted");
		}
	
		(new CardAdder()).addCard("123", "123");
	}
	
	
}
