package figueiredo.rodrigo.busucsal;

import java.io.Serializable;

public class Roteiro implements Serializable {

    private String percuso;
    private String horarios;
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }



    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getPercuso() {
        return percuso;
    }

    public void setPercuso(String percuso) {
        this.percuso = percuso;
    }

}
