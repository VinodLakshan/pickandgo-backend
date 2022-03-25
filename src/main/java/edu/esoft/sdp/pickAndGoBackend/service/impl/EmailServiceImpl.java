package edu.esoft.sdp.pickAndGoBackend.service.impl;

import edu.esoft.sdp.pickAndGoBackend.model.Schedule;
import edu.esoft.sdp.pickAndGoBackend.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService
{
//    @Autowired
//    private JavaMailSender emailSender;

    @Autowired
    private JavaMailSender mailSender;
    public void setMailSender(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public String sendEmail(String to, Schedule schedule)
    {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("pickandgo.sdp@gmail.com");
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(text);
//        emailSender.send(message);

        try {
        MimeMessagePreparator preparator = new MimeMessagePreparator() {

            public void prepare(MimeMessage mimeMessage) throws Exception {

                mimeMessage.setRecipient(Message.RecipientType.TO,
                        new InternetAddress(to));
                //mimeMessage.setFrom(new InternetAddress("pickandgo.sdp@gmail.com"));
//                mimeMessage.setC("<h1>arun</h1>");
                // use the true flag to indicate you need a multipart message
                MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
                helper.setTo(to);
                helper.setSubject("Delivery Schedule");
                helper.setText("<p>Dear Customer,</p>\n" +
                        "<br>\n" +
                        "<p>Plaese find your schedule here</p>\n" +
                        "<table style=\"border: 1px solid #000; width: auto;\">\n" +
                        "    <tr>\n" +
                        "        <td style=\"border: 1px solid\">Pick Up Goods</td>\n" +
                        "        <td style=\"border: 1px solid\">"+ schedule.getPickUp() +"</td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td style=\"border: 1px solid\">Reach nearest branch</td>\n" +
                        "        <td style=\"border: 1px solid\">" + schedule.getReachCustomerBranch() +"</td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td style=\"border: 1px solid\">Dispatch to vehicle</td>\n" +
                        "        <td style=\"border: 1px solid\">"+ schedule.getDispatchToVehicle() +"</td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td style=\"border: 1px solid\">Reach receiver branch</td>\n" +
                        "        <td style=\"border: 1px solid\">"+ schedule.getReachReceiverBranch() +"</td>\n" +
                        "    </tr>\n" +
                        "    <tr>\n" +
                        "        <td style=\"border: 1px solid\">Deliver to receiver</td>\n" +
                        "        <td style=\"border: 1px solid\">"+ schedule.getDeliver() +"</td>\n" +
                        "    </tr>\n" +
                        "</table>\n" +
                        "<p>* provided schedule is an estimate, few minutes may delay or ealier.</p>\n" +
                        "<br>\n" +
                        "<p>Regards</p>\n" +
                        "<p>Pick & Go. SDP-Group Assignment</p>",true);
            }
        };
            mailSender.send(preparator);
        }
        catch (MailException ex)
        {
            System.err.println(ex.getMessage());
        }
        return null;
    }
}
