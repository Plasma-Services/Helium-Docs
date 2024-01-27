package dev.rage.helium;

import dev.rage.helium.profile.Profile;
import dev.rage.helium.rank.Rank;

import java.util.UUID;

public class HeliumAPI {

    public Rank getRankById(final UUID id) {
        throw new IllegalArgumentException("Rank instance is null!");
    }

    public Rank getRankByName(final String name) {
        throw new IllegalArgumentException("Rank instance is null!");
    }

    public Profile getProfileByUUID(final UUID id) {
        throw new IllegalArgumentException("Profile instance is null!");
    }

    public Profile getProfileByName(final String name) {
        throw new IllegalArgumentException("Profile instance is null!");
    }
}
