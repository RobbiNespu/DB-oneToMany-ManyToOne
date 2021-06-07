package io.robbinespu.demo.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private long id;

        private String name;
    
        @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
        @JoinColumn(name = "order")
        private List<Cart> cart = new ArrayList<>();

    
}

