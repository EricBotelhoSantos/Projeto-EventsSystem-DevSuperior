package com.devsuperior.eventssystem.entidades;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_atividade_participante")
public class AtividadeParticipante {

    @EmbeddedId
    private AtividadeParticipantePK id = new AtividadeParticipantePK();

    public AtividadeParticipante() {
    }

    public AtividadeParticipante(Participante participante, Atividade atividade) {
        id.setParticipante(participante);
        id.setAtividade(atividade);
    }

    public Participante getParticipante() {
        return id.getParticipante();
    }

    public void setParticipante(Participante participante) {
        id.setParticipante(participante);
    }

    public Atividade getAtividade() {
        return id.getAtividade();
    }

    public void setAtividade(Atividade atividade) {
        id.setAtividade(atividade);
    }
}
