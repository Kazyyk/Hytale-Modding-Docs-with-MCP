# FarmingSystems.OnSoilAdded

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: RefSystem<ChunkStore>

public static class FarmingSystems.OnSoilAdded extends RefSystem<ChunkStore>

Initializes newly added TilledSoilBlock components. If the soil is not planted and has no decay time set, computes a random decay duration from the soil config and schedules the tick.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query onEntityAdded(...)
- void` / `Query onEntityRemove(...)
- void` / `Query getQuery(...)
