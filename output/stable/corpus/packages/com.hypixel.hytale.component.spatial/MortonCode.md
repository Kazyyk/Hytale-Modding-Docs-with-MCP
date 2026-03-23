# MortonCode

Type: class | Package: com.hypixel.hytale.component.spatial | Extends: java.lang.Object

public class MortonCode

Utility class for computing 3D Morton codes (Z-order curve values). Encodes three double-precision coordinates into a single 63-bit interleaved integer for spatial locality-preserving sorting. Used by `SpatialData.sortMorton()` to order entities before k-d tree construction, improving cache performance.
