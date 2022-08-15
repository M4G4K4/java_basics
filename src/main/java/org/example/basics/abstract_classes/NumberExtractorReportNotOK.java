package org.example.basics.abstract_classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReportNotOK {
    public String parse(final String path) throws FileNotFoundException {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        String out = "";
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        if(scanner.hasNext()){
            scanner.nextLine();
        }else {
            return "Empty File";
        }

        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            Matcher matcher = pattern.matcher(nextLine);

            if(matcher.matches()){
                out += nextLine + "\n";
            }
        }
        return out.isBlank() ? "Empty File": out;
    }

    public void prepareAndSendReport(final String path) throws FileNotFoundException {
        System.out.println("Starting report");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent report");
    }
}
