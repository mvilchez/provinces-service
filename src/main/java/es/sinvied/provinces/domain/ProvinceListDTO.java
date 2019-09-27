package es.sinvied.provinces.domain;

import java.util.List;

/**
 * Data Transfer Object class
 *
 * @author Marino Vilchez
 */
public class ProvinceListDTO {
    private List<ProvinceDTO> provinces;

    public List<ProvinceDTO> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<ProvinceDTO> provinces) {
        this.provinces = provinces;
    }
}
