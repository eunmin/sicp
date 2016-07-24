(ns sicp.hogle.ex-1-1)

(def 문제1-1
   아래에 여러 식이 있다. 실행기가 찍어내는 값은 무엇인가? 아래 적힌 식의 값을 차례대로 구한다고 하자.)

(+ 5 3 4)
;; 12

(- 9 1)
;; 8

(/ 6 2)
;; 3

(+ (* 2 4) (- 4 6))
;; 6

(def a 3)
;; #'user/a

(def b (+ a 1))
;; #'user/b

(+ a b (* a b))
;; 19

(= a b)
;; false

(if (and (> b a) (< b (* a b)))
  b
  a)
  ;;4

(cond (= a 4) 6
  (= b 4) 10
  :else 25)
; 10

(+ 2 (if (> b a) b a))
; 6

(*
  (cond (> a b) a
        (< a b) b
        :else -1)
  (+ a 1)
)
; 16
