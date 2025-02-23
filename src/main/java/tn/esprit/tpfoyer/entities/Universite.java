package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Universite {
    @Id
    Long idUniversite;
    String nomUniversite;
    String adresse;

    @OneToOne
    private Foyer foyer;

}
