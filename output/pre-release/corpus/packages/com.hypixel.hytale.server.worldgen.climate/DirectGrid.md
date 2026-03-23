# DirectGrid

Type: class | Package: com.hypixel.hytale.server.worldgen.climate | Extends: java.lang.Object

public class DirectGrid

Fixed-resolution 2D grid that directly stores climate type indices at each cell. Used as the backing storage for `ClimateGraph` lookup tables. Provides array-based O(1) access by quantized coordinates.
