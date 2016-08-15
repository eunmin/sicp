(ns sicp.lester.ex-1-6)

(defn square [x]
  (* x x))

(defn- abs [x]
  (if (neg? x) (- x) x))

(defn good-enough? [guess x]
  (< (abs (- (square guess) x)) 0.001))

(defn average [x y]
  (/ (+ x y) 2))

(defn improve [guess x]
  (average guess (/ x guess)))

(defn sqrt-iter [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-iter (improve guess x) x)))

(defn sqrt [x]
  (sqrt-iter 1.0 x))

(def 문제
  "Alyssa가 새로 만든 프로시저로 제곱근을 구하려 할 때 어떤 일이 일어나는가?
  설명해 보자.")

(defn new-if [predicate then-clause else-clause]
  (cond
    predicate then-clause
    :else else-clause))

(defn new-sqrt-iter [guess x]
  (new-if (good-enough? guess x)
          guess
          (new-sqrt-iter (improve guess x) x)))

(defn new-sqrt [x]
  (new-sqrt-iter 1.0 x))

;; java.lang.StackOverflowError
;; new-if 프로시저를 사용하면 인자 먼저 계산법에 따라 실제 원하는 시점보다 new-sqrt-iter 프로시저의 평가를 먼저 하기 때문에 무한 재귀로 동작한다.


