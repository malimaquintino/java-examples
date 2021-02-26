/*
* Aqui resolvemos o problema do diamante
* onde temos uma classe abstarta dispositivo e subclasses impressora e scanner cada uma faz sua operação e deve implementar o metodo processDoc definida na classe pai
* se eu criar um dispositivo que scaneia e imprime (multifuncional) de qm a multifuncional herda o metodo processDoc?
* em java não é permitido herança multipla, para soluciionar o problema gera-se duas interfaces uma scanner e outra printer
* */

package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");

		System.out.println();
		ConcreteScanner s = new ConcreteScanner("2003");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}
