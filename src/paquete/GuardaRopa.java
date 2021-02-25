package paquete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRopa {

    Map<Integer, List<Prenda>> map = new HashMap<>();
    Integer index = 0;

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        map.put(index, listaDePrenda);
        int id = getId();
        return id;
    }

    private int getId() {
        //ToDo chequear el minimo numero disponible en el map en vez de la implementacion actual
        //por ahora solo incrementa el indice pero es suficiente para el caso de uso
        int id = index;
        index++;
        return id;
    }

    public void mostrarPrendas(){
        System.out.println("prendas en el sistema:");
        map.keySet().forEach(k -> System.out.println("numero:" + k + ", prendas: " + map.get(k)));
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return map.remove(numero);
    }

}
