package com.senacshoes.api.model.paciente;

import com.senacshoes.api.model.endereco.DadosEndereco;

public record DadosCadastroPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {

}
