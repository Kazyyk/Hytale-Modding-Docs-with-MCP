# FarmingSystems.Ticking

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: EntityTickingSystem<ChunkStore>

public static class FarmingSystems.Ticking extends EntityTickingSystem<ChunkStore>

Main tick system for the farming module operating on `ChunkStore`. Iterates over ticking blocks in each section and dispatches to `FarmingUtil.tickFarming` for farming blocks, `tickSoil` for tilled soil, and `tickCoop` for coop blocks. Soil ticking handles decay timers, watering state, and block type transitions. Coop ticking handles wild NPC capture, resident spawning/despawning based on roam time, produce generation, and interaction state updates.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query tick(...)
- void` / `Query getQuery(...)
