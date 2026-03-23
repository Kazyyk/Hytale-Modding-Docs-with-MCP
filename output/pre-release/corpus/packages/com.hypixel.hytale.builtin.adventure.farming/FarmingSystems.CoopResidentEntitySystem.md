# FarmingSystems.CoopResidentEntitySystem

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming | Extends: RefSystem<EntityStore>

public static class FarmingSystems.CoopResidentEntitySystem extends RefSystem<EntityStore>

Handles coop resident entity lifecycle on `EntityStore`. On entity removal (unless unloading), locates the associated CoopBlock in the chunk store and calls `handleResidentDespawn` to remove the resident record.

Declared as a static inner class of FarmingSystems. Registered by FarmingPlugin during setup.

## Key Methods

- void` / `Query onEntityAdded(...)
- void` / `Query onEntityRemove(...)
- void` / `Query getQuery(...)
