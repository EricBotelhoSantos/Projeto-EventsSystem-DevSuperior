package com.devsuperior.eventssystem.entidades;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class AtividadeParticipantePK {

    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participante participante;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public AtividadeParticipantePK() {
    }

    public AtividadeParticipantePK(Participante participante, Atividade atividade) {
        this.participante = participante;
        this.atividade = atividade;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
