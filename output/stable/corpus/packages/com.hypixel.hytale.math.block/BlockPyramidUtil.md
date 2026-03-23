# BlockPyramidUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockPyramidUtil

## Fields

- double rf
- double dx
- int maxX
- int minX
- double dz
- int maxZ
- int minZ
- double df
- boolean cap
- double innerRf
- double innerDx
- double innerDz
- int innerMinX
- int innerMaxX
- int innerMinZ
- int innerMaxZ

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

Also in this package: BlockConeUtil, BlockCubeUtil, BlockCylinderUtil, BlockDiamondUtil, BlockDomeUtil, BlockInvertedDomeUtil, BlockSphereUtil, BlockTorusUtil, BlockUtil

Complete API:
  public static void forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, TriIntObjPredicate<T> consumer)
  public static void forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, TriIntObjPredicate<T> consumer)
  public static void forEachBlock(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, boolean capped, T t, TriIntObjPredicate<T> consumer)
  public static void forEachBlockInverted(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, T t, TriIntObjPredicate<T> consumer)
  public static void forEachBlockInverted(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, T t, TriIntObjPredicate<T> consumer)
  public static void forEachBlockInverted(int originX, int originY, int originZ, int radiusX, int height, int radiusZ, int thickness, boolean capped, T t, TriIntObjPredicate<T> consumer)
