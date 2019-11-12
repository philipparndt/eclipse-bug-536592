package example.impl.a;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import example.api.ServiceA1;
import example.api.ServiceB1;

@Component
public class ServiceA1Impl implements ServiceA1 {
	private ServiceB1 serviceB1;
	
	@Reference(unbind = "-")
	public void setServiceB1(ServiceB1 serviceB1) {
		this.serviceB1 = serviceB1;
	}

	public ServiceB1 getServiceB1() {
		return serviceB1;
	}
	
}
