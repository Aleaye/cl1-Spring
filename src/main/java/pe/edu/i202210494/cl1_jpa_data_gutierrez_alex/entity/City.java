package pe.edu.i202210494.cl1_jpa_data_gutierrez_alex.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="city")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    private String Name;
    private String District;
    private int Population;

    @ManyToOne
    @JoinColumn(name ="CountryCode", nullable = false)

    @ToString.Exclude
    private Country country;


}
