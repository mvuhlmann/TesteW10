package br.univel.patterns.builder.simpleobject;

public class MainSimpleObjectBuilder {

	public static void main(final String[] args) {
		// Sem builder
		new Pessoa("Santos", "Will", "000", "000", null, null, null, null);
		// Com builder
		final PessoaBuilder builder = new PessoaBuilder();
		builder.setSobrenome("Santos").setNome("Will").setCpf("000").setRg("000");
		builder.build();
	}
}
