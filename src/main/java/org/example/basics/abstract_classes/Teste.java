package org.example.basics.abstract_classes;

import java.util.regex.Pattern;

public class Teste extends ExtractorReport  {
    @Override
    public Pattern getPattern() {
        return null;
    }

    @Override
    public String getReportName() {
        return null;
    }

    @Override
    public String clean(String line) {
        return null;
    }
}
