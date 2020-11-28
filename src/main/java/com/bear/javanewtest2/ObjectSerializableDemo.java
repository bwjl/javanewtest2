package com.bear.javanewtest2;

import com.bear.javanewtest2.entity.Article;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/11/28 下午4:25
 * Description:
 */

public class ObjectSerializableDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //try {
        //先序列化Article
        //serializableObject();
        //然后去掉Article对象serialVersionUID 进行反序列化
        Article article = unserializableObject();
        System.out.println(article.getTitle()); //Exception in thread "main" java.io.InvalidClassException: com.bear.javanewtest2.entity.Article; local class incompatible: stream classdesc serialVersionUID = -85708722125398142, local class serialVersionUID = 8631348723776379286

//        } catch (IOException | ClassNotFoundException exception) {
//            System.out.println(exception.getMessage() + exception.getStackTrace());
//        }
    }

    /**
     * 序列化对象
     *
     * @return
     */
    public static void serializableObject() throws IOException {
        Article article = new Article();
        article.setTitle("hello world");
        article.setContent("Wow!This is my first Java code!");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("Article.txt")));
        objectOutputStream.writeObject(article);
        System.out.println("serializable success");
        objectOutputStream.close();

    }

    /**
     * 反序列化
     */
    public static Article unserializableObject() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("Article.txt")));

        Article article = (Article) objectInputStream.readObject();
        System.out.println("unserializable success");

        return article;
    }


}
