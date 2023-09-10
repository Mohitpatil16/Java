package ZensarEsd;

public class GCSample {
        public void finalize(){
            System.out.println("Garbage collecting the object");
        }
    public static void main(String[] args){
        GCSample sample1 = new GCSample();
        GCSample sample2 = new GCSample();

        sample1 = null;
        sample2 = null;
        System.gc();
    }


}
