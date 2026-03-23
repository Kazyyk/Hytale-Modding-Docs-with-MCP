# BlockCubeUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockCubeUtil

## Fields

- int radiusY
- int innerMinX
- int innerMaxX
- int innerMinZ
- int innerMaxZ
- int innerMinY
- int innerMaxY
- Vector3i min
- Vector3i max

## Methods

- public static <T> boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, @Nonnull TriIntObjPredicate<T> consumer)
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
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, height, radiusZ, thickness, capped, capped, false, t, consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(int originX,
        int originY,
        int originZ,
        int radiusX,
        int height,
        int radiusZ,
        int thickness,
        boolean cappedTop,
        boolean cappedBottom,
        boolean hollow,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, radiusX, height, radiusZ, t, consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(@Nonnull Vector3i pointOne, @Nonnull Vector3i pointTwo, T t, @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `public static <T> boolean` | `forEachBlock(@Nonnull Vector3i pointOne,
        @Nonnull Vector3i pointTwo,
        int thickness,
        boolean cappedTop,
        boolean cappedBottom,
        boolean hollow,
        T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(pointOne, pointTwo, t, consumer)` |

Also in this package: BlockConeUtil, BlockCylinderUtil, BlockDiamondUtil, BlockDomeUtil, BlockInvertedDomeUtil, BlockPyramidUtil, BlockSphereUtil, BlockTorusUtil, BlockUtil

Complete API:
  public static boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, TriIntObjPredicate<T> consumer)
  public static boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, TriIntObjPredicate<T> consumer)
  public static boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, boolean capped, T t, TriIntObjPredicate<T> consumer)
  public static boolean forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, boolean cappedTop, boolean cappedBottom, boolean hollow, T t, TriIntObjPredicate<T> consumer)
  public static boolean forEachBlock(Vector3i pointOne, Vector3i pointTwo, T t, TriIntObjPredicate<T> consumer)
  public static boolean forEachBlock(Vector3i pointOne, Vector3i pointTwo, int thickness, boolean cappedTop, boolean cappedBottom, boolean hollow, T t, TriIntObjPredicate<T> consumer)
