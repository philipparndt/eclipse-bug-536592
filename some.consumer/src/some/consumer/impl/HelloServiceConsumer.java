package some.consumer.impl;

import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;

import some.consumer.api.HelloService;

@Component
public class HelloServiceConsumer {
	private final List<HelloService> services = new ArrayList<>();

	@Activate
	void acitvate() {
		this.services.stream().map(HelloService::hello).forEach(System.out::println);
	}

	@Reference(cardinality = ReferenceCardinality.MULTIPLE)
	public void addService(final HelloService service) {
		this.services.add(service);
	}

	public void removeService(final HelloService service) {
		this.services.remove(service);
	}
}
