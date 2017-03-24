要想客户的能调用服务端的方法，服务端必须要先用tomcat启动(保证正确启动，最好是能访问index.html页面：http://localhost:8080/invoker-server/)
客户的的访问路径为：host:port/${projectName}/${dispatcherName}/${simpleUrlHandlerMappingName}
