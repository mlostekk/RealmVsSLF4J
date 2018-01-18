package com.nomad5.realmvsslf4j.test

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.slf4j.LoggerFactory

class MainActivity : AppCompatActivity() {

    private val logger = LoggerFactory.getLogger(this::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logger.info("INFO LOG")
    }
}
