package com.hemanth.cryptocurrency.domain.useCase.getCoins

import com.hemanth.cryptocurrency.common.Resource
import com.hemanth.cryptocurrency.domain.model.Coin
import com.hemanth.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
     operator fun invoke(): Flow<Resource<List<Coin>>> = repository.getCoins()
}