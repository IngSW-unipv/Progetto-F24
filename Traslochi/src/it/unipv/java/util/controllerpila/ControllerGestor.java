package it.unipv.java.util.controllerpila;

import java.util.ArrayDeque;

import it.unipv.java.controller.icontroller.IController;
import it.unipv.java.controller.icontroller.LoginController;
import it.unipv.java.view.LoginView;
/**STACK JAVADOC:
 * A more complete and consistent set of LIFO stack operations isprovided by the Deque interface and its implementations, whichshould be used in preference to this class. For example: 
 * Deque<Integer> stack = new ArrayDeque<Integer>();
 *
 */
public class ControllerGestor {
	private ArrayDeque<IController> stack;
	private static ControllerGestor instance;
	
	private ControllerGestor() {
		this.stack = new ArrayDeque<>();
		stack.push(new LoginController(new LoginView()));
	}
	
	public static ControllerGestor getInstance() {
		if(instance == null)
			instance = new ControllerGestor();
		return instance;
	}

	public ArrayDeque<IController> getStack() {
		return stack;
	}
}
