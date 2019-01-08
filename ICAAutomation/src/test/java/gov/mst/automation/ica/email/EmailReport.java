package gov.mst.automation.ica.email;

/*
 	* Author	 				: Nanthini PushpaRaja
    * Created date			: Dec 08, 2018
    * Last Edited by		: Nanthini PushpaRaja
    * Last Edited date		: Dec 24, 2018
    * Description			: Class is used to define the validation actions
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
 
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import gov.mst.automation.ica.constant.Constants;

public class EmailReport {
	
	 //This method used to send the extent report via mail
	
    public static void send_report() {
        
    final String EMAILFROM =Constants.email_from;
    final String EMAILTO = Constants.email_to;
    final String EMAILPWD = Constants.email_pwd;
    final String SMTP = Constants.email_smtp;
    
      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", SMTP);
      props.put("mail.smtp.port", "587");
  
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(EMAILFROM,EMAILPWD);
         }
      });

      try {
         String reportFileName = "report.html";
         
         DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy", Locale.US);
         String datetext = formatter.format(new Date());
         
         Message message = new MimeMessage(session);
         message.setFrom(new InternetAddress(EMAILFROM));
         message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(EMAILTO));
         message.setSubject("Execution Report:"+datetext);
         
         
         BodyPart messageBodyPart = new MimeBodyPart();
         String newline = System.getProperty("line.separator");
         messageBodyPart.setText("Hi,"
                 + newline+newline +"\t The test execution is completed, Please find the Report"
                 + newline+newline+"Thanks & Regards,"
                 + newline+"Nanthini");
         Multipart multipart = new MimeMultipart();
         multipart.addBodyPart(messageBodyPart);
         messageBodyPart = new MimeBodyPart();
         DataSource source = new FileDataSource(Constants.REPORTPATH);
         messageBodyPart.setDataHandler(new DataHandler(source));
         messageBodyPart.setFileName(reportFileName);
         multipart.addBodyPart(messageBodyPart);
         
         message.setContent(multipart);
         Transport.send(message);         
      }
      catch (MessagingException e) {
            throw new RuntimeException(e);
     }
 }

}
