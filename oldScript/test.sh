#!/bin/bash

set -u

source ./config.sh

if [ -z ${TEST_CLASS+x} ]; then
    read -p $'target test (TEST_CLASS):\n' TEST_CLASS
fi

IFS='.' read -ra PACKAGE <<< "$TEST_CLASS"

ROOT_PACKAGE=${PACKAGE[0]}
SUB_PACKAGE=${PACKAGE[1]}
TEST_CLASS=${PACKAGE[2]}

# build
javac -d $DESC -cp $CLASS_PATH $MAIN_ROOT/$SUB_PACKAGE/*.java $TEST_ROOT/$SUB_PACKAGE/$TEST_CLASS.java

# run
java -cp $CLASS_PATH $JUNIT_RUNNER $ROOT_PACKAGE.$SUB_PACKAGE.$TEST_CLASS
