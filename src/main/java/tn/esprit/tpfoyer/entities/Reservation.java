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

public class Reservation {
    @Id
     String idReservation;
    Date anneeUniversitaire;
    Boolean estValide;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;


}
