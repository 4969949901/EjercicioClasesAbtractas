import java.util.Scanner;
public class FigurasVolumetricas extends FigurasGeometricas{
    public FigurasVolumetricas(double a, double b, double c) {
        super.a=a;
        super.b=b;
        super.c=c;
        super.nombre=nombre;

    }

    public FigurasVolumetricas() {
    }

    //funcion sobreescrita de la extends de FigurasGeometricas
    @Override
    public String Figuras() {
        return "Figuras Volumetricas (3 dimensiones)";
    }
    Scanner lss=new Scanner (System.in);
    @Override
    public void area() {
        System.out.println("Ingrese el valor de --> genereatriz:\n");
        a= lss.nextDouble();
        Scanner lss=new Scanner (System.in);
        System.out.println("Ingrese el valor de --> radio :\n");
        b= lss.nextDouble();

    }

    @Override
    public void perimetro() {
        System.out.println("Ingrese el valor de --> altura :\n");
        c= lss.nextDouble();


    }
    public void volumen(){
        System.out.println("Ingrese el valor de --> largo :\n");
        a= lss.nextDouble();
        System.out.println("Ingrese el valor de --> ancho :\n");
        b= lss.nextDouble();
        System.out.println("Ingrese el valor de --> alto :\n");
        c= lss.nextDouble();
    }
    public void conoRecto(){
        double area,volumen,radio2;
        nombre="Cono";
        System.out.println("----------"+nombre+"-----------");
        System.out.println("Se calcula el area del cono ingrese el dato de  altura y radio:\n");
        area();
        perimetro();
        radio2=Math.pow(b,2);
        area= Math.PI*b*(b+a);
        volumen=Math.PI*radio2*c/3;
        System.out.println("El area del cono  es de:"+area+" Y el volumen es del cono es de: "+volumen+"\n");
    }
    public void ortoedro(){
        double vol;
        nombre="Ortoedro";
        System.out.println("----------"+nombre+"-----------");
        System.out.println("Se calcula el volumen del ortoedro por favor ingresar el largo, ancho y el alto" + ":\n");
        volumen();
        vol=a*b*c;
        System.out.println(" El volumen del Ortoedro es de: "+vol+"\n");
    }
}
