# BlockSection

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section | Implements: Component<ChunkStore>

public class BlockSection implements Component<ChunkStore>

Chunk section component managing a 32x32x32 block region. Stores block, filler, and rotation palettes via `ISectionPalette` implementations, plus lighting data, ticking block bitsets, and tick request queues. Handles block migration, serialization/deserialization, and network packet caching with stamped locks for thread safety.

## Constants

- VERSION | int | 6

## Static Methods

- static ComponentType<ChunkStore, BlockSection> getComponentType()
