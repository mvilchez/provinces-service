package es.sinvied.provinces.service;

import es.sinvied.provinces.domain.ProvinceDTO;
import es.sinvied.provinces.domain.ProvinceListDTO;

public interface ProvincesService {
    ProvinceListDTO getProvinces();
    ProvinceDTO getProvince(String code);
}
