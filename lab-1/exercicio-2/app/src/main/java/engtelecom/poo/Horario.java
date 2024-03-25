package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora, int minuto, int segundo){
        if(!setHora(hora) || !setMinuto(minuto) || !setSegundo(segundo)){
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }
    public Horario(int hora){
        this(hora, 0, 0);
    }
    public Horario(int hora, int minuto){
        this(hora, minuto,0);
    }
    public Horario(){
        this(0,0,0);
    }

    public boolean setHora(int hora) {
        if(hora >= 0 && hora < 24) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if(minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if(segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public String escreveHorario () {
        int[] temp = {this.hora, this.minuto, this.segundo};
        String[] palavras = {"zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove",
                "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete",
                "dezoito", "dezenove"};
        String[] palavras_dezena = {"0", "0", "vinte", "trinta", "quarenta", "cinquenta"};
        String[] escrita = {""};

        for (int i = 0; i < 3; i++) {
            int dezena = temp[i] / 10;
            int unidade = temp[i] % 10;
            if (this.hora == 1) {
                escrita[0] += "uma";
            } else if (this.hora == 2) {
                escrita[0] += "duas";
            } else if (temp[i] < 20) {
                escrita[0] += palavras[temp[i]];
            } else {
                escrita[0] += palavras_dezena[dezena];
                escrita[0] += " e " + palavras[unidade];
            }
            if (i == 0) {
                escrita[0] += " horas ";
            } else if (i == 1) {
                escrita[0] += " minutos e ";
            } else {
                escrita[0] += " segundos";
            }
        }
        return escrita[0];
    }

    public long horarioSegundos(){
        return this.hora * (3600 + (this.minuto * 60) + this.segundo);
    }
    public long diferencaHorarios(Horario h){
        return this.horarioSegundos() - h.horarioSegundos();
    }
}


