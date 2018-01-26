package com.example.android.miwok.entity;

/**
 * Created by Uladzislau_Shalamits on 1/3/2018.
 */

public class Word {

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int auditResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int resourceId, int auditResourceId) {
        this.auditResourceId = auditResourceId;
        this.imageResourceId = resourceId;
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int auditResourceId) {
        this.auditResourceId = auditResourceId;
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getAuditResourceId() {
        return auditResourceId;
    }

    public void setAuditResourceId(int auditResourceId) {
        this.auditResourceId = auditResourceId;
    }

    public boolean hasImage() {
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}
