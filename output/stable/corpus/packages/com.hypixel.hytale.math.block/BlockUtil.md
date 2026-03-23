# BlockUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockUtil

## Fields

- public static final float RADIUS_ADJUST
- public static final long BITS_Y
- public static final long MAX_Y
- public static final long MIN_Y
- public static final long Y_INVERT
- public static final long Y_MASK
- public static final long BITS_PER_DIRECTION
- public static final long MAX
- public static final long MIN
- public static final long DIRECTION_INVERT
- public static final long DIRECTION_MASK
- long l
- int i

## Methods

- public static long pack(@Nonnull Vector3i val)
- return pack(val.x, val.y, val.z)
- public static long pack(int x, int y, int z)
- throw new IllegalArgumentException(String.valueOf(y)
- throw new IllegalArgumentException(String.valueOf(x)
- throw new IllegalArgumentException(String.valueOf(z)
- public static long packUnchecked(int x, int y, int z)
- public static int unpackX(long packed)
- public static int unpackY(long packed)
- public static int unpackZ(long packed)
- public static Vector3i unpack(long packed)
- return new Vector3i(unpackX(packed)
