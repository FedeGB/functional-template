(ns exercise2)

(defn only-greater-than-five
    "Filters out int values that are less then 5 in a list"
    [l]
    (
        filter (fn [x] (< 5 x)) l
    )
)

