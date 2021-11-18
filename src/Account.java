public class Account {
    private int kontoNummer;
    private String ejerNavn;
    private int saldo;

    public Account(int saldo) {
        this.saldo = saldo;
    }
    public Account() {
        this.saldo = 0;
    }



    public int getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(int kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public String getEjerNavn() {
        return ejerNavn;
    }

    public void setEjerNavn(String ejerNavn) {
        this.ejerNavn = ejerNavn;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int insertStonks(int stonksToAdd) {
        this.saldo += stonksToAdd;
        return this.saldo;
    }

    public int getStonks(int stonksToGet) {
        if (stonksToGet > this.saldo) {
            throw new IllegalArgumentException();
        } else {
            this.saldo -= stonksToGet;
            return saldo;
        }
    }

    @Override
    public String toString() {
        return "Navnet på konto ejeren: " + ejerNavn + " " + "Kontonummer: " + kontoNummer + " " + "Nuværende saldo: " + saldo;
    }
}
