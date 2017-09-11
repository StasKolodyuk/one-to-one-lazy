package by.kolodyuk.jpa.onetoonelazy.model;

import javax.persistence.*;

@Entity
public class Parent {
    Long id;
    String name;
    String info;
    Lookup lookup;

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lookup_id")
    public Lookup getLookup() {
        return lookup;
    }

    public void setLookup(Lookup lookup) {
        this.lookup = lookup;
    }
}
