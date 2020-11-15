package com.omega.app.utils;

import com.omega.app.model.Content;
import com.omega.app.model.Element;
import com.omega.app.model.Entry;
import com.omega.app.model.Feed;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlParse {

    public static Feed read(String file) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Feed.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Object o = jaxbUnmarshaller.unmarshal(new File(file));
        return (Feed) o;
    }

}
