(ns basic-microservice-example.db.boleto
  (:require [basic-microservice-example.protocols.storage-client :as storage]))

(defn add-boleto! [boleto storage]
  (storage/put! storage #(assoc % (:id boleto) boleto)))

(defn remove-boleto! [boleto-id storage]
  (storage/put! storage #(dissoc % boleto-id)))

(defn all-boletos [storage]
  (storage/read-all storage))

(defn get-boleto [boleto-id storage]
  (get (storage/read-all storage) boleto-id))
