#!/bin/bash

set -u

ROOT_PACKAGE=codility
DESC=classes

CLASS_PATH=$DESC:$CLASSPATH
JUNIT_RUNNER="org.junit.runner.JUnitCore"

# make sure TCLASS exists
if [ -z "$TCLASS" ]; then
    echo "usage: $ TCLASS=<<target test java file>> $0"
    exit 1
fi

IFS='.' read -ra PACKAGE <<< "$TCLASS"

ROOT_PACKAGE=${PACKAGE[0]}
SUB_PACKAGE=${PACKAGE[1]}
TEST_CLASS=${PACKAGE[2]}

TEST_DIR=src/test/java/$ROOT_PACKAGE
MAIN_DIR=src/main/java/$ROOT_PACKAGE

# build main
javac -d $DESC -cp $CLASS_PATH $MAIN_DIR/$SUB_PACKAGE/*.java

# build test
javac -d $DESC -cp $CLASS_PATH $TEST_DIR/$SUB_PACKAGE/$TEST_CLASS.java

# run
java -cp $CLASS_PATH $JUNIT_RUNNER $ROOT_PACKAGE.$SUB_PACKAGE.$TEST_CLASS