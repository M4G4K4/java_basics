package org.example.basics.serializable_package;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        final Article article = new Article("Article title", "description", "Some content in the article", 2);

        try {
            final FileOutputStream fileOutputStream = new FileOutputStream("./article");
            final ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(article);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Article articleDeserialized = null;

        try {
            final FileInputStream fileInputStream = new FileInputStream("./article");
            final ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            articleDeserialized = (Article) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (articleDeserialized != null) {
            System.out.println(articleDeserialized.getTitle());
            System.out.println(articleDeserialized.getDescription());
            System.out.println(articleDeserialized.getContent());
            System.out.println(articleDeserialized.getVersion());
        }
    }
}
