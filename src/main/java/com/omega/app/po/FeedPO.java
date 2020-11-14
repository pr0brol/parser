package com.omega.app.po;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Feed")
@Table(name = "feed")
public class FeedPO {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "Entry")
    @OrderColumn(name = "entry_id")
    private List<EntryPO> entries;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<EntryPO> getEntries() {
        return entries;
    }

    public void setEntries(List<EntryPO> entries) {
        this.entries = entries;
    }
}
