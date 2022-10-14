package com.dio.webapiswagger.handler;
// esse é um tratamento particular, pode-se extender o BusinessException para qualquer exceção que se
//queira criar;
public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatório", campo);
    }
}
