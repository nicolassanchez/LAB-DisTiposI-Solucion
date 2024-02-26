package fp.tipos.universidad.test;

import fp.tipos.universidad.Beca;
import fp.tipos.universidad.TipoBeca;

public class TestBeca {

	public static void main(String[] args) {
		
		Beca b1 = new Beca("ABB2024",TipoBeca.MOVILIDAD);
		System.out.println(b1);
        
		Beca b2 = new Beca("ACB2324", 3000.0, 2, TipoBeca.ORDINARIA);
        System.out.println(b2);
        
        b1.setCuantiaTotal(1500.0);
        b1.setDuracion(1);
		System.out.println(b1);

	}
}
