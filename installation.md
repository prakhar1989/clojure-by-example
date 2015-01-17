# 1.0 Installation

Clojure's only dependancy is Java. To make sure you have java installed, run the following -

```
$ java -version
java version "1.7.0_51"
Java(TM) SE Runtime Environment (build 1.7.0_51-b13)
Java HotSpot(TM) 64-Bit Server VM (build 24.51-b03, mixed mode)
```

If Java is not installed, please follow the directions on the main java [website]() to install it for your system. With that installed, lets move to Clojure.

The easiest way to use Clojure is via [leiningen](http://leiningen.org/). In the words of [Daniel Higginbotham](http://www.flyingmachinestudios.com/) Leiningen is the Swiss Army Bazooka of Clojure development. It allows you to create new projects, run the repl, fetch the dependancies and a host of other things. Please refer to the project [website](http://leiningen.org) to learn what more it's capable of.

To install leiningen on Linux / Mac, you just need to grab the `lein` script.

```
$ wget https://raw.githubusercontent.com/technomancy/leiningen/stable/bin/lein
$ chmod +x lein
$ mv lein /usr/local/bin
$ lein
```

This causes the package to self-install. Run `lein -v` to make sure you are ready for the subsequent lessons.
