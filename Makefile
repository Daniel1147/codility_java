.PHONY: fish
all:

fish: classes/codility/fish/TestFish.class
	java -cp classes codility.fish.TestFish

classes/codility/fish/TestFish.class: fish/*.java
	javac -d classes -g fish/*.java

clean:
	find classes -type f -iname *.class | tr '\n' ' ' | xargs rm -f

# gradle test command example:
# gradle test --tests *to_lower_case*
