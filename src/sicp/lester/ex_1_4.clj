(ns sicp.lester.ex-1-4)

(def 문제
  "엮은식의 연산자 자리에 복잡한 식이 다시 와도 앞에서 밝힌 규칙에 따라 식의 값을 구할 수 있다.
  다음 프로시저에 인자를 주고 어떻게 계산되는지 밝혀 보라.")

(defn a-plus-abs-b [a b]
  ((if (> b 0) + -) a b))
;; 무엇을 밝혀야 하나?

(a-plus-abs-b 1 1)
;; 2

(a-plus-abs-b 1 -1)
;; 2