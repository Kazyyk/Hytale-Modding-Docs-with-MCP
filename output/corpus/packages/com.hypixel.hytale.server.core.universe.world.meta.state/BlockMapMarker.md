# BlockMapMarker

Type: class | Package: com.hypixel.hytale.server.core.universe.world.meta.state | Extends: java.lang.Object | Implements: Component<ChunkStore>

public class BlockMapMarker implements Component<ChunkStore>

ECS component attached to chunk-store entities that manages block-based map markers. Tracks marker positions within a chunk and synchronizes them with the `WorldMapManager`. Implements the `RefSystem` callbacks for marker lifecycle (add, remove, tick).
