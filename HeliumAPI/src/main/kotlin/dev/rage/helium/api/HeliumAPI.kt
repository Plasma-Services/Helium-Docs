package dev.rage.helium.api

import java.util.UUID

enum class HeliumAPI {
    INSTANCE;

    fun isServerOnline(server: String): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getServerState(server: String): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getOnlinePlayers(server: String): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getMaxPlayers(server: String): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getRankName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getRankDisplayName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getRankPrefix(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getRankSuffix(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getRankPriority(uuid: UUID): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getRankColor(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getTagName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getTagDisplayName(uuid: UUID): String {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getCoins(uuid: UUID): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun isAdminChat(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun isStaffChat(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun isMuted(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun isBanned(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun isBlacklisted(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun isJailed(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getJailPoints(uuid: UUID): Int {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun isDisguised(uuid: UUID): Boolean {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }

    fun getNotes(uuid: UUID): List<String> {
        throw RuntimeException("HeliumAPI is not a plugin!")
    }
}