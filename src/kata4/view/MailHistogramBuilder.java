package kata4.view;

import kata4.model.Histogram;
import java.util.List;
import kata4.model.Mail;

public class MailHistogramBuilder {
    public static Histogram<String> buildt(List<Mail> mailList){
        Histogram<String> histogram = new Histogram<>();
        
        for(Mail mail :mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}