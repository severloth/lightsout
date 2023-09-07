package lightsout;

public enum ColorEstado {
	APAGADO("#DBEDDC"), ENCENDIDO("#00FF00");

	private String hexa;

	ColorEstado(String hexa) {
		this.hexa = hexa;
	}

	public String getHexa() {
		return hexa;
	}

}