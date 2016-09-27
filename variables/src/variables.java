/**
 * Created by MerceeAC on 26/09/2016.
 */
public class variables {
    private static int var_class;
    private int var_instancia;

    public void variables(){
        var_class=0;
        var_instancia=1;
    }
    public int metodo_var(){
        int var_metodo = 10;
        return var_metodo;
    }
    public void setVar_class(int val){
        var_class=val;
    }

    public void setVar_instancia(int val){
             var_instancia=val;
         }
    public int getVar_class(){
        return var_class;
    }
    public int getVar_instancia(){
        return var_instancia;
    }
}
