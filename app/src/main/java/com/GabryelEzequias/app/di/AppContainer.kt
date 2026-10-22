package com.GabryelEzequias.app.di

import com.GabryelEzequias.core.auth.SessionTokenStore
import com.GabryelEzequias.feature.aluno.unidadescurriculares.domain.repository.UnidadeCurricularRepository
import com.GabryelEzequias.feature.login.domain.repository.LoginRepository

interface AppContainer {
    val sessionTokenStore: SessionTokenStore
    val loginRepository: LoginRepository
    val unidadeCurricularRepository: UnidadeCurricularRepository
}
