(ns sicp.amy.ex-1-5)

(def 문제
  "아래의 두 프로시저를 인자 먼저 계산할 때와 정의한 대로 계산할 때를 비교하라.")

(defn p []
  (p))

(defn test [x y]
  (if (= x 0)
      0
      y))

(defn 답
  "
  ; (test 0 (p))
  ; ### 인자 먼저 계산
  (defn test [0 (p)]
    (if (= 0 0)
        0
        (p)))
  ; p 인자를 evaluation할 필요없이 if (= 0 0)가 참이되어 결과는 0

  ; ### 정의대로 계산
  ; p 값을 evaluation하기위해 무한루프를 돌면서 에러(StackOverflowError)발생
  sicp.amy.ex-1-5=> (p)
  StackOverflowError   sicp.amy.ex-1-5/p (ex_1_5.clj:7)
  ")
