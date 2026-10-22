package com.GabryelEzequias.feature.aluno.unidadescurriculares.domain.repository

import com.GabryelEzequias.feature.aluno.unidadescurriculares.domain.model.UnidadeCurricular

interface UnidadeCurricularRepository {
    suspend fun listar():Result<List<UnidadeCurricular>>
}