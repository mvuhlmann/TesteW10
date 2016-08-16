package br.univel.duelo;

import br.univel.duelo.arma.ArmaFactory;
import br.univel.duelo.lojamunicao.LojaMunicao;
import br.univel.duelo.pistoleiro.TipoPistoleiro;
import br.univel.duelo.pistoleiro.br.PistoleiroBrFactory;

public class Main {

	public static void main(final String[] args) {
		final DueloBuilder builder = new DueloBuilder();
		builder.setNome1("Perigo")
			.setTipo1(TipoPistoleiro.FORA_DA_LEI)
			.setNome2("Puli�a")
			.setTipo2(TipoPistoleiro.DENTRO_DA_LEI)
			.setPistoleiroFactory(new PistoleiroBrFactory())
			.setArmaFactory(new ArmaFactory())
			.setLojaMunicao(LojaMunicao.getInstancia());
		final Duelo duelo = builder.build();
		duelo.duelar();
	}

}
