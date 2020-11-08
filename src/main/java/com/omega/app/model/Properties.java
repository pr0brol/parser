package com.omega.app.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Properties {

    @XmlElement(name = "Ref_Key")
    private String refKey;
    @XmlElement(name = "DataVersion")
    private String dataVersion;
    @XmlElement(name = "DeletionMark")
    private boolean deletionMark;
    @XmlElement(name = "Parent_Key")
    private String parentKey;
    @XmlElement(name = "IsFolder")
    private boolean isFolder;
    @XmlElement(name = "Code")
    private long code;
    @XmlElement(name = "Description")
    private String description;
    @XmlElement(name = "ГруппаДоступа_Key")
    private String groupAccessKey;
    @XmlElement(name = "ИНН")
    private String inn;
    @XmlElement(name = "КодПоОКПО")
    private String codeOKPO;
    @XmlElement(name = "Комментарий")
    private String comment;
    @XmlElement(name = "КПП")
    private String kpp;
    @XmlElement(name = "НаименованиеПолное")
    private String fullTitle;
    @XmlElement(name = "ОсновнойБанковскийСчет_Key")
    private String primaryBankAccount;
    @XmlElement(name = "Ответственный_Key")
    private String responsibleKey;
    @XmlElement(name = "РегистрационныйНомер")
    private long registrationNumber;
    @XmlElement(name = "ФизЛицо_Key")
    private String individualKey;
    @XmlElement(name = "ЮрФизЛицо")
    private String legal;
    @XmlElement(name = "сфпCoMagicID")
    private String magicId;
    @XmlElement(name = "ДополнительныеРеквизиты")
    private String additionalDetails;
    @XmlElement(name = "КонтактнаяИнформация")
    private String contactInformation;
    @XmlElement(name = "Predefined")
    private String predefined;
    @XmlElement(name = "PredefinedDataName")
    private String predefinedDataName;

}
