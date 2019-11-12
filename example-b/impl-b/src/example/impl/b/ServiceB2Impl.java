package example.impl.b;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import example.api.ServiceA2;

@Component
public class ServiceB2Impl implements ServiceA2 {
	@Reference
	private ServiceA2 serviceA2;

}
