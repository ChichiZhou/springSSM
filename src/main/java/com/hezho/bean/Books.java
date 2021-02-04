package com.hezho.bean;

import java.util.Date;

public class Books {
    private int bookid;
    private String bookName;
    private int issuedCount;
    private Date issuedDate;
    private String bookState;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getIssuedCount() {
        return issuedCount;
    }

    public void setIssuedCount(int issuedCount) {
        this.issuedCount = issuedCount;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getBookState() {
        return bookState;
    }

    public void setBookState(String bookState) {
        this.bookState = bookState;
    }
}
