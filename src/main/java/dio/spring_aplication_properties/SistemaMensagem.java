package dio.spring_aplication_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component  // Indica que esta classe deve ser gerenciada como um bean Spring
public class SistemaMensagem implements CommandLineRunner {

    private final Remetente remetente;

    @Autowired  // Injeta o bean Remetente
    public SistemaMensagem(Remetente remetente) {
        this.remetente = remetente;
    }

    @Override
    public void run(String... args) throws Exception {
        // Exibe as mensagens ao iniciar a aplicação
        System.out.println("Mensagem enviada por " + remetente.getNome() +
                " com o email " + remetente.getEmail() +
                " e com telefones " + remetente.getTelefones());
        System.out.println("Seu cadastro foi aprovado.");
    }
}
