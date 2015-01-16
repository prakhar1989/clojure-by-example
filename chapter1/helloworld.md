# 2.0 Hello World

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

Aside from just running code, the `REPL` allows you to view documentation and source code for functions available in the namespace. This is extremely helpful for doing exploratory development. With that, lets get `Hello, World` working.

```clojure
user=> (println "Hello, World")
Hello, World
nil
```

Great! Here's the famed `Hello, World` in Clojure. But wait, what's that `nil` doing there? We didn't type that in so where did that come from?

Well the short answer for that is that the repl prints the value returned by every expression. Since `println` doesn't return return anything (or `nil`) and just prints your message in a newline, you see the repl printing `nil`. For the longer answer - keep reading!
