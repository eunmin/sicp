(ns sicp.joony.ex-1-3)

(def 문제
  "세 숫자를 인자로 받아 그 가운데 큰 숫자 두 개를 제곱한 다음,
그 두 값을 덧셈하여 내놓는 프로시저를 정의하라")

(defn max-two [x y z]
  (cond (>= x y z) [x y]
        (>= x z y) [x z]
        (>= y x z) [y x]
        (>= y z x) [y z]
        (>= z x y) [z x]
        (>= z y x) [z y]
        :else "never"))

(defn square [x] (* x x))

(defn plus-max-two [x y z]
  (let [[f s] (max-two x y z)]
    (+ (square f) (square s))))

;;예
(plus-max-two 1 2 3)
