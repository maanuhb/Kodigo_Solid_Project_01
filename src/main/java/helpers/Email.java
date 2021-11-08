package helpers;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

public class Email {
    private static final String HOSTNAME= "smtp.gmail.com";
    private static final int PORT = 465;
    private static final String EMAIL ="proyectokodigo@gmail.com";
    private static final String PASS ="Kodigo2021!";

    public static void send(String emailToSend, String fileName) {
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath(fileName);
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Flights Information");
        attachment.setName("Flights.xlsx");


        MultiPartEmail email = new MultiPartEmail();
        email.setHostName(HOSTNAME);
        email.setSmtpPort(PORT);
        email.setAuthentication(EMAIL, PASS);
        email.setSSLOnConnect(true);
        String infoToSend="*********Flight List********* \n ";

        try {
            email.setFrom(EMAIL);
            email.setSubject("Flight List");
            email.addTo(emailToSend);
            email.setMsg(infoToSend);
            email.attach(attachment);
            email.send();
            System.out.println("Report successfully sent to " + emailToSend);
        } catch (EmailException ex) {
            ex.getMessage();
        }
    }
}