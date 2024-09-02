package aula05;

import java.time.LocalDate;

// imutável
// tem que ser construída com os dados
// toString, hashCode, equals
public record Aluno(String nome, LocalDate dataNascimento) {

}
