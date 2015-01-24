3.3 Exercises
======

1. Write an expression to find the area and circumference of a circle. Assume any value of radius and use the fraction 22/7 as an approximation to Pi.

2. Try converting a few infix expressions into prefix. Here are a couple for practice
    3. `3 + (4 * (15 / 3) - (20 * 0.5))`
    4. `(((4 + 2) - 10) * -1)`

3. What happens when you redefine a binding? Try this out in the REPL

    ```clojure
    (def msg "hello world")
    (def msg "goodbye world")
    (= msg "hello world")
    ;=> true or false?
    ```

{{ ../repl.md }}
