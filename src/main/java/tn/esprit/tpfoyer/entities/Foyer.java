package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
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
public class Foyer {
@Id
    Long idFoyer;
String nomFoyer;
Long capaciteFoyer;
    @OneToOne(mappedBy = "foyer")
    private Universite universite;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foyer")
    private Set<Bloc> Blocs;
}
