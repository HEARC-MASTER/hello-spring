package ch.hearc.jee2024.hellospring;

public class CustomResponse {

    public String valeur1;
    public String valeur2;

    public CustomResponse(String valeur1, String valeur2) {
        this.valeur1 = valeur1;
        this.valeur2 = valeur2;
    }

    public String getValeur1() {
        return valeur1;
    }

    public String getValeur2() {
        return valeur2;
    }


}
