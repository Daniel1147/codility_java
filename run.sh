#!/bin/bash

# set -v

CLASSPATH=classes

if [ -z "$TARGET" ]; then
    echo "usage: $ TARGET=<<target test java file>> $0"
    exit 1
fi

javac -d $CLASSPATH -g $(dirname $TARGET)/*.java
java -cp $CLASSPATH codility/${TARGET%.*}
