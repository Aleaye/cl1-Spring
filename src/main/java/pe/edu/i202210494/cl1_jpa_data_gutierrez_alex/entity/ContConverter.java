package pe.edu.i202210494.cl1_jpa_data_gutierrez_alex.entity;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class ContConverter implements AttributeConverter<Country.Continent, String> {
    @Override
    public String convertToDatabaseColumn(Country.Continent continent) {
        if (continent == null) {
            return null;
        }
        return continent.toString();
    }
    @Override
    public Country.Continent convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) {
            return null;
        }
        for (Country.Continent continent : Country.Continent.values()) {
            if (continent.toString().equals(dbData)) {
                return continent;
            }
        }
        throw new IllegalArgumentException("Unknown continent value: " + dbData);
    }
}
