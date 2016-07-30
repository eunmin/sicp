(ns sicp.poet.ex-1-5)

(defn 문제
      "Ben Bitdiddle은 언어 실행기가 인자 먼저 계산법을 따르는지
 아니면 정의대로 계산법을 따르는지 알아보고 싶어서
 아래와 같이 두 프로시저를 정의하였다.")

 (defn p [] (p))
;;#'user/p
 (defn test [x y]
       (if (= x 0) 0 y))
;;#'user/test

(test 0 (p))
;;StackOverflowError   user/p (form-init8289596594316215790.clj:1)

 (if (= 0 0) 0 (p))
;;0