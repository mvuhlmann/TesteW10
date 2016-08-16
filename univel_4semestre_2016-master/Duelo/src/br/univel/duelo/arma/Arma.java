package br.univel.duelo.arma;

public interface Arma {

	Float atirar();

	Float potenciaTiro();

	Float precisaoTiro();

	Arma recarregar(Integer municoes);

	Boolean temMunicoes();
	
	void adicionaObservador(final ArmaObservador observador);
}
