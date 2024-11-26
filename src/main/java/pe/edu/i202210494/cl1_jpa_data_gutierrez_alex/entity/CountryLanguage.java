package pe.edu.i202210494.cl1_jpa_data_gutierrez_alex.entity;

import jakarta.persistence.*;
import lombok.*;

@IdClass(CLID.class)
@Table(name="countrylanguage")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class CountryLanguage {
    @Id
    private String CountryCode;
    @Id
    private String Language;
    private String IsOfficial;
    private double Percentage;

    @ManyToOne
    @JoinColumn(name = "CountryCode", insertable = false, updatable = false)
    @ToString.Exclude
    private Country country;
}
