# Hello World

With leiningen installed, lets run our first Clojure program.

### REPL

Clojure is a great programming language for prototyping. It's allows you to run code in an interactive console for quick feedback. This console is called a REPL (*Read-Eval-Print-Loop*).

To run a repl, run `lein repl` in your terminal. You'll see something similar to prompt below.

```
$ lein repl
nREPL server started on port 51191 on host 127.0.0.1
REPL-y 0.3.0
Clojure 1.5.1
    Docs: (doc function-name-here)
          (find-doc "part-of-name-here")
  Source: (source function-name-here)
 Javadoc: (javadoc java-object-or-class-here)
    Exit: Control+D or (exit) or (quit)
 Results: Stored in vars *1, *2, *3, an exception in *e

user=>
```

Aside from just running code, the `REPL` allows you to view documentation and source code for functions defined. This is extremely helpful for doing exploratory development. With that, lets type in the following

```
user=> (println "Hello, World")
Hello, World
nil
```
