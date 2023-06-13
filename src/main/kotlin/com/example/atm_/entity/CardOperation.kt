package com.example.atm_.entity

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.time.Instant


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card_operation")
class CardOperation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    var id:Long? = null


    @Column(name = "card_inn", nullable = false)
    var cardInn:Long? = null

    @Column(name = "card_holder_name", nullable = false)
    var cardHolderName:String? = null

    @Column(name = "pin_code", nullable = false)
    var pinCode:Int? = null

    @Column(name = "exp_date", nullable = false)
    var expDate:String? = null

    @Column(name = "balance")
    var balance:Double? = null

    @Column(name = "date")
    var date:Instant? = null
}