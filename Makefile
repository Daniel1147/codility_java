JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
		$(JC) $(JFLAGS) $*.java

CLASSES = \
	hello-world/HelloWorld.java \
	two-sum/Solution.java \
	circle/intersaction/CircleIntersaction.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
		$(RM) *.class
		$(RM) */*.class
		$(RM) */*/*.class
