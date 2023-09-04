public class ParametrosInvalidosException extends RuntimeException {
  ParametrosInvalidosException() {
    super("O primeiro parâmetro não pode ser maior que o segundo parâmetro.");
  }
}
