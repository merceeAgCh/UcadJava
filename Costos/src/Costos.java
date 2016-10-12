
public class Costos {

    public static void main(String[] args){
        tabla Activos = new tabla(10);
        tabla Pasivos = new tabla(4);
        tabla Capital = new tabla(1);
        /**
         * Paso 1
         * String nombre = "Capital";
         * int indice = Capital.getIndex(nombre);
         * Capital.Table[indice][1] = 3200000;
         *
         */
        Capital.setIndex("Capital",0);
        Capital.Table[Capital.getIndex("Capital")][1] += 3200000;
        Activos.setIndex("Caja",0);
        Activos.setIndex("Banco",1);
        Activos.setIndex("E. Computo",2);
        Activos.setIndex("MyEDO",3);
        Activos.setIndex("IVA a",4);
        Activos.setIndex("Terrenos",5);
        Activos.setIndex("Edificios",6);
        Activos.setIndex("Documentos pplp",7);
        Activos.setIndex("Documento pp",8);
        Activos.setIndex("Clientes",9);
        Pasivos.setIndex("IVA t",0);
        Pasivos.setIndex("E. Transporte",1);
        Pasivos.setIndex("Alamacen",2);
        Pasivos.setIndex("Hipotecas pp",3);
        Activos.Table[Activos.getIndex("Caja")][0] += 3200000;
        System.out.println("\nTabla Activos");
        for (int i = 0 ; i<Activos.nombres.length ; i++){
            System.out.println("\t"+Activos.getName(i)+"\t = \t" + Activos.Table[i][0] + "\t|\t"+Activos.Table[i][1]);
        }
        System.out.println("\nTabla Pasivos");
        for (int i = 0 ; i<Pasivos.nombres.length ; i++){
            System.out.println("\t"+Pasivos.getName(i)+"\t = \t" + Pasivos.Table[i][0] + "\t|\t"+Pasivos.Table[i][1]);
        }
        System.out.println("\nTabla Capital Social");
        for (int i = 0 ; i<Capital.nombres.length ; i++){
            System.out.println("\t"+Capital.getName(i)+"\t = \t" + Capital.Table[i][0] + "\t|\t"+Capital.Table[i][1]);
        }
        System.out.println("El balance de paso 1:\n" +
                "Capital Social = "+ Capital.balance() +"\n" +
                "Activo = "+ Activos.balance() +"\n");
        Activos.Table[Activos.getIndex("Caja")][1] += 2400000;
        Activos.Table[Activos.getIndex("Banco")][0] += 2400000;

    }

    public static class tabla{
        double [][] Table;
        String [] nombres;

        public tabla(int n){
            Table = new double[n][2];
            nombres = new String[n];
            for (int i = 0; i<nombres.length ; i++){
                Table[i][0]=0;
                Table[i][1]=0;
            }
        }
        public void setIndex(String name,int index){
            nombres[index]=name;
        }
        public int getIndex(String name){
            for (int i = 0 ; i<nombres.length; i++) {
                if (nombres[i].equals(name))
                    return i;
            }
            return nombres.length + 1;
        }
        public String getName(int n) {
            return nombres[n];
        }

        public double balance(){
            double a = new Double(0);
            double b = new Double(0);
            for (int i = 0 ; i<nombres.length ; i++){
                a += Table[i][0];
                b += Table[i][1];
            }
            return a-b;
        }

    }
}