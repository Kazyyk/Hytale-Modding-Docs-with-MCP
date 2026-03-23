# IChunkAccessorSync

Type: interface | Package: com.hypixel.hytale.server.core.universe.world.accessor

@Deprecated
public interface IChunkAccessorSync<WorldChunk extends BlockAccessor>

Deprecated interface for synchronous chunk access across multiple chunks. Provides methods to get chunks by index in various states (in-memory, loaded, non-ticking), and delegates block operations to the appropriate chunk's `BlockAccessor`. Includes `getBaseBlock()` for resolving filler block origins and `TestBlockFunction` for placement testing.

## Inner Types

- `IChunkAccessorSync.TestBlockFunction` -- functional interface for block placement testing
