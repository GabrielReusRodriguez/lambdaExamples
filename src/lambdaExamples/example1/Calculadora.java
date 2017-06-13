package lambdaExamples.example1;

public class Calculadora{

  private int     resultadoInt=0;
  private double  resultadoDouble=0;
  private float   resultadoFloat=0;
  private int     resultadoComplejo=0;
  private boolean estadoInicial = true;

//Constructor
  public Calculadora(){

  }

//Declaracion de interfaces
  interface OperacionMatematicaEntero{
      int calcula(int a, int b);
  }

  interface OperacionMatematicaDouble{
      double calcula(double a, double b);
  }

  interface OperacionMatematicaFloat{
      float calcula(float a, float b);
  }

/*
  interface OperacionMatematicaComplejo{
      int calcula(int a, int b);
  }*/

//Declaracion de lambdas
  public OperacionMatematicaEntero sumaEntero = (int a, int b)-> a+b;
  public OperacionMatematicaEntero restaEntero = (int a, int b)-> a-b;
  public OperacionMatematicaEntero multiplicaEntero = (int a, int b)-> a*b;
  public OperacionMatematicaEntero divideEntero = (int a, int b)-> a/b;

  public OperacionMatematicaDouble sumaDouble = (double a, double b)-> a+b;
  public OperacionMatematicaDouble restaDouble = (double a, double b)-> a-b;
  public OperacionMatematicaDouble multiplicaDouble = (double a, double b)-> a*b;
  public OperacionMatematicaDouble divideDouble = (double a, double b)-> a/b;

  public OperacionMatematicaFloat sumaFloat = (float a, float b)-> a+b;
  public OperacionMatematicaFloat restaFloat = (float a, float b)-> a-b;
  public OperacionMatematicaFloat multiplicaFloat = (float a, float b)-> a*b;
  public OperacionMatematicaFloat divideFloat = (float a, float b)-> a/b;


//Calculos
  public void reset(){
    this.resultadoInt=0;
    this.resultadoDouble=0.0d;
    this.resultadoFloat=0.0f;
    this.resultadoComplejo=0;
    this.estadoInicial = true;
  }

  private void setResultados(int resultado){
    estadoInicial = false;
    resultadoFloat = (float)resultado;
    resultadoInt = (int)resultado;
    resultadoDouble = (double)resultado;
    resultadoComplejo = (int)resultado;
  }

  private void setResultados(double resultado){
    estadoInicial = false;
    resultadoFloat = (float)resultado;
    resultadoInt = (int)resultado;
    resultadoDouble = (double)resultado;
    resultadoComplejo = (int)resultado;
  }

  private void setResultados(float resultado){
    estadoInicial = false;
    resultadoFloat = (float)resultado;
    resultadoInt = (int)resultado;
    resultadoDouble = (double)resultado;
    resultadoComplejo = (int)resultado;
  }


  public int calcula(int a, int b, OperacionMatematicaEntero calculo){

    int resultado =  calculo.calcula(a,b);
    setResultados(resultado);
    return resultado;

  }

  public double calcula(double a, double b, OperacionMatematicaDouble calculo){
    double resultado =  calculo.calcula(a,b);
    setResultados(resultado);
    return resultado;

  }

  public float calcula(float a, float b, OperacionMatematicaFloat calculo){
    float resultado =  calculo.calcula(a,b);
    setResultados(resultado);
    return resultado;
  }

public void printEstado(){
  System.out.println("El resultado de la operacion es:");
  System.out.println("Integer: _"+this.resultadoInt+"_");
  System.out.println("Float: _"+this.resultadoFloat+"_");
  System.out.println("Double: _"+this.resultadoDouble+"_");
  System.out.println("Complejo: _"+this.resultadoComplejo+"_");
}


//Main

  public static void main(String[] args){

    System.out.println("Hola mundo!");
    Calculadora calc = new Calculadora();
    //calc.calcula(1,2,Calculadora.suma);
    calc.calcula(1,2,calc.sumaEntero);
    calc.printEstado();
    calc.calcula(1.0f,2.5f,calc.restaFloat);
    calc.printEstado();
    calc.calcula(1.5,2.3,calc.divideDouble);
    calc.printEstado();


    //calc.calcula(1,2,Calculadora.resta);
    System.exit(0);

  }

}
