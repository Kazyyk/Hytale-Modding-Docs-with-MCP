# EmptyBlockAccessor

Type: class | Package: com.hypixel.hytale.server.core.universe.world.accessor | Implements: BlockAccessor

public class EmptyBlockAccessor implements BlockAccessor

Singleton `BlockAccessor` implementation that always returns empty/zero values and rejects all write operations. Used as a null-object pattern when no chunk data is available. `getX()`/`getZ()`/`getChunkAccessor()` throw `UnsupportedOperationException`.
