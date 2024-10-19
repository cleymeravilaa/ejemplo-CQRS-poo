
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Commands.Handlers;

/**
 *
 * @author CLEYMER
 */
public interface CommandHandler<C, R> {
    R handle(C command);
}
