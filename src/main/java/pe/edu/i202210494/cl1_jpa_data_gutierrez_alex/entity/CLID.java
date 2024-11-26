package pe.edu.i202210494.cl1_jpa_data_gutierrez_alex.entity;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CLID implements Serializable {
    private String CountryCode;
    private String Language;
}
