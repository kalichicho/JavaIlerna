package code;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        
        //cleamos el mapa clave valor
        Map<String, String> capitales = new HashMap<>();


        //Agregamos elementos al Hashmap

        capitales.put("España","Madrid");
        capitales.put("Alemania","Berlín");
        capitales.put("Portugal","Lisboa");


        //accedemos a un valor a través de su clave

        System.out.println(capitales.get("España"));
        System.out.println(capitales.get("Alemania"));
        System.out.println(capitales.get("Portugal"));


        //Verificamos si una clave existe en el HashMap

        for(int i = 0; i < capitales.size(); i++){

            if(capitales.containsKey("Alemania")){
                System.out.println("La clave Alemania existe y su valor correspondiente es: " + capitales.get("Alemania"));
                break;
            }

        }

        //Iteramos sobre todas las HASHMAP

        for(String pais : capitales.keySet()){

            System.out.println("La capital del " + pais + " es " + capitales.get(pais));

        }






    }


}
