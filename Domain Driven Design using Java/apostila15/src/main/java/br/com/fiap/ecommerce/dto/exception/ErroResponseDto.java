package br.com.fiap.ecommerce.dto.exception;

public class ErroResponseDto {

    public String erro;
    public String detalhes;

    public ErroResponseDto(String erro, String detalhes) {
        this.erro = erro;
        this.detalhes = detalhes;
    }

    public ErroResponseDto() {
    }

    public String getErro() {
        return erro;
    }

    public void setErro(String erro) {
        this.erro = erro;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
