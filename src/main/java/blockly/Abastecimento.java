package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Abastecimento {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Abastecimento
public static Var CalcularCustoKm(@ParamMetaData(description = "Entidade") Var Entidade) throws Exception {
 return new Callable<Var>() {

   private Var km = Var.VAR_NULL;

   public Var call() throws Exception {

    km =
    /*# sourceMappingStart=hj-l:k_:!)G*m.+H1EY] */
    cronapi.logic.Operations.isNullOrEmpty(
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km"))).getObjectAsBoolean() ?
    Var.valueOf(0) :
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km"));
    return
/*# sourceMappingStart=t;?QF/%%^2h/Qv[,oY[K */
Var.valueOf(km.equals(
Var.valueOf(0))).getObjectAsBoolean() ?
Var.valueOf(0) : (
cronapi.math.Operations.divisor(
cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("km")),km));
   }
 }.call();
}

}

