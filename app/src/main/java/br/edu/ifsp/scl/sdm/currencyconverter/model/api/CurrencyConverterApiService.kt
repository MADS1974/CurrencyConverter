package br.edu.ifsp.scl.sdm.currencyconverter.model.api

import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.ConversionResult
import br.edu.ifsp.scl.sdm.currencyconverter.model.domain.CurrencyList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface CurrencyConverterApiService {

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: af7eecb96dmsh02c6c707b3e63ebp1483d4jsnb889f098b4e7"
    )
    @GET("list")
    fun getCurrencies(): Call<CurrencyList>

    @Headers(
        "x-rapidapi-host: currency-converter5.p.rapidapi.com",
        "x-rapidapi-key: af7eecb96dmsh02c6c707b3e63ebp1483d4jsnb889f098b4e7"
    )
    @GET("convert")
    fun convert(
        @Query("from")from: String,
        @Query ("to") to: String,
        @Query("amount") amount: String
    ): Call<ConversionResult>
}

//https://currency-converter5.p.rapidapi.com/currency/convert?from=AUD&to=CAD&amount=100