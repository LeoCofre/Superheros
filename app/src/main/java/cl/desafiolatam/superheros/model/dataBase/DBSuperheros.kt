package cl.desafiolatam.superheros.model.dataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cl.desafiolatam.superheros.model.dataClass.Superhero

//la instancia unica, con if!=null para que solo se cree una vez la base de datos
@Database(entities = [Superhero::class],version = 1)
abstract class DBSuperheros : RoomDatabase() {
    abstract fun daoSuperhero():DaoSuperheros
    companion object{
        @Volatile
        private var INSTANCE: DBSuperheros?=null

        //este metodo te devuelve createdInstance si la base de datos ya se ha creado o; newInstance si es que no se ha creado.
        //newInstance se creara la primera vez que se inicie la aplicacion, todas las siguientes veces devolvera createdInstance
        fun getDBSuperhero(context : Context):DBSuperheros{
            val createdInstance = INSTANCE
            if(createdInstance!=null){
                return createdInstance
            }
            synchronized(this){
                val newInstance = Room.databaseBuilder(context.applicationContext,DBSuperheros::class.java,"superhero_db").build()
                INSTANCE=newInstance
                return newInstance
            }
        }
    }
}