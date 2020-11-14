package com.omega.app;

import com.omega.app.model.Feed;
import com.omega.app.po.FeedPO;
import com.omega.app.utils.Converter;
import com.omega.app.utils.XmlParse;

import javax.xml.bind.JAXBException;

public class MainApp {
    public static void main(String[] args) throws JAXBException {

        String file = "/home/ilya/IdeaProjects/prj/parser/src/main/resources/new.xml";
        Feed feed = XmlParse.read(file);

        FeedPO feedPO = Converter.toPO(feed);
    }
}
