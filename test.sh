#!/bin/bash

# set -v

DESC=classes
CLASS_PATH=$DESC:$CLASSPATH
JUNIT_RUNNER="org.junit.runner.JUnitCore"

if [ -z "$TARGET" ]; then
    echo "usage: $ TARGET=<<target test java file>> $0"
    exit 1
fi

SRC=$(dirname ${TARGET})
TEST_CLASS=codility.$SRC.$(basename ${TARGET} .java)

javac -d $DESC -cp $CLASS_PATH $SRC/*.java
java -cp $CLASS_PATH $JUNIT_RUNNER $TEST_CLASS
