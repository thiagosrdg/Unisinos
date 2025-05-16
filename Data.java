/* Classe Data:
• uma data possui um dia, um mês e um ano
• crie um construtor que recebe parâmetros para inicializar todos os atributos
• crie o método toString e os métodos GET e SET dos atributos */

public class Data{
    //Atributos
    public int dia;
    public int mes;
    public int ano;
    
    //Construtor
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    //Metodos
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    @Override
    public String toString(){
        return "Data: " + dia + "/" + mes + "/" + ano;
    }
}
