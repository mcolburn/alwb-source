/*
* generated by Xtext
*/
package net.ages.workbench.resources.dsl;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class AresUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return net.ages.workbench.resources.dsl.ui.internal.AresActivator.getInstance().getInjector("net.ages.workbench.resources.dsl.Ares");
	}
	
}