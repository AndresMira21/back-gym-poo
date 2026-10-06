package com.gym.Gym.models.entity;

import com.gym.Gym.model.enums.IntensidadCardio;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rutinas_cardio")
@PrimaryKeyJoinColumn(name = "id_rutina")
@Getter @Setter @NoArgsConstructor
public class RutinaCardio extends Rutina {
    @Column(name = "duracion_minutos")
    private Integer duracionMinutos;

    @Enumerated(EnumType.STRING)
    @Column(name = "intensidad", length = 10)
    private IntensidadCardio intensidad;

    @Override public String getObjetivo() { return "Mejorar la resistencia cardiovascular"; }
}
