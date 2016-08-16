package br.univel.duelo.pistoleiro.br;

import java.util.Objects;

import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;

public class PistoleiroBrFactory implements PistoleiroFactory {

	public Pistoleiro create(final TipoPistoleiro tipo, final String nome) {
		Objects.requireNonNull(tipo, "Tipo cannot be null");
		switch (tipo) {
		case FORA_DA_LEI:
			return new Cangaceiro(nome);
		case DENTRO_DA_LEI:
			return new Delegado(nome);
		default:
			throw new RuntimeException("Tipo de pistoleiro n�o disp�nivel");
		}
	}

}
