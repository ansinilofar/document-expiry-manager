package com.documentmanager.model;
import java.time.LocalDate;
public class Document
{
    private String documentType;
    private String documentNumber;
    private LocalDate issueDate;
    private LocalDate expiryDate;
    private Long id;
    private int reminderDays;
    public Document(Long id, String documentType, String documentNumber,
                LocalDate issueDate, LocalDate expiryDate, int reminderDays)
{
    this.id = id;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.issueDate = issueDate;
    this.expiryDate = expiryDate;
    this.reminderDays = reminderDays;
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
    public Long getId()
{
    return id;
}

public void setId(Long id)
{
    this.id = id;
}

public int getReminderDays()
{
    return reminderDays;
}

public void setReminderDays(int reminderDays)
{
    this.reminderDays = reminderDays;
}
}