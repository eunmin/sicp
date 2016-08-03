(ns sicp.poet.ex-1-3)

(def 문제
  "세 숫자를 인자로 받아 그 가운데 큰 숫자 두개를 제곱한 다음, 그 두 값을 덧셈하여 내놓는 프로시저를 정의하라.")

(defn extractTwoNumbers [x y z]
             (cond (>= x y z) [x y]
                   (>= x z y) [x z]
                   (>= y x z) [y x]
                   (>= y z x) [y z]
                   (>= z x y) [z x]
                   (>= z y x) [z y]
                   :else "never"))
;;'user/extractTwoNumbers

 (extractTwoNumbers 3 6 2)
;;[6 3]

 (defn square [x] (* x x))
;;#'user/square

 (defn plusSquaredTwoNumbers [x y z]
             (let [[a b] (extractTwoNumbers x y z)]
                  (+ (square a) (square b))))
#'user/plusSquaredTwoNumbers

 (plusSquaredTwoNumbers 3 6 2)
;;45

 (plusSquaredTwoNumbers 1 10 2)
;;104

 (plusSquaredTwoNumbers 4 2 9)
;;97
