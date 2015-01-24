3.2 Naming Things
=======

In Clojure, data or values are *bound* to names using `def`. Values can be strings, numbers, floats, ratios, keywords and even data structures.

```clojure
(def my-name "John Smith")
-> "John Smith"

(def my-age 24)
-> 24

(def ten-years-later (+ 10 my-age))
-> 34

(def my-weight 53.50)
-> 53.50

(def pi-approx (/ 22 7))
-> 22/7
```

Go ahead and try it out in the REPL.

{{ ../repl.md }}
