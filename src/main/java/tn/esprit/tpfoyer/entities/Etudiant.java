package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
Long idEtudiant;
    String nomEt;
    String prenomEt;
    Long cin;
    String ecole;
    Date dateNaissance ;


    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiants")
    private Set<Reservation> Reservations;

}
