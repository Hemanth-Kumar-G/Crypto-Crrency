package com.hemanth.cryptocurrency.domain.repository

import com.hemanth.cryptocurrency.common.Resource
import com.hemanth.cryptocurrency.domain.model.Coin
import com.hemanth.cryptocurrency.domain.model.CoinDetail
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    fun getCoins(): Flow<Resource<List<Coin>>>

    fun getCoinById(coinId: String): Flow<Resource<CoinDetail>>
}