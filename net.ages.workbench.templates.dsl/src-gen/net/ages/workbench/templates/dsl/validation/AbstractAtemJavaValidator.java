/*
* generated by Xtext
*/
package net.ages.workbench.templates.dsl.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractAtemJavaValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(net.ages.workbench.templates.dsl.atem.AtemPackage.eINSTANCE);
		return result;
	}

}
