import java.util.Objects;

public class Time {
    private int hora;
    private int minuto;
    private int segundo;

    public Time(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    Time nextSecond() {
        if (hora > 24) {
            System.err.println("Error, la hora no puede ser mayor a 25.");
        }

        if (this.segundo <= 59) {
            this.segundo++;
            if (this.segundo >= 60) {
                this.minuto++;
                this.segundo = 0;
                if (this.minuto >= 60) {
                    this.minuto = 0;
                    this.hora++;
                }
                if (this.hora >= 24) {
                    this.hora = 0;
                }
            }
        }

        Time t1 = new Time(hora,minuto,segundo);
        return t1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Time time)) return false;
        return getHora() == time.getHora() && getMinuto() == time.getMinuto() && getSegundo() == time.getSegundo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHora(), getMinuto(), getSegundo());
    }

    @Override
    public String toString() {
        return "Time{" +
                "hora=" + hora +
                ", segundo=" + segundo +
                ", minuto=" + minuto +
                '}';
    }

}
