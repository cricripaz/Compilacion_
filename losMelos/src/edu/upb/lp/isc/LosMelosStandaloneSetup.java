/*
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class LosMelosStandaloneSetup extends LosMelosStandaloneSetupGenerated {

	public static void doSetup() {
		new LosMelosStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}