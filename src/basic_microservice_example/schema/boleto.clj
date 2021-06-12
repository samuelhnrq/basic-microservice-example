(ns basic-microservice-example.schema.boleto
  (:require [schema.core :as s]
            [schema.utils :as utils])
  (:import (java.time LocalDate)
           (java.util UUID)))

(s/defrecord Boleto
  [id :- UUID
   valor :- BigDecimal
   vencimento :- LocalDate
   dataPgto :- (s/maybe LocalDate)])

(def check! (s/validator Boleto))

(def schema (utils/class-schema Boleto))
