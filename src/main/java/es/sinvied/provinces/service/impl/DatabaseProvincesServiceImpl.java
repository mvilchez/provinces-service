package es.sinvied.provinces.service.impl;

import es.sinvied.provinces.domain.ProvinceDTO;
import es.sinvied.provinces.domain.ProvinceListDTO;
import es.sinvied.provinces.model.Province;
import es.sinvied.provinces.repository.ProvincesRepository;
import es.sinvied.provinces.service.ProvincesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Implementation database service to retrieve spain´s provinces
 * TODO usar streams para mapear a DTO
 *
 * @author mvilchez
 */
@Service
public class DatabaseProvincesServiceImpl implements ProvincesService {

    @Autowired
    private ProvincesRepository provincesRepository;

    /**
     * Returns all the provinces
     *
     * @return a ProvinceListDTO
     */
    @Override
    public ProvinceListDTO getProvinces() {
        return toDTO(provincesRepository.findAll());
    }

    /**
     * Finds one province
     *
     * @return a ProvinceDTO
     */
    @Override
    public ProvinceDTO getProvince(Long code) {
        Optional<Province> value = provincesRepository.findById(code);
        ProvinceDTO provinceDTO = null;
        if (value.isPresent()) {
            provinceDTO = toDTO(value.get());
        }
        return provinceDTO;
    }

    private ProvinceListDTO toDTO(Iterable<Province> all) {
        ProvinceListDTO provinceListDTO = new ProvinceListDTO();
        List<ProvinceDTO> provinceDTOList = new ArrayList<>();
        for (Province province : all
        ) {
            ProvinceDTO provinceDTO = new ProvinceDTO();
            provinceDTO.setId(province.getId());
            provinceDTO.setCode(province.getCode());
            provinceDTO.setName(province.getName());
            provinceDTO.setLanguage(province.getIdioma());
            provinceDTOList.add(provinceDTO);
        }
        provinceListDTO.setProvinces(provinceDTOList);
        return provinceListDTO;
    }


    private ProvinceDTO toDTO(Province province) {
        ProvinceDTO provinceDTO = new ProvinceDTO();
        provinceDTO.setId(province.getId());
        provinceDTO.setCode(province.getCode());
        provinceDTO.setName(province.getName());
        provinceDTO.setLanguage(province.getIdioma());
        return provinceDTO;
    }
}
