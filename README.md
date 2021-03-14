# Getting Started

### step1: run maven command
to make sure new byte code generating

first, delete all generated `targets` folder

then, run command below in annotator-maven-plugin-demos
```
mvn clean install -U
```

### step2: deploy a war to tomcat

### step3: view result
for swagger2 users
```
http://localhost:8080/swagger-ui.html
```

for swagger3 users
```
http://localhost:8080/swagger-ui/index.html
```

For more details, see [annotator-maven-plugin-all](https://github.com/dragon-zhang/annotator-maven-plugin-all).