package engtelecom.poo;
import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if(!setAno(ano) || !setMes(mes) || !setDia(dia)){
            dia = 1;
            mes = 1;
            ano = 1970;
        }
    }
    public Data(int dia, int mes){
        this(dia, mes, 1970);
    }
    public Data(int dia){
        this(dia, 1, 1970);
    }

    public int getDia() {
        return dia;
    }

    public boolean setDia(int dia) {
        if(this.mes == 2) {
            if (ano % 4 == 0 && ano % 100 != 0 && ano % 400 != 0) {
                if(dia >= 1 && dia <= 29) {
                    this.dia = dia;
                    return true;
                }else{
                    return false;
                }
            }
        }
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if(dia >= 1 && dia <= 31){
                this.dia = dia;
                return true;
            }
        }else{
            if(dia >= 1 && dia <= 30){
                this.dia = dia;
                return true;
            }
        }
        return false;
    }

    public int getMes() {
        return mes;
    }

    public boolean setMes(int mes) {
        if(mes >= 1 && mes <= 12) {
            this.mes = mes;
            return true;
        }
        return false;
    }

    public int getAno() {
        return ano;
    }

    public boolean setAno(int ano) {
        if(ano <= LocalDate.now().getYear()) {
            this.ano = ano;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }

    public String dataExtenso(){
        String[] mesPalavra = {"0", "janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        return dia + " de " + mesPalavra[this.mes] + " de " + ano;
    }

    public int dataDiferenca(Data d){
        int sum = 0;
        int max;
        int tempAno = this.ano;
        int tempMes = this.mes;
        int[] dias = {0,31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = this.ano; i < d.ano; i++){
            if(tempAno % 4 == 0 && tempAno % 100 != 0 && tempAno % 400 != 0){
                dias[2] = 29;
            }else{
                dias[2] = 28;
            }
            if(this.ano == d.ano - 1){
                max = d.mes;
            }else{
                max = 12;
            }
            for(int j = tempMes; j <= max; j++){
                sum += dias[j];
            }
            tempAno++;
            tempMes = 1;
        }
        return sum;
    }
}
