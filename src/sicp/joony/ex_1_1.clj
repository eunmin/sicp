(ns sicp.joony.ex-1-1)

(def 문제
  "아래에 여러 식이 있다. 실행기가 찍어내는 값은 무엇인가?
  아래에 적힌 식의 값을 차례대로 구한다고 하자.")


(def 답
  "다음과 같이 repl에서 실행했다."
  "user=> 10
  10
  user=> (+ 5 3 4)
  12
  user=> (- 9 1)
  8
  user=> (/ 6 2)
  3
  user=> (+ (* 2 4) (- 4 6))
  6
  user=> (def a 3)
  #'user/a
  user=> (def b (+ a 1))
  #'user/b
  user=> (+ a b (* a b))
  19
  user=> (= a b)
  false
  user=> (if (and (> b a) (< b (* a b)))
           #_=>   b
           #_=>   a)
  4
  user=> (cond
    #_=>   (= a 4) 6
    #_=>   (= b 4) (+ 6 7 a)
    #_=>   :else 25)
  16

  user=> (+ 2 (if (> b a) b a))
  6
  user=> (* (cond (> a b) a
    #_=>          (< a b) b
    #_=>          :else -1)
    #_=>    (+ a 1))
  16")
