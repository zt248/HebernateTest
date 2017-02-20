package lesson15_hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "ocenka")
public class Ocenka {

    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer id;

    @Column(name = "student_id")
    private Integer student_id;

    @Column(name = "predmet_id")
    private Integer predmet_id;

    @Column(name = "ocenka")
    private String ocenka;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Integer student_id) {
        this.student_id = student_id;
    }

    public Integer getPredmet_id() {
        return predmet_id;
    }

    public void setPredmet_id(Integer predmet_id) {
        this.predmet_id = predmet_id;
    }

    public String getOcenka() {
        return ocenka;
    }

    public void setOcenka(String ocenka) {
        this.ocenka = ocenka;
    }
}
