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

In the future I plan to add OS X and possibly Windows.
