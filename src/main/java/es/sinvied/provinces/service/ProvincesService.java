package es.sinvied.provinces.service;

import es.sinvied.provinces.domain.ProvinceDTO;
import es.sinvied.provinces.domain.ProvinceListDTO;

public interface ProvincesService {
    /**
     * Returns all the provinces
     *
     * @return a ProvinceListDTO
     */
    ProvinceListDTO getProvinces();

    /**
     * Finds one province
     *
     * @return a ProvinceDTO
     */
    ProvinceDTO getProvince(Long code);
}
