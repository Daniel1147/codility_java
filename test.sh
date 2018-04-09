#!/bin/bash

set -u

source ./config.sh

# TCLASS: target test java file

IFS='.' read -ra PACKAGE <<< "$TCLASS"

ROOT_PACKAGE=${PACKAGE[0]}
SUB_PACKAGE=${PACKAGE[1]}
TEST_CLASS=${PACKAGE[2]}

# build
javac -d $DESC -cp $CLASS_PATH $MAIN_DIR/$SUB_PACKAGE/*.java $TEST_DIR/$SUB_PACKAGE/$TEST_CLASS.java

# run
java -cp $CLASS_PATH $JUNIT_RUNNER $ROOT_PACKAGE.$SUB_PACKAGE.$TEST_CLASS
