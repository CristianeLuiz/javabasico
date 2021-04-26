public class FraseAutomatica {
	public static void main (String[] args){
		// três conjuntos de palavras.

		String[] listaUm = {"24/7","varias camadas","30.000 pes","B-to-B","todos ganham","front-end","baseado na web","difundido","inteligente","seis sigma","caminho critico","dinamico"};

		String[] listaDois = {"habilitado","adesivo","valor agregado","orientado","central","distribuido","agrupado","solidificado","independente da maquina","posicionado","em rede","dedicado","alavancado","alinhado","cooperativo","destinado","compartilhado","acelerado"};

		String[] listaTres = {"processo","ponto maximo","solucao","arquitetura","habilitação no nucleo","estrategia","mindshare","portal","espaco","visao","paradigma","missao"};

			int compUm = listaUm.length;
			int compDois = listaDois.length;
			int compTres = listaTres.length;

			int rand1 = (int) (Math.random() * compUm);
			int rand2 = (int) (Math.random() * compDois);
			int rand3 = (int) (Math.random() * compTres);

			String frase = listaUm[rand1] + " " + listaDois[rand2] + " " +
			listaTres[rand3];

			System.out.println("Precisamos de " + frase);

	}
}