import java.util.Scanner;
public class FigurasPlanas extends FigurasGeometricas{

    //Constructores
    public FigurasPlanas() {
    }

    public FigurasPlanas(double a, double b, double c, String nombre) {
        super.a=a;
        super.b=b;
        super.c=c;
        super.nombre=nombre;
        super.lado=lado;
    }
    //funcion sobreescrita de la extends de FigurasGeometricas

    @Override
    public String Figuras() {
        return "Figuras planas (2 dimensiones)";
    }
    Scanner ls=new Scanner (System.in);
    Scanner lss=new Scanner (System.in);
    @Override
    public void area() {

        System.out.println("Ingrese el valor de --> a:\n");
        a= ls.nextDouble();
        System.out.println("Ingrese el valor de --> b :\n");
        b= lss.nextDouble();
    }

    @Override
    public void perimetro() {
        Scanner lal=new Scanner (System.in);
        System.out.println("Ingrese el valor del lado:\n");
        c= lal.nextDouble();

    }

    //Metodos propios de la clase FigurasGeometricas
    public void  cuadrado(){
        double area,perimetro;
        lado=4;
        nombre="Cuadrado";
        System.out.println("----------"+nombre+"-----------");
        System.out.println("El cuadrado cuenta con "+lado+" lados siendo una figura de 2 dimensiones");
        System.out.println("Se calcula el area del cuadrado ingrese el dato de cada lado:\n");
        area();
        area=a*b;
        perimetro=4*a;
        System.out.println("El area del cuadrado el cual es de:"+area+" Y el perimetro de:"+perimetro+"\n");

    }

    public void triangulo(){
        double area,perimetro;
        lado=3;
        nombre="Triangulo";
        System.out.println("----------"+nombre+"-----------");
        System.out.println("El triangulo cuenta con "+lado+" lados siendo una figura de 2 dimensiones");
        System.out.println("Se calcula el area del triangulo ingrese el dato de base y altura:\n");
        area();
        area=a*b/2;
        perimetro=a+a+a;
        System.out.println("El area del triangulo el cual es de:"+area+" Y el perimetro de:"+perimetro+"\n");
    }




}

