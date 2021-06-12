(ns basic-microservice-example.logic.boleto
  (:require [basic-microservice-example.schema.boleto :as schema.boleto]
            [schema.core :as s])
  (:import (java.time LocalDate)
           (java.util UUID)))

(s/defn novo-boleto :- schema.boleto/schema
  "Cria boleto"
  [valor :- BigDecimal
   data-vencto :- LocalDate]
  (let [boleto (schema.boleto/->Boleto (UUID/randomUUID) valor data-vencto nil)]
    (schema.boleto/check! boleto)))
