package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PacienteTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Paciente paciente = new Paciente("12500281", "Paciente Original", new Endereco("Rua Ipanema", 36),"Unimed", "Juiz de Fora");

        Paciente pacienteClone =  paciente.clone();
        pacienteClone.setDocumento("13600392");
        pacienteClone.setNome("Paciente Clonado");
        pacienteClone.setConvenio("SabinSinai");
        pacienteClone.getEndereco().setNumero(37);

        assertEquals("Paciente{documento: 12500281, nome: Paciente Original', endereco: Endereco{logradouro='Rua Ipanema', numero=36}, convenio: Unimed, localNascimento: Juiz de Fora'}", paciente.toString());
        assertEquals("Paciente{documento: 13600392, nome: Paciente Clonado', endereco: Endereco{logradouro='Rua Ipanema', numero=37}, convenio: SabinSinai, localNascimento: Juiz de Fora'}", pacienteClone.toString());
    }
}