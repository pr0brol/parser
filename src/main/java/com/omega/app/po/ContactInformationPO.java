package com.omega.app.po;

import javax.persistence.*;
import java.util.List;

@Entity(name = "ContactInformation")
@Table(name = "contact_information")
public class ContactInformationPO {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy = "Element")
    @JoinColumn(name = "element_id")
    private List<ElementPO> elements;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ElementPO> getElements() {
        return elements;
    }

    public void setElements(List<ElementPO> elements) {
        this.elements = elements;
    }
}
