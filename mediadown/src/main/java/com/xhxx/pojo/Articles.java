package com.xhxx.pojo;

import com.xhxx.utils.ConstantsCode;

import java.util.Date;

/**
 * @author gan
 */
public class Articles {
    private Long id;

    private String title;

    private String tags;

    private String description;

    private String author;

    private String origin;

    private String originurl;

    private Date timestamp;

    private Integer category1;

    private Integer category2;

    private Integer category3;

    private String image1;

    private String image2;

    private String image3;

    private Integer imagecount;

    private Integer status;

    private Date addtime;

    private Integer readnum;

    private Integer praisenum;

    private Integer commentnum;

    private Date lastoperatetime;

    private String lastoperator;

    /* 数据库关键字 无法使用
    private Integer from;
    */

    private String content;

    public Articles() {
    }

    public Articles(Article po) {
        Date now = new Date(System.currentTimeMillis());
        this.title = po.getTitle();
        this.tags = po.getTags();
        this.description = po.getDescription();
        this.content = po.getContent();
        this.author = po.getAuthor();
        this.origin = po.getOrigin();
        this.originurl = po.getUrl();
        this.timestamp = new Date(po.getTimestamp() * 1000L);
        this.category1 = parseInt(po.getCategery1());
        this.category2 = parseInt(po.getCategery2());
        this.category3 = parseInt(po.getCategery3());
        this.image1 = po.getImage1();
        this.image2 = po.getImage2();
        this.image3 = po.getImage3();
        this.imagecount = po.getImagecount();
        this.status = ConstantsCode.SUCCESS;
        this.readnum = 0;
        this.commentnum = 0;
        this.lastoperatetime = now;
        this.lastoperator = "";
        this.praisenum = 0;

    }

    private int parseInt(String s, int i) {
        try {
            i = Integer.parseInt(s);
        } catch (Exception e) {
            i = 0;
        }
        return i;
    }

    private int parseInt(String s) {
        return parseInt(s, 0);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin == null ? null : origin.trim();
    }

    public String getOriginurl() {
        return originurl;
    }

    public void setOriginurl(String originurl) {
        this.originurl = originurl == null ? null : originurl.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getCategory1() {
        return category1;
    }

    public void setCategory1(Integer category1) {
        this.category1 = category1;
    }

    public Integer getCategory2() {
        return category2;
    }

    public void setCategory2(Integer category2) {
        this.category2 = category2;
    }

    public Integer getCategory3() {
        return category3;
    }

    public void setCategory3(Integer category3) {
        this.category3 = category3;
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

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getReadnum() {
        return readnum;
    }

    public void setReadnum(Integer readnum) {
        this.readnum = readnum;
    }

    public Integer getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(Integer praisenum) {
        this.praisenum = praisenum;
    }

    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    public Date getLastoperatetime() {
        return lastoperatetime;
    }

    public void setLastoperatetime(Date lastoperatetime) {
        this.lastoperatetime = lastoperatetime;
    }

    public String getLastoperator() {
        return lastoperator;
    }

    public void setLastoperator(String lastoperator) {
        this.lastoperator = lastoperator == null ? null : lastoperator.trim();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}