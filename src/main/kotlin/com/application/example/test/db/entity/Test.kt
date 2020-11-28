package com.application.example.test.db.entity

import javax.persistence.*

@Entity
@Table(name = "TBL_TEST")
data class Test(

        @Id
        @GeneratedValue
        @Column(name = "CD_TEST")
        val cdTest: Int? = null,

        @Column(name = "DS_TEST")
        val dsTest: String,

)