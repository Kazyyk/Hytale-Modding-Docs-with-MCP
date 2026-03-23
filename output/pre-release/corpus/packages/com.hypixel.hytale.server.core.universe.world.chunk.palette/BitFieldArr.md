# BitFieldArr

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.palette

public class BitFieldArr

Compact bit-packed array storing fixed-width integer values. Supports arbitrary bit widths per element, backed by a byte array. Provides `get(index)`, `set(index, value)`, bulk `get()`/`set()` for the backing array, `copyFrom()`, and `toBitString()` for debugging.

## Constants

- BITS_PER_INDEX | int | 8
- INDEX_MASK | int | 255
