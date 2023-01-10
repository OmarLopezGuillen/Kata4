package kata4.main;

import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramReader;
import kata4.view.MailHistogramBuilder;

public class Kata4 {
    
    private static String nameFile;
    private static List<Mail> mailList;
    private static Histogram<String> histogram;
    private static HistogramDisplay histogramdisplay;
    public static void main(String[] args) {
        nameFile = "email.txt";
        execute();
    }

    private static void execute() {
        input();
        process();
        output();
    }

    private static void input() {
        mailList = MailHistogramReader.read(nameFile);
    }

    private static void process() {
        histogram = MailHistogramBuilder.buildt(mailList);
    }

    private static void output() {
        histogramdisplay = new HistogramDisplay("Histograma", histogram);
        histogramdisplay.execute();
    }  
}