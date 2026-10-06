package com.documentmanager.model;
import java.time.LocalDate;
public class Document
{
    private String documentType;
    private String documentNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    public Document(String documentType,String documentNumber,LocalDate issueDate,LocalDate expiryDate)
    {
        this.documentType=documentType;
        this.documentNumber=documentNumber;
        this.issueDate=issueDate;
        this.expiryDate=expiryDate;

    }
    public String getDocumentType()
    {
        return documentType;
    }
    public void setDocumentType(String documentType)
    {
        this.documentType=documentType;
    }
    public String getDocumentNumber()
    {
        return documentNumber;
    }
    public void setDocumentNumber(String documentNumber)
    {
        this.documentNumber=documentNumber;
    }
    public LocalDate getIssueDate()
    {
        return issueDate;
    }
    public void setIssueDate(LocalDate issueDate)
    {
        this.issueDate=issueDate;
    }
    public LocalDate getExpiryDate()
    {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate)
    {
        this.expiryDate=expiryDate;
    }
}