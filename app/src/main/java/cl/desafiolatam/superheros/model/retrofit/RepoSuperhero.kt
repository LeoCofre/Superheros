package cl.desafiolatam.superheros.model.retrofit

import android.content.Context
import cl.desafiolatam.superheros.model.dataBase.DBSuperheros

class RepoSuperhero(context: Context) {
    private val db : DBSuperheros= DBSuperheros.getDBSuperhero(context)
}