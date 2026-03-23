# IPrefabBuffer

Type: interface | Package: com.hypixel.hytale.server.core.prefab.selection.buffer.impl

public interface IPrefabBuffer

Interface for reading prefab block data from a buffer. Provides bounds queries (min/max X, Y, Z with rotation support), column iteration, and block/fluid/entity traversal using typed consumer and predicate callbacks.

The buffer stores blocks in a column-based format. Each column contains a sequence of block entries at Y positions. Blocks may have associated chance values, filler IDs, rotation indices, fluid data, and component holders.

## Constants

- ColumnPredicate<?> ALL_COLUMNS

## Abstract Methods


int getAnchorX()
int getAnchorY()
int getAnchorZ()

Returns the anchor position of the prefab buffer.


int getMinX(@Nonnull PrefabRotation var1)
int getMinY()
int getMinZ(@Nonnull PrefabRotation var1)
int getMaxX(@Nonnull PrefabRotation var1)
int getMaxY()
int getMaxZ(@Nonnull PrefabRotation var1)

Returns the axis-aligned bounding box for the given rotation. Y bounds are rotation-independent.


int getMinYAt(@Nonnull PrefabRotation var1, int var2, int var3)
int getMaxYAt(@Nonnull PrefabRotation var1, int var2, int var3)

Returns the minimum or maximum Y at a specific (x, z) column for the given rotation. Returns -1 if the column is empty.


int getColumnCount()

Returns the number of columns in the buffer.


@Nonnull
PrefabBuffer.ChildPrefab[] getChildPrefabs()

Returns the child prefab spawner entries.


<T extends PrefabBufferCall> void forEach(@Nonnull ColumnPredicate<T> var1, @Nonnull BlockConsumer<T> var2, @Nullable EntityConsumer<T> var3, @Nullable ChildConsumer<T> var4, @Nonnull T var5)

Iterates over all blocks, entities, and child prefabs, applying rotation from the `PrefabBufferCall` context.


<T> void forEachRaw(@Nonnull ColumnPredicate<T> var1, @Nonnull RawBlockConsumer<T> var2, @Nonnull FluidConsumer<T> var3, @Nullable EntityConsumer<T> var4, @Nullable T var5)

Iterates raw block and fluid data without rotation transformation.


<T> boolean forEachRaw(@Nonnull ColumnPredicate<T> var1, @Nonnull RawBlockPredicate<T> var2, @Nonnull FluidPredicate<T> var3, @Nullable EntityPredicate<T> var4, @Nullable T var5)

Iterates raw data with early termination. Returns `false` if any predicate fails.


void release()

Releases the underlying buffer resources.


int getBlockId(int var1, int var2, int var3)
int getFiller(int var1, int var2, int var3)
int getRotationIndex(int var1, int var2, int var3)

Random-access lookups for block ID, filler, and rotation at a specific (x, y, z) position.

## Default Methods


default int getMinX()
default int getMinZ()
default int getMaxX()
default int getMaxZ()

Convenience overloads using `PrefabRotation.ROTATION_0`.


default int getMaximumExtend()

Returns the maximum extent (width or depth) across all rotations.


default <T extends PrefabBufferCall> boolean compare(@Nonnull BlockComparingPredicate<T> blockComparingPredicate, @Nonnull T t)

Compares all blocks in this buffer using the given predicate.


@Nonnull
static <T> ColumnPredicate<T> iterateAllColumns()

Returns the `ALL_COLUMNS` predicate cast to the required type.

## Inner Functional Interfaces

- BlockComparingPredicate<T> | boolean test(int, int, int, int, int, Holder<ChunkStore>, T) | Predicate for block comparison (x, y, z, blockId, rotation, holder, context).
- BlockComparingPrefabPredicate<T> | boolean test(int, int, int, int, Holder<ChunkStore>, float, int, int, int, Holder<ChunkStore>, float, int, int, T) | Predicate for comparing blocks between two prefabs.
- BlockConsumer<T> | void accept(int, int, int, int, Holder<ChunkStore>, int, int, int, T, int, int) | Consumer for block data (x, y, z, blockId, holder, support, rotation, filler, context, fluidId, fluidLevel).
- ChildConsumer<T> | void accept(int, int, int, String, boolean, boolean, boolean, PrefabWeights, PrefabRotation, T) | Consumer for child prefab entries.
- ColumnPredicate<T> | boolean test(int, int, int, T) | Predicate for column iteration (x, z, blockCount, context).
- EntityConsumer<T> | void accept(int, int, Holder<EntityStore>[], T) | Consumer for entity data at a column (x, z, entityHolders, context).
- EntityPredicate<T> | boolean test(int, int, Holder<EntityStore>[], T) | Predicate for entity data.
- FluidConsumer<T> | void accept(int, int, int, int, byte, T) | Consumer for fluid data (x, y, z, fluidId, fluidLevel, context).
- FluidPredicate<T> | boolean test(int, int, int, int, byte, T) | Predicate for fluid data.
- RawBlockConsumer<T> | void accept(int, int, int, int, int, float, Holder<ChunkStore>, int, int, int, T) | Consumer for raw block data (x, y, z, mask, blockId, chance, holder, support, rotation, filler, context).
- RawBlockPredicate<T> | boolean test(int, int, int, int, float, Holder<ChunkStore>, int, int, int, T) | Predicate for raw block data.
