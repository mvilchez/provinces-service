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
        ProvinceDTO provinceDTO2 = new ProvinceDTO();
        provinceDTO2.setName("Madrid");
        provinceDTO2.setCode("002");
        ProvinceDTO provinceDTO3 = new ProvinceDTO();
        provinceDTO3.setName("Barcelona");
        provinceDTO3.setCode("003");
        ProvinceDTO provinceDTO4 = new ProvinceDTO();
        provinceDTO3.setName("Valencia");
        provinceDTO3.setCode("004");
        provinceListDTO.setProvinces(Collections.singletonList(provinceDTO));
        provinceListDTO.setProvinces(Collections.singletonList(provinceDTO2));
        provinceListDTO.setProvinces(Collections.singletonList(provinceDTO3));
        provinceListDTO.setProvinces(Collections.singletonList(provinceDTO4));
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
