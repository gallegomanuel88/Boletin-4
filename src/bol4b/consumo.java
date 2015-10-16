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

    public float getConsumoMedio() {
        float consumoMedio = ((litros*100) / distancia);
        return consumoMedio;
    }

    public float getConsumoEuros() {
        return getConsumoMedio() * pGas;
        
    }
    public void setKm (float km){
        distancia = km;
    }
    public void setLitros (float l){
        litros = l;
    }
    public void setvMed (float kmh){
        vMed = kmh;
    }
    public void setpGas (float euros){
        pGas = euros;
    }
}
