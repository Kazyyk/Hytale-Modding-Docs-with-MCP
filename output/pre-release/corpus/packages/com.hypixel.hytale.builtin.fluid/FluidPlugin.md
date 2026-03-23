# FluidPlugin

Type: class | Package: com.hypixel.hytale.builtin.fluid | Extends: JavaPlugin

public class FluidPlugin extends JavaPlugin

Plugin that implements the fluid simulation system. Registers fluid tickers (`DefaultFluidTicker`, `FiniteFluidTicker`, `FireFluidTicker`), the disabled fluid resource, and chunk pre-load processing for fluid propagation.

Also in this package: DisabledFluidResource, EnsureFluidSection, FluidCommand, FluidState, FluidSystems, GetCommand, LoadPacketGenerator, MigrateFromColumn, PreprocesorAccessor, ReplicateChanges, SetCommand, SetRadiusCommand, SetupSection, Ticking

Complete API:
  public static FluidPlugin get()
  public ResourceType<ChunkStore,DisabledFluidResource> getDisabledFluidResourceType()
  static IntSet resolveFluidIds(Set<String> tags)
  protected void setup()
  private static void onFluidAssetsLoaded(LoadedAssetsEvent<String,Fluid,IndexedLookupTableAssetMap<String,Fluid>> event)
  private static void onChunkPreProcess(ChunkPreLoadProcessEvent event)

Fields:
private static final HytaleLogger LOGGER
private static FluidPlugin instance
private ResourceType<ChunkStore,DisabledFluidResource> disabledFluidResourceType
