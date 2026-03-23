# AbstractShortSectionPalette

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section.palette | Implements: ISectionPalette

public abstract class AbstractShortSectionPalette implements ISectionPalette

Abstract base for short-backed section palettes (up to 65536 unique block types). Analogous to `AbstractByteSectionPalette` but uses short arrays and short-keyed maps for internal ID mapping. Used when a chunk section exceeds 256 unique block types.
