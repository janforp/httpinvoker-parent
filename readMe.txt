HttpInvoker要求双方均未java切为spring框架

要想客户的能调用服务端的方法，服务端必须要先用tomcat启动(保证正确启动，最好是能访问index.html页面：http://localhost:8080/invoker-server/)
客户的的访问路径为：host:port/${projectName}/${dispatcherName}/${simpleUrlHandlerMappingName}

invoker-client/server :简单的httpinvoker远程调用方法的demo

web-invoker-client/server:在springmvc项目中使用httpinvoker