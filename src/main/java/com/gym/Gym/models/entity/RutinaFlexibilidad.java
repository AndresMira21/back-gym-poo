package com.gym.Gym.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rutinas_flexibilidad")
@PrimaryKeyJoinColumn(name = "id_rutina")
@Getter @Setter @NoArgsConstructor
public class RutinaFlexibilidad extends Rutina {
    @Column(name = "segundos_por_estiramiento")
    private Integer segundosPorEstiramiento;

    @Override public String getObjetivo() { return "Aumentar la movilidad y flexibilidad"; }
}
