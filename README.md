# Getting Started

### step1: clone project
```
git clone https://github.com/dragon-zhang/annotator-maven-plugin-all.git
```

### step2: run command
run command below in annotator-maven-plugin-all
```
mvn clean install -U
```

### step3: run command
to make sure new byte code generating

first, delete all generated `targets` folder

then, run command below in annotator-maven-plugin-demos
```
mvn clean install
```
, 

### step4: view result
for swagger2 users
```
http://localhost:8080/swagger-ui.html
```

for swagger3 users
```
http://localhost:8080/swagger-ui/index.html
```