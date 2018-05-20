/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virtualkeybord;
/**
 *
 * @author Bia
 */
public class pangrama {
    //Variaveis que irao armazenar os dados do arquivo JSON
    private int nivel;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    public String pangrams_nivel(){
        switch(this.getNivel()){
            case 1:
                return "Jane quer LP, fax, CD, giz, TV e bom whisky";
            case 2:
                return "Blitz prende ex-vesgo com cheque fajuto";
            case 3:
                return "Um pequeno jabuti xereta viu dez cegonhas felizes";
            case 4:
                return "Gazeta publica hoje no jornal uma breve nota de faxina na quermesse";
            case 5:
                return "Zebras caolhas de Java querem passar fax para moças gigantes de New York";
        }
        return " ";
    }
}
