#!/bin/sh

find shared/src/commonMain/resources/ -type f -exec cp -f {} jsApp/src/jsMain/resources/ \;
