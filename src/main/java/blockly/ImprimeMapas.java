package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ImprimeMapas {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ImprimeMapas
public static Var Imprime() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("abc").getObjectAsString());

    System.out.println(
    cronapi.list.Operations.newList(
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",
    Var.valueOf("1")) , Var.valueOf("Código",
    Var.valueOf("BMW"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",
    Var.valueOf("2")) , Var.valueOf("Código",
    Var.valueOf("Audi"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",
    Var.valueOf("3")) , Var.valueOf("Código",
    Var.valueOf("Mercedez")))).getObjectAsString());
    return Var.VAR_NULL;
   }
 }.call();
}

}

