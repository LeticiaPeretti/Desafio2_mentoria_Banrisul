package testSuite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import viaCep.cepFormatoInvalido;
import viaCep.cepInexistente;
import viaCep.validaCep;

@RunWith(JUnitPlatform.class)
@SelectClasses({
	validaCep.class,
	cepInexistente.class,
	cepFormatoInvalido.class
})
public class TodosOsTestes {

}
