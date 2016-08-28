(ns sicp.hogle.ex-1-11)

(defn fac [n]
  (if (< n 3)
    n
    (+ fac(n-1)
  )
)

fac(1)

  (define (f n)
  (if (< n 3) n
      (+ (f (- n 1)) (* 2 (f (- n 2))) (* 3 (f (- n 3))))))
