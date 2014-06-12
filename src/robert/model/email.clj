(ns robert.model.email
  (:require [postal.core :refer [send-message]]))

(def from-info
  {:host "smtp.gmail.com"
   :user "mweb.sim"
   :pass "marcello"
   :ssl :yes})

(defn send-email [{:keys [to subject body]}]
  (send-message from-info
                {:from "mweb.sim@gmail.com"
                 :to to
                 :subject subject
                 :body body}))

(defn conferma-email [to code]
  (let [subject "Welcome on Robert"
        body (str "Hi, \n welcome on Robert. \n
Please activae your accounto followinf this link: " code "\n Saluti")]
    (send-email {:to to
                 :subject subject
                 :body body})))


(defn conferma-cambio-email [to code]
  (let [subject "Cambio email WorkInvoice"
        body (str "Ciao, \n benvenuto su WorkInvoice. \n Per attivare il tuo account segui questo link: \n http://workinvoice.herokuapp.com/user/conferma/email/" code "/n Saluti")]
    (send-email {:to to
                 :subject subject
                 :body body})))


(defn conferma-cambio-password [to code]
  (let [subject "Cambio password WorkInvoice"
        body (str "Ciao, \n benvenuto su WorkInvoice. \n Per attivare il tuo account segui questo link: \n http://workinvoice.herokuapp.com/conferma/password/" code "\n Saluti")]
    (send-email {:to to
                 :subject subject
                 :body body})))