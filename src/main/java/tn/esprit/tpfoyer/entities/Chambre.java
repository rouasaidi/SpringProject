package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    Long idChambre;
    Long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Reservation> Reservations;

    @ManyToOne
    Bloc bloc;
}

