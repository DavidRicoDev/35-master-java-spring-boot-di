package es.davidrico.springboot.di.models.service;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		
		return "Ejecutando algún porceso importante complicado...";
	}
}
