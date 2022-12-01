package com.aplicativo.cidadesustentavel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.aplicativo.cidadesustentavel.databinding.ActivityMapsBinding
import com.google.android.gms.maps.model.BitmapDescriptorFactory

/**
 * Maps Activity - GoogleMaps com pontos de reciclagem
 *
 * @constructor Activity do Maps com pontos de Reciclagem
 */
class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    var lixoEletronico = "Lixo eletrônico"
    var lixoReciclavel = "Lixo reciclável"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * @constructor Implementação dos pontos de coleta de reciclaveis no GoogleMaps na cidade de Curitiba - Paraná
     *
     * @author Mayara Nicochelli
     * */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a markers and move camera
        val curitibaLixoEletronicoReciclatron = LatLng(-25.468912144837706, -49.25178920548726)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoReciclatron).title("Reciclatron")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoReciclatron))

        val curitibaLixoEletronicoEcopontoCaiua = LatLng(-25.490999, -49.345461)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoEcopontoCaiua).title("Ecoponto Caiuá")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoEcopontoCaiua))

        val curitibaLixoEletronicoEcopontoErico = LatLng(-25.532051, -49.251393)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoEcopontoErico)
                .title("Ecoponto Érico Veríssimo").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoEcopontoErico))

        val curitibaLixoEletronicoEcopontoVila = LatLng(-25.530158, -49.340434)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoEcopontoVila)
                .title("Ecoponto Vila Verde").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoEcopontoVila))

        val curitibaLixoEletronicoEcopontoCic = LatLng(-25.512132, -49.331764)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoEcopontoCic).title("Ecoponto CIC")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoEcopontoCic))

        val curitibaLixoEletronicoEcopontoGuacui = LatLng(-25.550902, -49.254283)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoEcopontoGuacui).title("Ecoponto Guaçuí")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoEcopontoGuacui))

        val curitibaLixoEletronicoEcopontoOsternack = LatLng(-25.554760, -49.266586)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoEcopontoOsternack)
                .title("Ecoponto Osternack").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoEcopontoOsternack))

        val curitibaLixoEletronicoEcopontoNova = LatLng(-25.529537, -49.230382)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoEcopontoNova).title("Ecoponto Vila Nova")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoEcopontoNova))

        val curitibaLixoEletronicoOngEletro = LatLng(-25.558845, -49.252288)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoOngEletro).title("ONG E-LETRO")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoOngEletro))

        val curitibaLixoEletronicoReciclaLtda = LatLng(-25.506973, -49.216789)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoReciclaLtda)
                .title("Recicla Eletrônicos Ltda").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoReciclaLtda))

        val curitibaLixoEletronicoReciclato = LatLng(-25.433823, -49.371433)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoReciclato)
                .title("Reciclato Reciclagem e Projetos Especiais").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoReciclato))

        val curitibaLixoEletronicoReciclatech = LatLng(-25.372514, -49.191238)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoReciclatech)
                .title("Reciclatech Reciclagem de Eletrônicos").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoReciclatech))

        val curitibaLixoEletronicoRafan = LatLng(-25.428954, -49.267137)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoRafan).title("Rafan Reciclagem")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoRafan))

        val curitibaLixoEletronicoRibeiro = LatLng(-25.487540, -49.341859)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoRibeiro)
                .title("Reciclagem Ribeiro gestão ambiental").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoRibeiro))

        val curitibaLixoEletronicoAssociaCatadores = LatLng(-25.469719, -49.351791)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoAssociaCatadores)
                .title("Associação de Catadores de Materiais Reciclaveis Curitiba Mais Limpa")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoAssociaCatadores))

        val curitibaLixoEletronicoSucapet = LatLng(-25.466087, -49.202117)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoSucapet)
                .title("Sucapet centro de reciclagem").snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoSucapet))

        val curitibaLixoEletronicoParcs = LatLng(-25.502136, -49.225938)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEletronicoParcs).title("Parcs Resíduo Eletrônico")
                .snippet(lixoEletronico).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_eletronico)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEletronicoParcs))

        val curitibaLixoRecicla = LatLng(-25.465597, -49.263002)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoRecicla)
                .title("Eco Recicla Ambiental Associação de catadores").snippet(lixoReciclavel)
                .icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoRecicla))

        val curitibaLixoVidaNova = LatLng(-25.496057, -49.277677)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoVidaNova)
                .title("VIDA NOVA Associação de Catadores de Materiais Recicláveis")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoVidaNova))

        val curitibaLixoCooperativa = LatLng(-25.493781, -49.230619)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoCooperativa)
                .title("Cooperativa de Catadores de Materiais Recicláveis CATAMARE")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoCooperativa))

        val curitibaLixoMateriais = LatLng(-25.455440, -49.266137)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoMateriais)
                .title("Associação de Catadores de Materiais Recicláveis Futuro Ecológico")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoMateriais))

        val curitibaLixoDarci = LatLng(-25.400312, -49.181275)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoDarci).title("Darci Carlos Bueno & Cia")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoDarci))

        val curitibaLixoGraciosa = LatLng(-25.492659, -49.231905)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoGraciosa)
                .title("Associação de Catadores de Materiais Recicláveis Graciosa")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoGraciosa))

        val curitibaLixoCatadores = LatLng(-25.499334, -49.279836)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoCatadores)
                .title("Associação de Catadores de Materiais Recicláveis Vida Nova")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoCatadores))

        val curitibaLixoEcopar = LatLng(-25.465564, -49.263098)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoEcopar)
                .title("Associação de catadores de materiais ecopar").snippet(lixoReciclavel)
                .icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoEcopar))

        val curitibaLixoParque = LatLng(-25.499441, -49.178553)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoParque).title("Reciclagem Parque Da Fonte")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoParque))

        val curitibaLixoAguaNascente = LatLng(-25.515789, -49.225358)
        mMap.addMarker(
            MarkerOptions().position(curitibaLixoAguaNascente)
                .title("Associação de Catadores de Materiais Recicláveis Água Nascente")
                .snippet(lixoReciclavel).icon(
                    BitmapDescriptorFactory.fromResource(R.drawable.lixo_reciclavel)
                )
        );
        mMap.moveCamera(CameraUpdateFactory.newLatLng(curitibaLixoAguaNascente))
    }
}