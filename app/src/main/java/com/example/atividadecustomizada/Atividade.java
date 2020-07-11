package com.example.atividadecustomizada;

public class Atividade {
    private String nome_atividade = "";
    private String responsavel = "";

    public Atividade (String nome_atividade, String responsavel)
    {
        this.nome_atividade = nome_atividade;
        this.responsavel = responsavel;
    }

    public String getNome_atividade()
    {
        return nome_atividade;
    }

    public void setNome_atividade(String nome_atividade)
    {
        this.nome_atividade = nome_atividade;
    }

    public String getResponsavel()
    {
        return responsavel;
    }

    public void setResponsavel(String responsavel)
    {
        this.responsavel = responsavel;
    }
}
