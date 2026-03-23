# SpawnMarkerBlockStateSystems.TickHeartbeat

Type: class | Package: com.hypixel.hytale.server.spawning.blockstates | Extends: com.hypixel.hytale.component.system.tick.EntityTickingSystem

public static class TickHeartbeat extends EntityTickingSystem<ChunkStore>

Inner class of `SpawnMarkerBlockStateSystems`. Chunk-store ticking system that monitors spawn marker block states. Creates spawn marker entities when the reference is null, refreshes the lost-marker timeout when the marker entity exists, and recreates markers when they desync.
