package org.example.basics.serializable_package;

import java.io.Serializable;

public class Article implements Serializable {
    private String title;
    private String description;
    private String content;
    private int version;

    public Article(String title, String description, String content, int version) {
        this.title = title;
        this.description = description;
        this.content = content;
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public Article setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Article setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Article setContent(String content) {
        this.content = content;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public Article setVersion(int version) {
        this.version = version;
        return this;
    }
}
