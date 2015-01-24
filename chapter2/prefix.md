3.1 Prefix Notation
====

Although I don't expect you to see the beauty in uniformity of lisp expressions just yet, one thing that surely would've got you confused would be the arithmetic expression mentioned in the previous section.

```clojure
=> (+ 10 (* 43 21))
913
```

What you see above is called a prefix expression. Unlike infix notation which is what you're typically used to, in prefix notation the operator *preceeds* the operands (hence the name). Although confusing at first, using prefix notation has 2 major benefits

1. Multiple values can easily be operated on in one go - `(+ 1 2 3 4 5 6 7)` is definitely cleaner than `1 + 2 + 3 + 4 + 5`

2. There are no arcane precedence rules (is bitwise or evaluated first or unary not) to master. Everything is made clear using parens -

    ```clojure
    (* (+ 2 4) (/ 124 3))
    ```

In summary, arithmetic operators are functions in Clojure, just as any other named functions and this consistency in treating **all** functions with the **same** form is a hallmark of its simplicity.

