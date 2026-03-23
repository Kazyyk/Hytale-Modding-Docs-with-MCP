# DisabledFluidResource

Type: class | Package: com.hypixel.hytale.builtin.fluid | Implements: Resource

public class DisabledFluidResource implements Resource

Chunk store resource that caches the set of disabled fluid IDs based on the world configuration's disabled fluid ticker tags. Lazily resolves fluid IDs from tag names and invalidates when the configuration changes.

Also in this package: EnsureFluidSection, FluidCommand, FluidPlugin, FluidState, FluidSystems, GetCommand, LoadPacketGenerator, MigrateFromColumn, PreprocesorAccessor, ReplicateChanges, SetCommand, SetRadiusCommand, SetupSection, Ticking

Complete API:
  public static ResourceType<ChunkStore,DisabledFluidResource> getResourceType()
  public IntSet getDisabledFluidIds(WorldConfig worldConfig)
  public void invalidate()
  public Resource<ChunkStore> clone()

Fields:
private Set<String> tags
private IntSet ids
