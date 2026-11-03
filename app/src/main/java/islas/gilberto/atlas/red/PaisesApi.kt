package islas.gilberto.atlas.red

import islas.gilberto.atlas.modelos.Pais
import retrofit2.http.GET
import retrofit2.http.Query

interface PaisesApi {
    // GET https://countries.dev/countries?fields=...
    @GET("countries")
    suspend fun obtenerPaises(
        @Query("fields") campos: String
    ): List<Pais>
}