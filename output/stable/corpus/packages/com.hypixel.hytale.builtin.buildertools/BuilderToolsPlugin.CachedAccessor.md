# BuilderToolsPlugin.CachedAccessor

Type: class | Package: com.hypixel.hytale.builtin.buildertools | Extends: AbstractCachedAccessor

public static class CachedAccessor extends AbstractCachedAccessor

A thread-local cached accessor for chunk section components, optimized for builder tool operations that need repeated access to fluid sections, block physics, and block sections within a chunk neighborhood. Extends `AbstractCachedAccessor` with 3 component slots.

## Thread-Local Access


@Nonnull
public static BuilderToolsPlugin.CachedAccessor of(ComponentAccessor<ChunkStore> accessor, int cx, int cy, int cz, int radius)

Returns the thread-local `CachedAccessor` instance, initialized with the given `ChunkStore` accessor and centered at chunk coordinates `(cx, cy, cz)` with the specified radius.

## Constructor


public CachedAccessor()

Initializes with 3 component slots (fluid, physics, blocks).

## Component Accessors

### getFluidSection


@Nullable
public FluidSection getFluidSection(int cx, int cy, int cz)

Returns the `FluidSection` at the given chunk section coordinates, or `null` if not cached.

### getBlockPhysics


@Nullable
public BlockPhysics getBlockPhysics(int cx, int cy, int cz)

Returns the `BlockPhysics` component at the given chunk section coordinates, or `null` if not cached.

### getBlockSection


@Nullable
public BlockSection getBlockSection(int cx, int cy, int cz)

Returns the `BlockSection` at the given chunk section coordinates, or `null` if not cached.

## Component Slot Constants

- FLUID_COMPONENT | 0 | FluidSection
- PHYSICS_COMPONENT | 1 | BlockPhysics
- BLOCKS_COMPONENT | 2 | BlockSection

## Related Types

- BuilderToolsPlugin -- enclosing class
- BuilderToolsPlugin.BuilderState -- uses this accessor for editing operations

Also in this package: Action, ActionEntry, BlockColorEntry, BlockColorIndex, BlocksSampleData, BuilderState, BuilderToolsConfig, BuilderToolsPacketHandler, BuilderToolsPlugin, BuilderToolsSystems, BuilderToolsUserData, BuilderToolsUserDataSystem, CopyCutSettings, EditOperation, EnsureBuilderTools, EntityChange, FluidChange, PrefabCopyException, PrefabPasteEventSystem, PrototypePlayerBuilderToolSettings (and 2 more)

Complete API:
  public static BuilderToolsPlugin.CachedAccessor of(ComponentAccessor<ChunkStore> accessor, int cx, int cy, int cz, int radius)
  public FluidSection getFluidSection(int cx, int cy, int cz)
  public BlockPhysics getBlockPhysics(int cx, int cy, int cz)
  public BlockSection getBlockSection(int cx, int cy, int cz)

Fields:
private static final ThreadLocal<BuilderToolsPlugin.CachedAccessor> THREAD_LOCAL
private static final int FLUID_COMPONENT
private static final int PHYSICS_COMPONENT
private static final int BLOCKS_COMPONENT
