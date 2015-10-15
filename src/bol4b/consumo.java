package bol4b;

/**
 *
 * @author manu
 */
public class consumo {

    //atributos

    private float distancia;
    private float litros;
    private float vMed;
    private float pGas;

    //constructores

    public consumo() {

    }

    public consumo(float distancia, float litros, float vMed, float pGas) {

    }

    //metodos

    public float getTiempo(float km, float vMed) {
        float tiempo = (km / vMed);
        return tiempo;
    }

    public float getConsumoMedio(float litros, float distancia) {
        float consumoMedio = (litros * (100 / distancia));
        return consumoMedio;
    }

    public float getConsumoEuros1(float pGas, float litros, float distancia) {
        float consumoEuros = ((litros * (100 / distancia)) * pGas);
        return consumoEuros;
    }

    public float getConsumoEuros2(float pGas) {
        return (getConsumoMedio(litros, distancia) * pGas);
        
    }
    public void setdistancia (float km){
        distancia = km;
    }
}
