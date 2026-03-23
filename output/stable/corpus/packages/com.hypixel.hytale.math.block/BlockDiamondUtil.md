# BlockDiamondUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockDiamondUtil

## Fields

- float radiusXAdjusted
- float radiusZAdjusted
- float normalizedY
- float currentRadiusX
- float currentRadiusZ
- int maxX
- int maxZ
- float innerRadiusX
- float innerRadiusZ
- boolean inOuter
- boolean inInner

## Methods

- public static <T> boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int radiusY, int radiusZ, @Nullable T t, @Nonnull TriIntObjPredicate<T> consumer)
- throw new IllegalArgumentException(String.valueOf(radiusX)
- throw new IllegalArgumentException(String.valueOf(radiusY)
- throw new IllegalArgumentException(String.valueOf(radiusZ)
- public static <T> boolean forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int radiusY,
        int radiusZ,
        int thickness,
        boolean capped,
        @Nullable T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, radiusY, radiusZ, t, consumer)` |
| `` | `private static <T> boolean` | `test(int originX, int originY, int originZ, int x, int y, int z, T context, @Nonnull TriIntObjPredicate<T> consumer)` |
