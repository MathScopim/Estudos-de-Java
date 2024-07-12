
public  class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarmensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem Pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem Pelo MSN Messenger");
    }
}
