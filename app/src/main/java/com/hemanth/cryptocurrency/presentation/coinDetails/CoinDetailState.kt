package com.hemanth.cryptocurrency.presentation.coinDetails

import com.hemanth.cryptocurrency.domain.model.CoinDetail


data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
