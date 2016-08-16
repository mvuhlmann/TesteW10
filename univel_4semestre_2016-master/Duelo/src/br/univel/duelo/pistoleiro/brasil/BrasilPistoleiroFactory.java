package br.univel.duelo.pistoleiro.brasil;

import br.univel.duelo.pistoleiro.Pistoleiro;
import br.univel.duelo.pistoleiro.PistoleiroFactory;
import br.univel.duelo.pistoleiro.TipoPistoleiro;

/**
 * F�brica de pistoleiros Brasileiro, sendo um implementa��o da abstract
 * {@link PistoleiroFactory}
 * 
 * @author Will
 *
 */
public class BrasilPistoleiroFactory implements PistoleiroFactory {

	/**
	 * Factory Method para definir qual a implementa��o de pistoleiro deve ser
	 * usada
	 */
	@Override
	public Pistoleiro create(TipoPistoleiro tipo, String nome) {
		switch (tipo) {
		case DENTRO_DA_LEI:
			return new Delegado(nome);
		case FORA_DA_LEI:
			return new Cangaceiro(nome);
		default:
			throw new RuntimeException("Tipo de pistoleiro n�o encontrado");
		}
	}

}
