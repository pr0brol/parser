package com.omega.app.po;

import javax.persistence.*;

@Entity(name = "Content")
@Table(name = "content")
public class ContentPO {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(mappedBy = "Properties")
    @JoinColumn(name = "properties_id")
    private PropertiesPO properties;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public PropertiesPO getProperties() {
        return properties;
    }

    public void setProperties(PropertiesPO properties) {
        this.properties = properties;
    }
}
