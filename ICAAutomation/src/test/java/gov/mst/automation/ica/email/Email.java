package gov.mst.automation.ica.email;

/*
 	* Author	 				: Nanthini PushpaRaja
 	* Created date			: Dec 08, 2018
 	* Last Edited by		: Nanthini PushpaRaja
 	* Last Edited date		: Dec 08, 2018
 	* Description			: Class is used to define the email actions
*/

import java.util.Properties;
import javax.mail.Address;
import javax.mail.BodyPart;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Store;
import org.jsoup.Jsoup;
import org.testng.annotations.Test;

import gov.mst.automation.ica.constant.Constants;
import gov.mst.automation.ica.report.Log;

public class Email {

	// Method is used to verify the received email

	@Test
	public static void EmailVerify() throws InterruptedException, Exception {

		try 
		{
			Thread.sleep(15000);
			String from = null, subject = null, content = null, from_email = null, subject_email = null, content_email = null;
			String expected = "Nanthini Pushpa Raja <nanthini.p@mstsolutions.com>|Sample Email|Hi, This is your email for automation. Nanthini Pushparaja Software Engineer - II  | MST SOLUTIONS M | 82203 - 70452";
			String[] emailVerify;
			emailVerify = expected.split("\\|");
			from = emailVerify[0];
			subject = emailVerify[1];
			content = emailVerify[2];
			
			
			// Connect to email using valid credentials
			
			Properties props = new Properties();
			props.setProperty("mail.store.protocol", "imaps");
			Session session = Session.getInstance(props, null);
			Store store = session.getStore();
			store.connect(Constants.hostname, Constants.username, Constants.password);
			Log.info("Connected to email");
			
			// Get the recently received unread mail and get the From and Subject
			
			Folder inbox = store.getFolder("INBOX");
			inbox.open(Folder.READ_WRITE);
			Log.info("Opened the inbox folder");
			
			int count = inbox.getUnreadMessageCount();
			Log.info("Got all the unread messages");
			
			if (count > 0) 
			{

				int totalCount = inbox.getMessageCount();
				Log.info("Got all the messages from inbox");
				
				for (int i = 0; i < count; i++) 
				{
					int countEmail = totalCount - i;
					Log.info("First email got selected");
					
					Message msg = inbox.getMessage(countEmail);
					msg.setFlag(Flags.Flag.SEEN, true);
					Log.info("Marked as read email");
					
					Address[] in = msg.getFrom();
					
					for (Address address : in) 
					{
						from_email = address.toString();
						subject_email = msg.getSubject();
					}
					Log.info("Got from address and subject");
					
					// Get the content of Email
					
					Object output = msg.getContent();
					if (output instanceof String) 
					{
						String body = (String) content;
						content_email = body.toString();
					} 
					else if (output instanceof Multipart) 
					{
						Multipart mp = (Multipart) output;
						BodyPart bp = mp.getBodyPart(0);
						content_email = bp.getContent().toString();
						System.out.println(content_email);
					}
					String parsed_content = Jsoup.parse(content_email).text();
					
					Log.info("Got the content of email");
					
					// Check whether From, Subject and Content of email are as per the expectation
					
					if (from.equals(from_email)) 
					{
						Log.info("From email address is as expected");
						if (subject_email.contains(subject)) 
						{
							Log.info("Subject is as expected");
							if (parsed_content.contains(content)) 
							{
								Log.info("Content is as expected");
								System.out.println("Email verified");
								i = count;
							} 
							else 
							{
								throw new Exception(
										"The given content value in excel is not matched with the fetched data ");
							}
						} 
						else 
						{
							throw new Exception(
									"The given subject value in excel  is not matched with the fetched data ");
						}
					} 
					else 
					{
						throw new Exception("The given From value in excel is not matched with the fetched data ");
					}
				}
			} 
			else 
			{
				throw new Exception("The mail is not received to the email address");
			}
		} 
		catch (Exception ex) 
		{
			throw ex;
		}
	}

}
