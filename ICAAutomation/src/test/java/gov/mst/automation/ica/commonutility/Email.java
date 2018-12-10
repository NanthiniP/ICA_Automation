package gov.mst.automation.ica.commonutility;

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

import gov.mst.automation.ica.constant.ApplicationConstants;

public class Email {
	
	// Method is used to verify the received email
	
	@Test
	public static void EmailVerify() throws InterruptedException, Exception {

		try{
		Thread.sleep(15000);
		String from=null, subject=null, content = null,
		from_email = null, subject_email=null,content_email=null;
		String text ="Nanthini Pushpa Raja <nanthini.p@mstsolutions.com>|Sample Email|Hi, This is your email for automation. Nanthini Pushparaja Software Engineer - II  | MST SOLUTIONS M | 82203 - 70452";
		String[] emailVerify ;
		emailVerify = text.split("\\|");
		from=emailVerify[0];
		subject=emailVerify[1];
		content=emailVerify[2];
		Properties props = new Properties();
		props.setProperty("mail.store.protocol", "imaps");
		Session session = Session.getInstance(props, null);
		Store store = session.getStore();
		store.connect(ApplicationConstants.hostname, ApplicationConstants.username, ApplicationConstants.password);
		Folder inbox = store.getFolder("INBOX");
		inbox.open(Folder.READ_WRITE);
		int count = inbox.getUnreadMessageCount();
		if(count >0){
		   
		int totalCount = inbox.getMessageCount();
		for(int i=0; i<count;i++){
		int countEmail = totalCount-i;
		Message msg = inbox.getMessage(countEmail);
		msg.setFlag(Flags.Flag.SEEN, true);
		Address[] in = msg.getFrom();
		for(Address address :in){ 
		from_email= address.toString();
		System.out.println(from_email);
		subject_email = msg.getSubject();
		System.out.println(subject_email);
		}
		Object output = msg.getContent();
		if (output instanceof String)  
		{  
		    String body = (String)content;  
		    content_email = body.toString();
		}  
		else if (output instanceof Multipart) {  
		    Multipart mp = (Multipart)output;
		    BodyPart bp = mp.getBodyPart(0);
		    content_email = bp.getContent().toString();
		    System.out.println(content_email);
		}
		String parsed_content = Jsoup.parse(content_email).text();
		System.out.println(parsed_content);
		if(from.equals(from_email)){
		         
		    if(subject_email.contains(subject)){
		     
		    if (parsed_content.contains(content)){
		    System.out.println("Email verified");
		    i = count;
		      }
		    else{
		    throw new Exception("The given content value in excel is not matched with the fetched data ");
		    }
		      }
		    else{
		    throw new Exception("The given subject value in excel  is not matched with the fetched data ");
		    }
		     }
		     else{
		    throw new Exception("The given From value in excel is not matched with the fetched data ");
		     }
		}
		}
		else {
		    throw new Exception("The mail is not received to the email address");
		     }
		}
		catch(Exception ex){
		throw ex;
		}
		    }

}
