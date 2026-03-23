# BlockRegionView

Type: class | Package: com.hypixel.hytale.server.npc.blackboard.view | Extends: IBlackboardView<ViewType>> | Implements: IBlackboardView<ViewType>

public abstract class BlockRegionView<ViewType extends IBlackboardView<ViewType>> implements IBlackboardView<ViewType>

Implementation of `IBlackboardView<ViewType>`.

## Fields

- BITS | int | Static final int field.
- SIZE | int | Static final int field.
- SIZE_MASK | int | Static final int field.
- BITS2 | int | Static final int field.

## Methods

- toRegionalBlackboardCoordinate(int pos) | int | static public method.
- toWorldCoordinate(int pos) | int | static public method.
- chunkToRegionalBlackboardCoordinate(int pos) | int | static public method.
- indexView(int x, int z) | long | static public method.
- indexSection(int y) | int | static public method.
- xOfViewIndex(long index) | int | static public method.
- zOfViewIndex(long index) | int | static public method.
- indexViewFromChunkCoordinates(int x, int z) | long | static public method.
- indexViewFromWorldPosition(@Nonnull Vector3d pos) | long | static public method.
- indexBlock(int x, int y, int z) | int | static public method.
- xFromIndex(int index) | int | static public method.
- yFromIndex(int index) | int | static public method.
- zFromIndex(int index) | int | static public method.

Known subclasses: BlockTypeView, ResourceView

Also in this package: BlockRegionViewManager, IBlackboardView, IBlackboardViewManager, PrioritisedProvider, PrioritisedProviderView, SingletonBlackboardViewManager

Complete API:
  public static int toRegionalBlackboardCoordinate(int pos)
  public static int toWorldCoordinate(int pos)
  public static int chunkToRegionalBlackboardCoordinate(int pos)
  public static long indexView(int x, int z)
  public static int indexSection(int y)
  public static int xOfViewIndex(long index)
  public static int zOfViewIndex(long index)
  public static long indexViewFromChunkCoordinates(int x, int z)
  public static long indexViewFromWorldPosition(Vector3d pos)
  public static int indexBlock(int x, int y, int z)
  public static int xFromIndex(int index)
  public static int yFromIndex(int index)
  public static int zFromIndex(int index)

Fields:
public static final int BITS
public static final int SIZE
public static final int SIZE_MASK
public static final int BITS2
