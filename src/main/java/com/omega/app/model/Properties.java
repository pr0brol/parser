package com.omega.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "properties", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices/metadata")
public class Properties {

    @XmlElement(name = "Ref_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String refKey;
    @XmlElement(name = "DataVersion", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String dataVersion;
    @XmlElement(name = "DeletionMark", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private boolean deletionMark;
    @XmlElement(name = "Parent_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String parentKey;
    @XmlElement(name = "IsFolder", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private boolean isFolder;
    @XmlElement(name = "Code", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private long code;
    @XmlElement(name = "Description", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String description;
    @XmlElement(name = "ГруппаДоступа_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String groupAccessKey;
    @XmlElement(name = "ИНН", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String inn;
    @XmlElement(name = "КодПоОКПО", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String codeOKPO;
    @XmlElement(name = "Комментарий", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String comment;
    @XmlElement(name = "КПП", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String kpp;
    @XmlElement(name = "НаименованиеПолное", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String fullTitle;
    @XmlElement(name = "ОсновнойБанковскийСчет_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String primaryBankAccount;
    @XmlElement(name = "Ответственный_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String responsibleKey;
    @XmlElement(name = "РегистрационныйНомер", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private long registrationNumber;
    @XmlElement(name = "ФизЛицо_Key", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String individualKey;
    @XmlElement(name = "ЮрФизЛицо", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String legal;
    @XmlElement(name = "сфпCoMagicID", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String magicId;
    @XmlElement(name = "ДополнительныеРеквизиты", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String additionalDetails;
    @XmlElement(name = "КонтактнаяИнформация", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private ContactInformation contactInformation;
    @XmlElement(name = "Predefined", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String predefined;
    @XmlElement(name = "PredefinedDataName", namespace = "http://schemas.microsoft.com/ado/2007/08/dataservices")
    private String predefinedDataName;

    public String getRefKey() {
        return refKey;
    }

    public void setRefKey(String refKey) {
        this.refKey = refKey;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public boolean isDeletionMark() {
        return deletionMark;
    }

    public void setDeletionMark(boolean deletionMark) {
        this.deletionMark = deletionMark;
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public void setFolder(boolean folder) {
        isFolder = folder;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGroupAccessKey() {
        return groupAccessKey;
    }

    public void setGroupAccessKey(String groupAccessKey) {
        this.groupAccessKey = groupAccessKey;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getCodeOKPO() {
        return codeOKPO;
    }

    public void setCodeOKPO(String codeOKPO) {
        this.codeOKPO = codeOKPO;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getFullTitle() {
        return fullTitle;
    }

    public void setFullTitle(String fullTitle) {
        this.fullTitle = fullTitle;
    }

    public String getPrimaryBankAccount() {
        return primaryBankAccount;
    }

    public void setPrimaryBankAccount(String primaryBankAccount) {
        this.primaryBankAccount = primaryBankAccount;
    }

    public String getResponsibleKey() {
        return responsibleKey;
    }

    public void setResponsibleKey(String responsibleKey) {
        this.responsibleKey = responsibleKey;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(long registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getIndividualKey() {
        return individualKey;
    }

    public void setIndividualKey(String individualKey) {
        this.individualKey = individualKey;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public String getMagicId() {
        return magicId;
    }

    public void setMagicId(String magicId) {
        this.magicId = magicId;
    }

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    public void setAdditionalDetails(String additionalDetails) {
        this.additionalDetails = additionalDetails;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getPredefined() {
        return predefined;
    }

    public void setPredefined(String predefined) {
        this.predefined = predefined;
    }

    public String getPredefinedDataName() {
        return predefinedDataName;
    }

    public void setPredefinedDataName(String predefinedDataName) {
        this.predefinedDataName = predefinedDataName;
    }
}
