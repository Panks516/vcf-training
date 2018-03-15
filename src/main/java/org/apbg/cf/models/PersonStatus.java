package org.apbg.cf.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "person_status")
public class PersonStatus {
    @Id
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(generator = "uuid2")
    @Column(columnDefinition = "BINARY(16)")
    private UUID uuid;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TIMESTAMP_FIELD")
    private Date updatedTime;

    public PersonStatus() {
    }

    public PersonStatus(Person person, String status, Date updatedTime) {
        super();
        this.person = person;
        this.status = status;
        this.updatedTime = updatedTime;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

