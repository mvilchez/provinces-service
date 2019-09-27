package es.sinvied.provinces.service.impl;

import es.sinvied.provinces.domain.ProvinceDTO;
import es.sinvied.provinces.domain.ProvinceListDTO;
import es.sinvied.provinces.service.ProvincesService;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ProvincesServiceImpl implements ProvincesService {
    @Override
    public ProvinceListDTO getProvinces() {
        ProvinceListDTO provinceListDTO = new ProvinceListDTO();
        ProvinceDTO provinceDTO = new ProvinceDTO();
        provinceDTO.setName("Granada");
        provinceDTO.setCode("001");
        provinceListDTO.setProvinces(Collections.singletonList(provinceDTO));
        return provinceListDTO;
    }

    @Override
    public ProvinceDTO getProvince(String code) {
        ProvinceDTO provinceDTO = new ProvinceDTO();
        provinceDTO.setName("Granada");
        provinceDTO.setCode("001");
        return provinceDTO;
    }
}
