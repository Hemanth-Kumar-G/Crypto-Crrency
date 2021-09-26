package com.hemanth.cryptocurrency.domain.useCase.getCoin

import com.hemanth.cryptocurrency.common.Resource
import com.hemanth.cryptocurrency.domain.model.CoinDetail
import com.hemanth.cryptocurrency.domain.repository.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCoinUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> =
        repository.getCoinById(coinId = coinId)

}