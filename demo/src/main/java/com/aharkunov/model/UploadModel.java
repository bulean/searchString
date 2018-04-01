package com.aharkunov.model;

/**
 * Created by AKharkunov on 29.03.2018.
 */
import org.springframework.web.multipart.MultipartFile;

public class UploadModel {

    private String extraField;

    private MultipartFile[] files;

    public String getExtraField() {
        return extraField;
    }

    public void setExtraField(String extraField) {
        this.extraField = extraField;
    }

    public MultipartFile[] getFiles() {
        return files;
    }

    public void setFiles(MultipartFile[] files) {
        this.files = files;
    }
}