package com.example.violationdemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "violation")
public class Violation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "component")
    private String component;
    
    @Column(name = "file")
    private String file;

    @Column(name = "developer")
    private String developer;

    @Column(name = "error_key")
    private String errorKey;

    @Column(name = "error_desc")
    private String errorDesc;

    @Column(name = "severity")
    private String severity;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "date")
    private Date date;

    @Column(name = "type")
    private String type;

    @Column(name = "line_number")
    private String lineNumber;

    public Violation() {
    }

    public Violation(long id,String component, String file, String developer, String errorKey, String errorDesc,
            String severity, Date date, String type, String lineNumber) {
        this.id = id;
        this.component=component;
        this.file = file;
        this.developer = developer;
        this.errorKey = errorKey;
        this.errorDesc = errorDesc;
        this.severity = severity;
        this.date = date;
        this.type = type;
        this.lineNumber = lineNumber;
    }

    public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getErrorKey() {
        return errorKey;
    }

    public void setErrorKey(String errorKey) {
        this.errorKey = errorKey;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

}
