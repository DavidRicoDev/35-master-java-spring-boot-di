package es.davidrico.springboot.di.models.service;

//@Component("miServicioSimple")
//@Primary
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		
		return "Ejecutando algún porceso importante simple...";
	}
}
