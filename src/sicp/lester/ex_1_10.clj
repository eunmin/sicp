(ns sicp.lester.ex-1-10)

(defn A [x y]
  (cond
    (= y 0) 0
    (= x 0) (* 2 y)
    (= y 1) 2
    :else (A (- x 1)
             (A x (- y 1)))))

; (A 1 10)
;; 1024

; (A 2 4)
;; 65536

; (A 3 3)
;; 65536

(def 문제
  "0보다 큰 정수 n이 있을 때 f, g, h 프로시저의 기능을 수학으로 정의해 보라.
  보기를 들어, (k n)은 5n^2을 나타낸다.")

(defn f [n]
  (A 0 n))
;; 2n

(defn g [n]
  (A 1 n))
;; 2^n

(defn h [n]
  (A 2 n))
;; f(n) = 2^f(n-1)

(defn k [n]
  (* 5 n n))
;; 5n^2