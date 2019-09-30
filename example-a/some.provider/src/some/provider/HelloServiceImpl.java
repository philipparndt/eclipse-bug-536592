package some.provider;

import some.consumer.api.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String hello() {
		return "hello";
	}

}
