package dio.spring_aplication_properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.List;

@Component  // Permite que esta classe seja gerenciada pelo Spring
@ConfigurationProperties(prefix = "remetente")  // Mapeia as propriedades com prefixo "remetente"
public class Remetente {
    private String nome;
    private String email;
    private List<Long> telefones;

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Long> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Long> telefones) {
        this.telefones = telefones;
    }
}