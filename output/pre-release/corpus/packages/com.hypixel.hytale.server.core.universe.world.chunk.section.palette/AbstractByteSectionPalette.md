# AbstractByteSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public abstract class AbstractByteSectionPalette implements ISectionPalette

Abstract base for byte-backed section palettes (up to 256 unique block types). Maintains bidirectional external-to-internal ID mappings, per-ID counts, and a byte array for block storage. Handles promotion when the palette runs out of internal IDs, and supports packet serialization, disk serialization, and find operations.
