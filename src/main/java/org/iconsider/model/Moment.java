package org.iconsider.model;

import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by Jesse on 2017-9-17.
 */
public class Moment {
    private String author = "";
    private String content = "";
    private Timestamp dateTime;
    private String[] pics;

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

    public String[] getPics() {
        return pics;
    }

    public void setPics(String[] pics) {
        this.pics = pics;
    }

    public Moment() {
    }

    public Moment(String author, String content, Timestamp dateTime, String[] pics) {
        this.author = author;
        this.content = content;
        this.dateTime = dateTime;
        this.pics = pics;
    }

    @Override
    public String toString() {
        return "Moment{" +
                "author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", dateTime=" + dateTime +
                ", pics=" + Arrays.toString(pics) +
                '}';
    }
}
