package pe.edu.i202210494.cl1_jpa_data_gutierrez_alex.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {

    public enum Continent {
        ASIA("Asia"),
        OCEANIA("Oceania"),
        NORTH_AMERICA("North America"),
        SOUTH_AMERICA("South America"),
        AFRICA("Africa"),
        EUROPE("Europe"),
        ANTARCTICA("Antarctica");

        private final String value;

        Continent(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    @Id
    @Column(name = "Code", nullable = false)
    private String code;
    private String name;
    @Convert(converter = ContConverter.class)
    private Continent continent;
    private String region;
    private double surfaceArea;
    private int indepYear;
    private int population;
    private double lifeExpectancy;
    private double gnp;
    private double gnpOld;
    private String localName;
    private String governmentForm;
    private String headOfState;
    private int capital;
    private String code2;
//

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)

    @ToString.Exclude
    private List<CountryLanguage> languages;

    @OneToMany(mappedBy = "country", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)

    @ToString.Exclude
    private List<City> cities;


}
