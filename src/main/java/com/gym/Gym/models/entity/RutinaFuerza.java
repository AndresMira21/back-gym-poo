package com.gym.Gym.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rutinas_fuerza")
@PrimaryKeyJoinColumn(name = "id_rutina")
@Getter @Setter @NoArgsConstructor
public class RutinaFuerza extends Rutina {
    @Column(name = "porcentaje_carga_maxima")
    private Integer porcentajeCargaMaxima;

    @Column(name = "descanso_series_seg")
    private Integer descansoSeriesSeg;

    @Override public String getObjetivo() { return "Aumentar la fuerza máxima"; }
}
