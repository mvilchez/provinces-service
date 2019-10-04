package es.sinvied.provinces.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROVINCIAS", schema = "general")
@ApiModel(description = "All details about PROVINCES.")
public class Province {

    @ApiModelProperty(notes = "Province code")
    @Id
    private Long id;
    @Column(name = "COD_PROVINCIA")
    private String code;
    @ApiModelProperty(notes = "Province name")
    @Column(name = "NOMBRE")
    private String name;
    @ApiModelProperty(notes = "Province language")
    @Column(name = "IDIOMA")
    private String idioma;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}