[![Build Status](https://travis-ci.org/lukepalmer/zeromq-native.svg?branch=master)](https://travis-ci.org/lukepalmer/zeromq-native)
[![Build status](https://ci.appveyor.com/api/projects/status/k05i2gt0iw7l3djc/branch/master?svg=true)](https://ci.appveyor.com/project/lukepalmer/zeromq-native/branch/master)

# zeromq-native
Native ZeroMQ libraries that work out-of-the-box in java.

## Why?
* Because [ZeroMQ](http://zeromq.org/) is great and I want people to use it
* Needing to compile from source doesn't lend itself to rapid development in java. Many people hit this barrier and look elsewhere.
* Getting the compilation, linking, and loading right can be rather unpleasant

## Hasn't this been done?
There are lots of pacakges that are the result of "hey I compiled and stuffed it in a JAR" that haven't been updated in years. 

This package is the result of a repeatable travis build that can be upgraded via a pull request to change the version number.  Note that the repository itself contains no binaries.
Hopefully this gives it some longevity as well as gives people confidence in using binaries from a 3rd party.

##What is implemented
* Linux 64 bit
* Linux 32 bit
* Windows 64 bit
* Windows 32 bit

OS X should be possible in Travis, particularly if anyone familiar with that ecosystem would like to contribute.

Note that only a SNAPSHOT version is available at the moment as windows builds of JZMQ are not sane in released versions.

#Using 
    <dependency>
        <groupId>net.lukepalmer</groupId>
        <artifactId>zeromq-native</artifactId>
        <version>4.1.5-SNAPSHOT</version>
    </dependency>
    <dependency>
        <groupId>net.lukepalmer</groupId>
        <artifactId>jzmq</artifactId>
        <version>3.1.1-SNAPSHOT</version>
    </dependency>
    
And then you should have working [jzmq bindings](https://github.com/zeromq/jzmq).

#Deploying

Steps to build from scratch and deploy to maven central
1. set version number
2. mvn clean package -DskipTests
3. mvn test
4. mvn deploy
