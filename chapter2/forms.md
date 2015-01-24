3. Forms
==========

If you've not programmed in a Lisp before Clojure's syntax will look very different from what you're used to. But don't conflate simplicity with familiarity. As you'll soon learn (and hopefully begin to appreciate), you'll notice that Clojure's syntax is simple and follows a uniform structure.

Clojure is a Lisp which stands for LISt Programming. Code in lisps is represented as lists. When you enter code, a part of Clojure called the *reader* reads the text in chunks called **forms** and translates them into Clojure data structures. It is then compiled and executed.

The structure of the form looks like this

```
(       fn         arg1  arg 2  )
^       ^          ^     ^      ^
|       |          |     |      |
opening function   arguments    closing
parens  call                    parens
```

Below are some forms that you can try out in the REPL

```clojure
(+ 10 (* 43 21))

(count "hello world")

(even? 10)
```

{{ ../repl.md }}
