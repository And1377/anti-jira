package com.app.model;

public class Ticket {
    private long id;
    private String summary;
    private String description;
    private int likesCount;

    //-------------GETTERS/SETTERS------------//
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }
}

// 5 обектов связаных с обектом... и в каждам расписать атрибуты с правильным типом данных и расписать \
