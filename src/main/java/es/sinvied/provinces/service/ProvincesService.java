package es.sinvied.provinces.service;

import es.sinvied.provinces.domain.ProvinceDTO;
import es.sinvied.provinces.domain.ProvinceListDTO;
import org.springframework.stereotype.Service;

public interface ProvincesService {
    ProvinceListDTO getProvinces();
    ProvinceDTO getProvince(String code);
}
