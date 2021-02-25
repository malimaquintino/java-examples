package model.exceptions;

/*
* extender Exception - o compilador te obriga a tratar o erro
* extender RuntimeException - o compilador não obriga a tratar o erro
* */
public class DomainException extends Exception{
    private static final long serialVersionUID = 1L; // deve ser serializable deve ter um numero

    public DomainException (String msg){ // para poder passar uma msg na instancia
        super(msg);
    }


}
