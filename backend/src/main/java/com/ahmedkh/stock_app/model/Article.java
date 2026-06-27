package com.ahmedkh.stock_app.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="article")
public class Article extends AbstractEntity {
    @Column (name = "codearticle")
    private String codearticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prixunitaireht")
    private BigDecimal prixunitaireht;

    @Column(name = "tauxtva")
    private BigDecimal tauxtva;

    @Column(name = "prixunitairettc")
    private BigDecimal prixunitairettc;

    private String photo;
    @ManyToOne
    @JoinColumn(name="idcategory")
    private Category category;

}
