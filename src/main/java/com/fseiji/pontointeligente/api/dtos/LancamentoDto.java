package com.fseiji.pontointeligente.api.dtos;

import java.util.Optional;

import org.hibernate.validator.constraints.NotEmpty;

public class LancamentoDto {

	private Optional<Long> id = Optional.empty();
	private String data;
	private String tipo;
	private String descricao;
	private String localizacao;
	private Long funcionarioId;

	public LancamentoDto() {
	}

	public Optional<Long> getId() {
		return id;
	}

	public void setId(Optional<Long> id) {
		this.id = id;
	}

	@NotEmpty(message = "Data não pode ser vazia")
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Long getFuncionarioId() {
		return funcionarioId;
	}

	public void setFuncionarioId(Long funcionarioId) {
		this.funcionarioId = funcionarioId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LancamentoDto [id=");
		builder.append(id);
		builder.append(", data=");
		builder.append(data);
		builder.append(", tipo=");
		builder.append(tipo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", localizacao=");
		builder.append(localizacao);
		builder.append(", funcionarioId=");
		builder.append(funcionarioId);
		builder.append("]");
		return builder.toString();
	}

}
