package entities;

public class exibeTabuleiro {
	public String[][] mJog = new String[15][15];
	private Integer jog;

	public void exibeTab() {
    if (mJog[0][0].equals("E")) {
		System.out.println("Erro na carga Arquivo :" + jog);
       	} else 
	{	
		System.out.println(">>>> Exibe Arquivo >>>>" + jog);
		for (int i = 0; i < 15; i++) {
			for (int n = 0; n < 15; n++) {
				if (mJog[i][n] == null) {
					System.out.printf(" !");
				} else
					System.out.printf(" !" + mJog[i][n]);
			}
			System.out.println(" ");
		}
	}
	}

	public exibeTabuleiro(String[][] mJog, Integer jog) {
		this.mJog = mJog;
		this.jog = jog;
	}

}
