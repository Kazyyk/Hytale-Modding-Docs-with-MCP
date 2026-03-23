# FarmingSystems.OnFarmBlockAdded

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: RefSystem<ChunkStore>

public static class FarmingSystems.OnFarmBlockAdded extends RefSystem<ChunkStore>

Initializes newly added FarmingBlock components. Sets the starting stage set, determines the initial growth progress by matching the current block type against stage data, applies the first stage if no match is found, and triggers the initial farming tick.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query onEntityAdded(...)
- void` / `Query onEntityRemove(...)
- void` / `Query getQuery(...)
