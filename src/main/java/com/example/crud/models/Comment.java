package com.example.crud.models;

import com.example.crud.validations.ValidName;
import org.hibernate.validator.constraints.Length;

import java.util.Date;

public class Comment {

    private String id;
    private String photoId;
    @Length(min = 5)
    private String message;
    @ValidName
    private String createdBy;
    private Date dateCreated;

    public Comment(String message, String createdBy, Date dateCreated) {
        this.message = message;
        this.createdBy = createdBy;
        this.dateCreated = dateCreated;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhotoId() {
        return photoId;
    }

    public void setPhotoId(String photoId) {
        this.photoId = photoId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
