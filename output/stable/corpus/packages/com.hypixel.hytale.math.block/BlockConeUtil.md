# BlockConeUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockConeUtil

## Fields

- float radiusXAdjusted
- float radiusZAdjusted
- double rf
- double dx
- int maxX
- int minX
- double qx
- double dz
- int maxZ
- int minZ
- boolean cap
- double dxInvSqr
- double innerDx
- double innerDxInvSqr
- double innerMaxZ
- double innerMinZ

## Methods

- public static <T> void forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, @Nonnull TriIntObjPredicate<T> consumer)
- throw new IllegalArgumentException(String.valueOf(radiusX)
- throw new IllegalArgumentException(String.valueOf(height)
- throw new IllegalArgumentException(String.valueOf(radiusZ)
- public static <T> void forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, @Nonnull TriIntObjPredicate<T> consumer)
- public static <T> void forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean capped,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> void` | `forEachBlockInverted(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> void` | `forEachBlockInverted(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> void` | `forEachBlockInverted(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean capped,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
