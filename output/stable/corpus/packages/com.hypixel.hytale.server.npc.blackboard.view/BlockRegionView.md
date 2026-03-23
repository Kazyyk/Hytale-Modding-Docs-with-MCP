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
