package multi.user.service;

import org.apache.thrift.TException;

import multi.user.user.HelloWordService;

public class HelloService implements HelloWordService.Iface{

	public String doAction(String name, int age) throws TException {
		return "hello world!";
	}
}
