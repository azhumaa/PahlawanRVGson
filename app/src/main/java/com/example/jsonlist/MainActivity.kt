package com.example.jsonlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.jsonlist.databinding.ActivityMainBinding
import com.google.gson.Gson
import getJsonDataFromAsset
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding as ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val heroes = Gson().fromJson(
            getJsonDataFromAsset(applicationContext, "pahlawan_nasional.json").toString(),
            Hero::class.java
        ).daftarPahlawan as List<DaftarPahlawanItem>

        binding.rvHeroL.adapter = HeroAdapter(heroes)
    }
}

//val rootJson = getJsonDataFromAsset()?.let { JSONObject(it)}
//Log.i("JSON","getPahlawanFromJSON: $rootJSON")
//
//val pahlawanFromJSONArray =rootJSON?.getJSOnArray("daftar_pahlawn")
////*how to get json from assets
//
//}

//val json = getJsonDataFromAsset()
//
//val rootJSON = json?.let{JSONObject(it)}
//Log.i("JSON","getPahlawanFromJSON: $rootJSON")
//
//        //pangilan per value root json
//
//val negara = rootJSON?.get("negara")
//
////pangilan per value root json Array
//
//val arrayProvinsiFromJSON = rootJSON?.getJSONArray("provinsi")
//val arrayProvinsi = ArrayList<String>()
//
//
////short way
//
//for (i in 0..arrayProvinsiFromJSON!!.length()) {
//    val provinsi = arrayProvinsiFromJSON[i] as String
//    arrayProvinsi.add(provinsi)
//}
//manual way

