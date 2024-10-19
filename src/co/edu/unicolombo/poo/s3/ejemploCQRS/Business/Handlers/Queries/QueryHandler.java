/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.unicolombo.poo.s3.ejemploCQRS.Business.Handlers.Queries;

/**
 *
 * @author CLEYMER
 */
public interface QueryHandler<C, R> {
    R handle(C command);
}
