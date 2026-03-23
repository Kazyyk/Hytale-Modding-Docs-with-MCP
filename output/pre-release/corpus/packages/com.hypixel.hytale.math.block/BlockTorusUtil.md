# BlockTorusUtil

Type: class | Package: com.hypixel.hytale.math.block | Extends: null

public class BlockTorusUtil

## Fields

- int majorRadius
- int sizeXZ
- float minorRadiusAdjusted
- double distFromCenter
- double distFromRing
- double distFromTube
- float innerMinorRadius
- boolean inOuter
- boolean inInner

## Methods

- public static <T> boolean forEachBlock(int originX, int originY, int originZ, int outerRadius, int minorRadius, @Nullable T t, @Nonnull TriIntObjPredicate<T> consumer)
- throw new IllegalArgumentException(String.valueOf(outerRadius)
- throw new IllegalArgumentException(String.valueOf(minorRadius)
- public static <T> boolean forEachBlock(int originX,
        int originY,
        int originZ,
        int outerRadius,
        int minorRadius,
        int thickness,
        boolean capped,
        @Nullable T t,
        @Nonnull TriIntObjPredicate<T> consumer)` |
| `` | `return` | `forEachBlock(originX, originY, originZ, outerRadius, minorRadius, t, consumer)` |

Also in this package: BlockConeUtil, BlockCubeUtil, BlockCylinderUtil, BlockDiamondUtil, BlockDomeUtil, BlockInvertedDomeUtil, BlockPyramidUtil, BlockSphereUtil, BlockUtil

Complete API:
  public static boolean forEachBlock(int originX, int originY, int originZ, int outerRadius, int minorRadius, T t, TriIntObjPredicate<T> consumer)
  public static boolean forEachBlock(int originX, int originY, int originZ, int outerRadius, int minorRadius, int thickness, boolean capped, T t, TriIntObjPredicate<T> consumer)
