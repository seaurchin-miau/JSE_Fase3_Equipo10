package Postwork.FinalProject.model;

import Postwork.FinalProject.validation.OtherNames;
import jakarta.validation.constraints.*;

public class Etapa {

    @NotNull
    @PositiveOrZero
    private long etapaId;

    @OtherNames
    private String name;

    @PositiveOrZero
    @NotEmpty
    private int orden;


    public long getEtapaId() {
        return etapaId;
    }

    public void setEtapaId(long etapaId) {
        this.etapaId = etapaId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
}
