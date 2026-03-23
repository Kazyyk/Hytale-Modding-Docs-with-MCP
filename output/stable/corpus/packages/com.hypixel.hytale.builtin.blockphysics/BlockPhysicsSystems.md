# BlockPhysicsSystems

Type: class | Package: com.hypixel.hytale.builtin.blockphysics

public class BlockPhysicsSystems

Contains the ECS ticking system and cached accessor for block physics simulation, handling support distance checks and block updates.

## Constants

- int MAX_SUPPORT_RADIUS

## Key Methods

- public static BlockPhysicsSystems.CachedAccessor of(ComponentAccessor<ChunkStore> commandBuffer, BlockSection blockSection, BlockPhysics section, FluidSection fluidSection, int cx, int cy, int cz, int radius)
- public BlockPhysics getBlockPhysics(int cx, int cy, int cz)
- public FluidSection getFluidSection(int cx, int cy, int cz)
- public BlockSection getBlockSection(int cx, int cy, int cz)
- public void performBlockUpdate(int x, int y, int z, int maxSupportDistance)
- public void performBlockUpdate(int x, int y, int z)
- public Query<ChunkStore> getQuery()
- public Set<Dependency<ChunkStore>> getDependencies()
- public void tick(float dt, int index, @Nonnull ArchetypeChunk<ChunkStore> archetypeChunk, @Nonnull Store<ChunkStore> store, @Nonnull CommandBuffer<ChunkStore> commandBuffer)

Also in this package: BlockPhysicsPlugin, BlockPhysicsUtil, CachedAccessor, PrefabBufferValidator, Result, Ticking, ValidateBlockEvent, WorldValidationUtil

Fields:
private static final HytaleLogger LOGGER
public static final int MAX_SUPPORT_RADIUS
