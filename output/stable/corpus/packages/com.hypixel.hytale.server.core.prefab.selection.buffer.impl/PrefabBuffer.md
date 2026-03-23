# PrefabBuffer

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.buffer.impl

public class PrefabBuffer

Compact binary representation of a prefab's block, fluid, entity, and child-prefab data. Stores block entries in a column-indexed `ByteBuf` using variable-width encoding for block IDs, offsets, fluid IDs, chance values, rotations, and fillers. The bitmask format is defined by the inner `BlockMaskConstants` interface.

Created via `PrefabBuffer.Builder`. Read access is through `PrefabBuffer.PrefabBufferAccessor`, which implements IPrefabBuffer.

The buffer must be explicitly released via `release()` when no longer needed.

## Constants

- float DEFAULT_CHANCE

## Fields

- Vector3i anchor
- Vector3i min
- Vector3i max
- Int2ObjectMap<PrefabBufferColumn> columns
- ChildPrefab[] childPrefabs
- ByteBuf buf

## Methods


@Nonnull
public static PrefabBuffer.Builder newBuilder()

Creates a new builder for constructing a `PrefabBuffer`.


@Nonnull
public PrefabBuffer.PrefabBufferAccessor newAccess()

Creates a new accessor (implements `IPrefabBuffer`) for reading this buffer. Throws `IllegalStateException` if already released.


public void release()

Releases the underlying `ByteBuf`. Throws `IllegalStateException` if already released.

## Inner Types

### BlockMaskConstants


public interface BlockMaskConstants

Defines the bitmask layout for block entries in the binary buffer. Each block entry starts with a 2-byte mask encoding which fields are present and their sizes.

- ID_IS_BYTE | 1 | Block ID fits in 1 byte.
- ID_IS_SHORT | 2 | Block ID fits in 2 bytes.
- ID_IS_INT | 3 | Block ID requires 4 bytes.
- ID_MASK | 3 | Mask for block ID size bits.
- HAS_CHANCE | 4 | Entry includes a 4-byte float chance.
- OFFSET_IS_BYTE | 8 | Y offset fits in 1 byte.
- OFFSET_IS_SHORT | 16 | Y offset fits in 2 bytes.
- OFFSET_IS_INT | 24 | Y offset requires 4 bytes.
- OFFSET_MASK | 24 | Mask for offset size bits.
- HAS_COMPONENTS | 32 | Entry has associated block components.
- FLUID_IS_BYTE | 64 | Fluid ID fits in 1 byte (+ 1 level byte).
- FLUID_IS_SHORT | 128 | Fluid ID fits in 2 bytes (+ 1 level byte).
- FLUID_IS_INT | 192 | Fluid ID requires 4 bytes (+ 1 level byte).
- FLUID_MASK | 192 | Mask for fluid size bits.
- SUPPORT_MASK | 3840 | Mask for support value (bits 8-11).
- SUPPORT_OFFSET | 8 | Bit offset of support value.
- HAS_FILLER | 4096 | Entry includes a 2-byte filler ID.
- HAS_ROTATION | 8192 | Entry includes a 1-byte rotation index.

### Builder


public static class Builder

Builder for constructing a `PrefabBuffer`. Columns are added via `addColumn`, child prefabs via `addChildPrefab`. Call `build()` to produce the immutable buffer.

Key methods:


public void setAnchor(@Nonnull Vector3i anchor)


public void addColumn(int x, int z, @Nonnull PrefabBufferBlockEntry[] entries, @Nullable Holder<EntityStore>[] entityHolders)


public void addChildPrefab(int x, int y, int z, @Nonnull String path, boolean fitHeightmap, boolean inheritSeed, boolean inheritHeightCondition, @Nullable PrefabWeights weights, @Nonnull PrefabRotation rotation)


@Nonnull
public PrefabBufferBlockEntry newBlockEntry(int y)


@Nonnull
public PrefabBuffer build()

### ChildPrefab


public static class ChildPrefab

Represents a child prefab spawner embedded in the buffer. Stores position (x, y, z), path to the prefab asset, and placement options.

Key methods:


public int getX()
public int getY()
public int getZ()
@Nonnull public String getPath()
public boolean isFitHeightmap()
public boolean isInheritSeed()
public boolean isInheritHeightCondition()
@Nonnull public PrefabWeights getWeights()
@Nonnull public PrefabRotation getRotation()

### PrefabBufferAccessor


public static class PrefabBufferAccessor implements IPrefabBuffer

Read-only accessor for a `PrefabBuffer` that implements the IPrefabBuffer interface. Created via `PrefabBuffer.newAccess()`. Each accessor holds a retained duplicate of the buffer, which must be released independently.

Supports rotation-aware bounds queries, column-based iteration, raw iteration, prefab comparison, and random-access block/filler/rotation lookups.
