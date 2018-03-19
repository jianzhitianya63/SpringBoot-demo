package com.xhxx.pojo;

import java.io.UnsupportedEncodingException;

public class Article {
    private Integer id;

    private String title;

    private String tags;

    private String description;

    private String author;

    private Integer timestamp;

    private Integer readnum;

    private Integer commentnum;

    private String url;

    private String categery1;

    private String categery2;

    private String categery3;

    private String image1;

    private String image2;

    private String image3;

    private Integer imagecount;

    private Integer status;

    private String origin;

    private String failedMsg;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getCategery1() {
        return categery1;
    }

    public void setCategery1(String categery1) {
        this.categery1 = categery1 == null ? null : categery1.trim();
    }

    public String getCategery2() {
        return categery2;
    }

    public void setCategery2(String categery2) {
        this.categery2 = categery2 == null ? null : categery2.trim();
    }

    public String getCategery3() {
        return categery3;
    }

    public void setCategery3(String categery3) {
        this.categery3 = categery3 == null ? null : categery3.trim();
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1 == null ? null : image1.trim();
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2 == null ? null : image2.trim();
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3 == null ? null : image3.trim();
    }

    public Integer getImagecount() {
        return imagecount;
    }

    public void setImagecount(Integer imagecount) {
        this.imagecount = imagecount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getFailedMsg() {
        return failedMsg;
    }

    public void setFailedMsg(String failedMsg) {
        this.failedMsg = failedMsg == null ? null : failedMsg.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}