import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

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

        String cnpj = "85663920000142";

        CNPJValidator cnpjValidator = new CNPJValidator();

        try {
            cnpjValidator.assertValid(cnpj);
            System.out.println("CPNJ VÁLIDO");
        }catch (InvalidStateException e) {
            System.out.println("CNPJ INVÀLIDO: " + e.getMessage());
        }

        TituloEleitoralValidator tituloEleitoralValidator = new TituloEleitoralValidator();

        String titulo = "721303170108";

        try {
            tituloEleitoralValidator.assertValid(titulo);
            System.out.println("Titulo Eleitoral Valido");
        } catch (InvalidStateException e) {
            System.out.println("Titulo eleitoral invalido: " + e);
        }
    }
}
