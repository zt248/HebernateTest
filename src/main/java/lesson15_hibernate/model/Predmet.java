package lesson15_hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "predmet")
public class Predmet {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "predmet_name")
    private String predmet_name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPredmet_name() {
        return predmet_name;
    }

    public void setPredmet_name(String predmet_name) {
        this.predmet_name = predmet_name;
    }
}
