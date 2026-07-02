package com.ahmedkh.stock_app.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    @SequenceGenerator(name = "global_seq", sequenceName = "hibernate_sequence", allocationSize = 1)
    private Integer id;

    //@CreatedDate
    @Column(name="creationDate")
    private Instant creationDate;

    //@LastModifiedDate
    @Column(name="lastModifiedDate")
    private Instant lastModifiedDate;


    @PrePersist
      void prePersist() {
        creationDate = Instant.now();
    }

    @PreUpdate
    void preUpdate(){
        lastModifiedDate = Instant.now();
    }
}
