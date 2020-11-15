package com.omega.app.po;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "Entry")
@Table(name = "entry")
public class EntryPO {

    @Column(name = "id")
    private String id;

    @Column(name = "category")
    private String category;

    @Column(name = "title")
    private String title;

    @Column(name = "updated")
    private Date updated;

    @Column(name = "author")
    private String author;

    @Column(name = "summary")
    private String summary;

    @OneToMany(mappedBy = "Link")
    @JoinColumn(name = "link_id")
    private List<LinkPO> links;

    @OneToOne(mappedBy = "Content")
    @JoinColumn(name = "content_id")
    private ContentPO content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<LinkPO> getLinks() {
        return links;
    }

    public void setLinks(List<LinkPO> links) {
        this.links = links;
    }

    public ContentPO getContent() {
        return content;
    }

    public void setContent(ContentPO content) {
        this.content = content;
    }
}
