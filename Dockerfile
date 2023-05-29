FROM sapmachine:latest
RUN mkdir /opt/myapp
COPY out/artifacts/DemoJavaApp_jar/DemoJavaApp.jar /opt/myapp
CMD ["java", "-jar", "/opt/myapp/DemoJavaApp.jar"]