package br.com.dio.app.repositories.data.repositories

import br.com.dio.app.repositories.data.model.Repo

interface RepoRepositopries {
    suspend fun ListRepositories(user: String): List<Repo>
}