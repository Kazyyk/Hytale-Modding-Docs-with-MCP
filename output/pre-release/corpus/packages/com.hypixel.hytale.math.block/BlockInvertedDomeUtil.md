# BlockInvertedDomeUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockInvertedDomeUtil

## Fields

- float radiusXAdjusted
- float radiusYAdjusted
- float radiusZAdjusted
- float invRadiusXSqr
- float invRadiusYSqr
- float qx
- double dy
- int maxY
- double dz
- int maxZ
- float innerRadiusXAdjusted
- float innerRadiusYAdjusted
- float innerRadiusZAdjusted
- float invRadiusX2
- float invRadiusY2
- float invRadiusZ2
- float invInnerRadiusX2
- float invInnerRadiusY2
- float invInnerRadiusZ2
- int y
- float qy
- double dx
- int maxX
- float innerQy
- float outerQy
- boolean isAtTop
- int x
- float innerQx
- float outerQx
- int z
- float innerQz
- float outerQz
- break label60

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

Also in this package: BlockConeUtil, BlockCubeUtil, BlockCylinderUtil, BlockDiamondUtil, BlockDomeUtil, BlockPyramidUtil, BlockSphereUtil, BlockTorusUtil, BlockUtil

Complete API:
  public static boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int radiusY, int radiusZ, T t, TriIntObjPredicate<T> consumer)
  public static boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int radiusY, int radiusZ, int thickness, boolean capped, T t, TriIntObjPredicate<T> consumer)
  private static boolean test(int originX, int originY, int originZ, int x, int y, int z, T context, TriIntObjPredicate<T> consumer)
