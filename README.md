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

OS X will likely come soon. Windows probably not in the near future because it's not yet supported in travis (which is the whole point of how this package works).

#Using 
    <dependency>
        <groupId>net.lukepalmer</groupId>
        <artifactId>zeromq-native</artifactId>
        <version>4.1.4-1</version>
    </dependency>
    <dependency>
        <groupId>org.zeromq</groupId>
        <artifactId>jzmq</artifactId>
        <version>3.1.0</version>
    </dependency>
    
And then you should have working [jzmq bindings](https://github.com/zeromq/jzmq).