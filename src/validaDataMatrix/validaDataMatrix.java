package aula;

public class validaDataMatrix {

    private final String codigoCompleto;
    private String codMed;
    private String dataProducao;
    private String serial;
    private String lote;

    public validaDataMatrix(String codigoCompleto) {
        this.codigoCompleto = codigoCompleto;
        if (validaTamanho()) {
            extrairPartes();
        }
    }

    private boolean validaTamanho() {
        if (codigoCompleto == null || codigoCompleto.length() != 31) {
            System.out.println("Quantidade de caracteres inválida.");
            return false;
        }
        return true;
    }

    private void extrairPartes() {
        this.codMed = codigoCompleto.substring(0, 13);
        this.dataProducao = codigoCompleto.substring(13, 19);
        this.serial = codigoCompleto.substring(19, 26);
        this.lote = codigoCompleto.substring(26, 31);
    }

    public boolean validarCodMed() {
        System.out.println("Código do Medicamento: " + codMed);
        if (!codMed.matches("[a-zA-Z0-9]{13}")) {
            System.out.println("CodMed inválido.");
            return false;
        }
        return true;
    }

    public boolean validarDataProducao() {
        System.out.println("Data de Produção: " + dataProducao);
        if (!dataProducao.matches("\\d{6}")) {
            System.out.println("Data inválida.");
            return false;
        }
        return true;
    }

    public boolean validarSerial() {
        System.out.println("Número de Série: " + serial);
        if (!serial.matches("[a-zA-Z0-9]{7}")) {
            System.out.println("Número de série inválido.");
            return false;
        }
        return true;
    }

    public boolean validarLote() {
        System.out.println("Lote: " + lote);
        if (!lote.matches("\\d{5}")) {
            System.out.println("Lote inválido.");
            return false;
        }
        return true;
    }

    public boolean validarTudo() {
    	if (!validaTamanho()) return false;
        return validarCodMed() && validarDataProducao() && validarSerial() && validarLote();
    }

 
    public String getCodMed() { return codMed; }
    public String getDataProducao() { return dataProducao; }
    public String getSerial() { return serial; }
    public String getLote() { return lote; }
}
