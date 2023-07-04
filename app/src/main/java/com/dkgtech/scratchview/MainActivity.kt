package com.dkgtech.scratchview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.cooltechworks.views.ScratchImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val scratchImageView = ScratchImageView(this@MainActivity)
        scratchImageView.setRevealListener(object : ScratchImageView.IRevealListener {
            override fun onRevealed(iv: ScratchImageView?) {
                Toast.makeText(this@MainActivity, "Image Reveled", Toast.LENGTH_SHORT).show()
            }

            override fun onRevealPercentChangedListener(siv: ScratchImageView?, percent: Float) {
//                Toast.makeText(this@MainActivity, "$percent", Toast.LENGTH_SHORT).show()
            }
        })
    }
}