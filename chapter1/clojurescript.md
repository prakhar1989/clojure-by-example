# 2.1 ClojureScript

Are you on your employer's computer with no rights to install new software without permission? Or are you on a mobile device and you can't wait to try Clojure? Fear not, we have you covered.

Below what you see is a REPL that works (almost) similar to the one you run in the terminal. Go ahead and try typing `(+ 4 3)` in the REPL. Nice right?

What makes Clojure so awesome is that it runs on two of the most popular technology runtimes (or platforms) of today - JVM (or Java Virtual Machine) and Javascript. This allows Clojure to run right inside your browser (even Node.js) using the magic powers of a compiler called [ClojureScript](https://github.com/clojure/clojurescript).

Although there a few caveats in the *repl* used below, for the purposes of this guide it will suffice. For example, `doc` and `source` will not work. For best experience, set up leiningen and a use the *repl* as indicated in the previous chapter.

Go ahead and try playing with the *repl*.

{{ ../repl.md }}

If you tried running `(println "hello world")`, then you must have recieved a cryptic error.

```
cljs.user> (println "Hello, World")
Compilation error: Error: No *print-fn* fn set for evaluation environment
```

What this basically tells you that the function `println` is not defined. To print text in javascript, you need to run the `console.log` function which prints the text in the console. A better idea is to try the following

```clojure
(js/alert "Hello, World")
```

On running this you should see a simple javascript alert with the message you provided. You can run other native Javascript functions the same way.
