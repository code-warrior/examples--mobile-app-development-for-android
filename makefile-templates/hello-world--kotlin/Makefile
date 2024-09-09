# Compilation step: kotlinc hello.kt -include-runtime -d hello.jar
# Run step: java -jar hello.jar

filename = hello

all: compile run

compile:
	kotlinc $(filename).kt -include-runtime -d $(filename).jar

run:
	java -jar $(filename).jar

clean:
	rm $(filename).jar
