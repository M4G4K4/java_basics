package org.example.basics.abstract_classes;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        final String path = "src/main/java/org/example/generic/example/data.txt";
        new NumberExtractorReportNotOK().prepareAndSendReport(path);


        // Classes that uses abstract
        new NumberExtractorReport().prepareAndSendReport(path);

        new EmailExtractorReport().prepareAndSendReport(path);
    }
}
