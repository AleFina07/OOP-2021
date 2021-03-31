import javax.lang.model.element.NestingKind;

import prog.utili.MeseDellAnno;

public class UsoEnum {

	public static void main(String[] args) {

		MeseDellAnno questomese = MeseDellAnno.MARZO;
		
		System.out.println(questomese.numeroGiorni());
		
		MeseDellAnno x = questomese;
		
		MeseDellAnno prossimo = questomese.successivo();
		
		System.out.println(prossimo);
		
		MeseDellAnno sett = MeseDellAnno.valueOf("SETTEMBRE");
		
		System.out.println(sett);
	}

}
