package entidades;

import java.util.Comparator;

public class Comparar {
    public static Comparator<Pasaje> porCodigo = new Comparator<Pasaje>() {
        @Override
        public int compare(Pasaje t, Pasaje t1) {            
            if(t.getIdPasaje()<t1.getIdPasaje()){
                return -1;
            }
            if(t.getIdPasaje()>t1.getIdPasaje()){
                return 1;
            }
            return 0;
        }
    };
    
    public static Comparator<Pasaje> porRuta = new Comparator<Pasaje>() {
        @Override
        public int compare(Pasaje t, Pasaje t1) { 
            if(t.getRuta().getIdRuta()<t1.getRuta().getIdRuta()){
                return -1;
            }
            if(t.getRuta().getIdRuta()>t1.getRuta().getIdRuta()){
                return 1;
            }
            return 0;
        }
    };

    public static Comparator<Pasaje> porColectivo = new Comparator<Pasaje>() {
        @Override
        public int compare(Pasaje t, Pasaje t1) {            
            if(t.getColectivo().getIdColectivo()<t1.getColectivo().getIdColectivo()){
                return -1;
            }
            if(t.getColectivo().getIdColectivo()>t1.getColectivo().getIdColectivo()){
                return 1;
            }
            return 0;
        }
    };
//    
//    public static Comparator<Pasaje> porNombre = new Comparator<Pasaje>() {
//        @Override
//        public int compare(Pasaje t, Pasaje t1) {            
//            return t.getDescripcion().compareToIgnoreCase(t1.getDescripcion());
//        }
//    };
}