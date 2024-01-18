FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1
COPY ./ ./src
RUN -sourcepath ./src -d ./out ./src/Calculator.java
RUN java -classpath ./out Calculator
Run javadoc -d ./doc -sourcepath ./src -cp ./out -subpackages actions enterCommand exception