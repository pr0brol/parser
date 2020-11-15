package com.omega.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "element", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
public class Element {

    @XmlElement(name = "Ref_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String refKey;
    @XmlElement(name = "LineNumber", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private int lineNumber;
    @XmlElement(name = "Тип", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String type;
    @XmlElement(name = "Вид_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String viewKey;
    @XmlElement(name = "Представление", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String presentation;
    @XmlElement(name = "ЗначенияПолей", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String values;
    @XmlElement(name = "Страна", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String country;
    @XmlElement(name = "Регион", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String region;
    @XmlElement(name = "Город", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String city;
    @XmlElement(name = "АдресЭП", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String email;
    @XmlElement(name = "ДоменноеИмяСервера", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String domainNameServer;
    @XmlElement(name = "НомерТелефона", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String phoneNumber;
    @XmlElement(name = "НомерТелефонаБезКодов", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String phoneNumberWithoutCode;
    @XmlElement(name = "ВидДляСписка_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String viewListKey;
    @XmlElement(name = "ДействуетС", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private Date activeDate;

    public String getRefKey() {
        return refKey;
    }

    public void setRefKey(String refKey) {
        this.refKey = refKey;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getViewKey() {
        return viewKey;
    }

    public void setViewKey(String viewKey) {
        this.viewKey = viewKey;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomainNameServer() {
        return domainNameServer;
    }

    public void setDomainNameServer(String domainNameServer) {
        this.domainNameServer = domainNameServer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumberWithoutCode() {
        return phoneNumberWithoutCode;
    }

    public void setPhoneNumberWithoutCode(String phoneNumberWithoutCode) {
        this.phoneNumberWithoutCode = phoneNumberWithoutCode;
    }

    public String getViewListKey() {
        return viewListKey;
    }

    public void setViewListKey(String viewListKey) {
        this.viewListKey = viewListKey;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }
}
