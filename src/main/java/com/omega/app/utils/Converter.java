package com.omega.app.utils;

import com.omega.app.model.Content;
import com.omega.app.model.Entry;
import com.omega.app.model.Feed;
import com.omega.app.model.Properties;
import com.omega.app.po.*;

import java.util.ArrayList;

public class Converter {

    public static FeedPO toPO(Feed feed){
        if(feed != null){
            FeedPO result = new FeedPO();
            result.setEntries(new ArrayList<EntryPO>());
            if(feed.getList() != null && !feed.getList().isEmpty()){
                for (Entry entry : feed.getList()) {
                    result.getEntries().add(toPO(entry));
                }
            }
            return result;
        }
        return null;
    }

    public static EntryPO toPO(Entry entry){
        if(entry != null){
            EntryPO result = new EntryPO();
            result.setId(Long.parseLong(entry.getId()));
            result.setCategory(entry.getCategory());
            result.setTitle(entry.getTitle());
            result.setUpdated(entry.getUpdated());
            result.setAuthor(entry.getAuthor());
            result.setSummary(entry.getSummary());
            result.setContent(toPO(entry.getContent()));
            result.setLinks(new ArrayList<LinkPO>());
            for (String link : entry.getLinks()) {
                LinkPO linkPO = new LinkPO();
                linkPO.setTitle(link);
                result.getLinks().add(linkPO);
            }
            return result;
        }
        return null;
    }

    public static ContentPO toPO(Content content){
        if(content != null){
            ContentPO result = new ContentPO();
            if(content.getProperties() != null){
                result.setProperties(toPO(content.getProperties()));
            }
        }
        return null;
    }

    public static PropertiesPO toPO(Properties properties){
        if(properties != null){
            PropertiesPO result = new PropertiesPO();
            result.setRefKey(properties.getRefKey());
            result.setDataVersion(properties.getDataVersion());
            result.setDeletionMark(properties.isDeletionMark());
            result.setParentKey(properties.getParentKey());
            result.setFolder(properties.isFolder());
            result.setCode(properties.getCode());
            result.setDescription(properties.getDescription());
            result.setGroupAccessKey(properties.getGroupAccessKey());
            result.setInn(properties.getInn());
            result.setCodeOKPO(properties.getCodeOKPO());
            result.setComment(properties.getComment());
            result.setKpp(properties.getKpp());
            result.setFullTitle(properties.getFullTitle());
            result.setPrimaryBankAccount(properties.getPrimaryBankAccount());
            result.setResponsibleKey(properties.getResponsibleKey());
            result.setRegistrationNumber(properties.getRegistrationNumber());
            result.setIndividualKey(properties.getIndividualKey());
            result.setLegal(properties.getLegal());
            result.setMagicId(properties.getMagicId());
            result.setAdditionalDetails(properties.getAdditionalDetails());
            result.setContactInformation(properties.getContactInformation());
            result.setPredefined(properties.getPredefined());
            result.setPredefinedDataName(properties.getPredefinedDataName());
            return result;
        }
        return null;
    }
}
