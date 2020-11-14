package com.omega.app.po;

import javax.persistence.*;

@Entity(name = "Properties")
@Table(name = "properties")
public class PropertiesPO {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Ref_Key")
    private String refKey;

    @Column(name = "DataVersion")
    private String dataVersion;

    @Column(name = "DeletionMark")
    private boolean deletionMark;

    @Column(name = "Parent_Key")
    private String parentKey;

    @Column(name = "IsFolder")
    private boolean isFolder;

    @Column(name = "Code")
    private long code;

    @Column(name = "Description")
    private String description;

    @Column(name = "ГруппаДоступа_Key")
    private String groupAccessKey;

    @Column(name = "ИНН")
    private String inn;

    @Column(name = "КодПоОКПО")
    private String codeOKPO;

    @Column(name = "Комментарий")
    private String comment;

    @Column(name = "КПП")
    private String kpp;

    @Column(name = "НаименованиеПолное")
    private String fullTitle;

    @Column(name = "ОсновнойБанковскийСчет_Key")
    private String primaryBankAccount;

    @Column(name = "Ответственный_Key")
    private String responsibleKey;

    @Column(name = "РегистрационныйНомер")
    private long registrationNumber;

    @Column(name = "ФизЛицо_Key")
    private String individualKey;

    @Column(name = "ЮрФизЛицо")
    private String legal;

    @Column(name = "сфпCoMagicID")
    private String magicId;

    @Column(name = "ДополнительныеРеквизиты")
    private String additionalDetails;

    @Column(name = "КонтактнаяИнформация")
    private String contactInformation;

    @Column(name = "Predefined")
    private String predefined;

    @Column(name = "PredefinedDataName")
    private String predefinedDataName;

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

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
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
