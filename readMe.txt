Exception in thread "main" org.springframework.remoting.RemoteAccessException: Could not access HTTP invoker remote service at [http://localhost:8080/InvokeServer/service/userService]; nested exception is java.io.IOException: Did not receive successful HTTP response: status code = 404, status message = [null]
	at org.springframework.remoting.httpinvoker.HttpInvokerClientInterceptor.convertHttpInvokerAccessException(HttpInvokerClientInterceptor.java:216)
	at org.springframework.remoting.httpinvoker.HttpInvokerClientInterceptor.invoke(HttpInvokerClientInterceptor.java:147)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:179)
	at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:208)
	at com.sun.proxy.$Proxy1.getUserbyName(Unknown Source)
	at com.abc.invoke.Test.main(Test.java:19)
Caused by: java.io.IOException: Did not receive successful HTTP response: status code = 404, status message = [null]
	at org.springframework.remoting.httpinvoker.SimpleHttpInvokerRequestExecutor.validateResponse(SimpleHttpInvokerRequestExecutor.java:186)
	at org.springframework.remoting.httpinvoker.SimpleHttpInvokerRequestExecutor.doExecuteRequest(SimpleHttpInvokerRequestExecutor.java:93)
	at org.springframework.remoting.httpinvoker.AbstractHttpInvokerRequestExecutor.executeRequest(AbstractHttpInvokerRequestExecutor.java:138)
	at org.springframework.remoting.httpinvoker.HttpInvokerClientInterceptor.executeRequest(HttpInvokerClientInterceptor.java:194)
	at org.springframework.remoting.httpinvoker.HttpInvokerClientInterceptor.executeRequest(HttpInvokerClientInterceptor.java:176)
	at org.springframework.remoting.httpinvoker.HttpInvokerClientInterceptor.invoke(HttpInvokerClientInterceptor.java:144)
	... 4 more
