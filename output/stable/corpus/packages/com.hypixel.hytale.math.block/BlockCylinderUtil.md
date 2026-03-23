# BlockCylinderUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockCylinderUtil

## Fields

- float radiusXAdjusted
- float radiusZAdjusted
- double invRadiusXSqr
- double qx
- double dz
- int maxZ
- int minZ
- float innerRadiusXAdjusted
- float innerRadiusZAdjusted
- double invInnerRadiusXSqr
- int innerMinY
- int innerMaxY
- boolean cap
- double innerQx
- double innerDZ
- int z

## Methods

- public static <T> boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, @Nonnull TriIntObjPredicate<T> consumer)
- throw new IllegalArgumentException(String.valueOf(radiusX)
- throw new IllegalArgumentException(String.valueOf(height)
- throw new IllegalArgumentException(String.valueOf(radiusZ)
- public static <T> boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, @Nonnull TriIntObjPredicate<T> consumer)
- return forEachBlock(originX, originY, originZ, radiusX, height, radiusZ, thickness, false, t, consumer)
- public static <T> boolean forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean capped,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, height, radiusZ, t, consumer)` |
