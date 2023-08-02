package model.exceptions;

/*
 *  Vai ser lançada na entidade de domínio
 *  Excpetion -> o compilador obriga a tratar
 *  RuntimeException -> o compilador não obriga a tratar
 *  Classe serializable -> os objetos podem ser convertidos para bytes e trafegados em redes e arquivos
 */
public class DomainException extends RuntimeException {

	// Número padrão de versão de uma classe serializable
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
