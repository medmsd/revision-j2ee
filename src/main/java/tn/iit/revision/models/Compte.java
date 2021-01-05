package tn.iit.revision.models;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(name = "t_compte")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Compte implements Serializable {
    private static final float tva=0.13f;
    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private float amount;

    @Transient
    private float salary;

    @OneToOne
    @JoinColumn(name = "client_id")
    private Teacher teacher;

    public Compte(float amount, Teacher teacher) {
        this.amount = amount;
        this.teacher = teacher;
    }

    private float getSalary(){
        return this.amount-this.amount*tva;
    }
}
