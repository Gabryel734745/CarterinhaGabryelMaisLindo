package com.GabryelEzequias.feature.login.domain.repository

import com.GabryelEzequias.feature.login.domain.model.UsuarioLogado

interface LoginRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}