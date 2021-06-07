import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class DocumentValidator {
    public static void main(String[] args) {
        String cpf = "86288366757";

        CPFValidator cpfValidator = new CPFValidator();

        try {
            cpfValidator.assertValid(cpf);
            System.out.println("CPF VÁLIDO");
        } catch (InvalidStateException e) {
            System.out.println("CPF INVÁLIDO: " + e.getMessage());
        }


    }
}
