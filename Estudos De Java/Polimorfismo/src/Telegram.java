public  class Telegram extends ServicoMensagemInstantanea {
    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
