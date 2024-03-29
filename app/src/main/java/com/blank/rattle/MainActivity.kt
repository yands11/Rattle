package com.blank.rattle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearSnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val rattleAdapter by lazy { RattleAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        rv_normal.apply {
            adapter = rattleAdapter
        }
        rv_snap.apply {
            adapter = rattleAdapter
            LinearSnapHelper().attachToRecyclerView(this)
        }
    }
}
