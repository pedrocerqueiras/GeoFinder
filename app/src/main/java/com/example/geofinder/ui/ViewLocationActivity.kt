package com.example.geofinder.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.geofinder.R
import android.widget.Button
import android.widget.ImageView
import com.squareup.picasso.Picasso

class ViewLocationActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView
    private lateinit var downloadButton: Button
    private lateinit var aboutLocationButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_location)

        imageView = findViewById(R.id.iv_map)
        downloadButton = findViewById(R.id.button_downloadmap)
        aboutLocationButton = findViewById(R.id.button_aboutlocation)

        // Aqui você deve obter a URL da imagem da resposta da API
        val imageUrl = "data:image/png;base64,eyJtZXNzYWdlIjoiWm9vbSBsZXZlbCBtdXN0IGJlIGJldHdlZW4gMC0yMi4ifQ=="

        // Use o Picasso para carregar e exibir a imagem na ImageView
        Picasso.get().load(imageUrl).into(imageView)

        // Defina os cliques dos botões (download e informações) conforme necessário
        downloadButton.setOnClickListener {
            // Lógica para o download
        }

        aboutLocationButton.setOnClickListener {
            // Lógica para informações sobre a localização
        }
    }
}