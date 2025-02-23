package tn.esprit.tpfoyer.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Bloc {
    @Id
    Long idBloc;
    String nomBloc;
    Long capaciteBloc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bloc", fetch = FetchType.EAGER)
    private List<Chambre> Chambres;

    @ManyToOne
    Foyer foyer;
}


