# SpawnMarkerBlock

Type: class | Package: com.hypixel.hytale.server.spawning.blockstates | Implements: com.hypixel.hytale.component.Component

public class SpawnMarkerBlock implements Component<ChunkStore>

Chunk-store component that associates a block with a spawn marker entity. Holds a `PersistentRef` to the spawn marker and a configurable lost-marker timeout (default 30 seconds). Implements `Component<ChunkStore>` and is cloneable.
