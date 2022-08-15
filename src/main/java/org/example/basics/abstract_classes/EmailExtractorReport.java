package org.example.basics.abstract_classes;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport{

    private final static Pattern PATTERN = Pattern.compile("^(.+)@(\\S+)$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Email Report";
    }

    @Override
    public String clean(final String line) {
        return line.toLowerCase();
    }

}
