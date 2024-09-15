filename = val-example

all: compile run

compile:
	kotlinc $(filename).kt -include-runtime -d $(filename).jar

run:
	java -jar $(filename).jar

clean:
	rm $(filename).jar
