package com.omega.app.po;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity(name = "Element")
@Table(name = "element")
public class ElementPO {

    @Id
    @Column(name = "id", nullable = false)
    private long id;

    @Column(name = "Ref_Key")
    private String refKey;

    @Column(name = "LineNumber")
    private int lineNumber;

    @Column(name = "Тип")
    private String type;

    @Column(name = "Вид_Key")
    private String viewKey;

    @Column(name = "Представление")
    private String presentation;

    @Column(name = "ЗначенияПолей")
    private String values;

    @Column(name = "Страна")
    private String country;

    @Column(name = "Регион")
    private String region;

    @Column(name = "Город")
    private String city;

    @Column(name = "АдресЭП")
    private String email;

    @Column(name = "ДоменноеИмяСервера")
    private String domainNameServer;

    @Column(name = "НомерТелефона")
    private String phoneNumber;

    @Column(name = "НомерТелефонаБезКодов")
    private String phoneNumberWithoutCode;

    @Column(name = "ВидДляСписка_Key")
    private String viewListKey;

    @Column(name = "ДействуетС")
    private Date activeDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
