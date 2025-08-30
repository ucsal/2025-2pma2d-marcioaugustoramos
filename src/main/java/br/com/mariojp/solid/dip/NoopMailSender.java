package br.com.mariojp.solid.dip;


public class NoopMailSender implements MailSender {
    @Override
    public void send(String to, String subject, String body) {
        // não envia nada de verdade
        System.out.printf("Email enviado para %s: %s%n", to, subject);
    }
}