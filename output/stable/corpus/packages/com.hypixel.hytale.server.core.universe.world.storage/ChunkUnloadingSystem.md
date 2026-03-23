# ChunkUnloadingSystem

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Extends: TickingSystem<ChunkStore> | Implements: RunWhenPausedSystem<ChunkStore>

public class ChunkUnloadingSystem extends TickingSystem<ChunkStore> implements RunWhenPausedSystem<ChunkStore>

Periodic system that unloads chunks no longer visible to any player. Uses RAM pressure detection (85% threshold) to increase poll rate. Respects keep-alive timers and keep-loaded regions.
