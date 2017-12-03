package org.iconsider.model;

import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jesse on 2017-9-17.
 */
public class Moment {
    private int id = 0;
    private String author = "";
    private String content = "";
    private Timestamp dateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }


    public Moment() {
    }

    public Moment(int id, String author, String content, Timestamp dateTime) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Moment{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }
}
