package by.kolodyuk.jpa.onetoonelazy.model;

import javax.persistence.*;

@Entity
@Table(name = "parent")
@SecondaryTable(name = "lookup", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id"))
public class ParentLookup {
    Long id;
    String name;
    String info;
    Long lookupId;
    String lookupDescription;

    @Id
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Column(name = "lookup_id")
    public Long getLookupId() {
        return lookupId;
    }

    public void setLookupId(Long lookupId) {
        this.lookupId = lookupId;
    }

    @Column(name = "description", table = "lookup")
    public String getLookupDescription() {
        return lookupDescription;
    }

    public void setLookupDescription(String lookupDescription) {
        this.lookupDescription = lookupDescription;
    }
}
