# EmptySectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public class EmptySectionPalette implements ISectionPalette

Singleton palette for completely empty chunk sections (all blocks are ID 0). Returns `REQUIRES_PROMOTE` for any non-zero set operation. Promotes to `HalfByteSectionPalette` when a block is placed.

## Constants

- EMPTY_ID | int | 0
