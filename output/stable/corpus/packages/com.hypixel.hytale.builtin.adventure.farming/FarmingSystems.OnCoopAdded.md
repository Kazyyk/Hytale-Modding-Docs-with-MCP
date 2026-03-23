# FarmingSystems.OnCoopAdded

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: RefSystem<ChunkStore>

public static class FarmingSystems.OnCoopAdded extends RefSystem<ChunkStore>

Listens for CoopBlock entity additions on `ChunkStore`. On add, schedules the next coop tick. On removal (unless unloading), calls `handleBlockBroken` to spawn residents and drop produce.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query onEntityAdded(...)
- void` / `Query onEntityRemove(...)
- void` / `Query getQuery(...)
