# WaterGrowthModifierAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.modifiers | Extends: GrowthModifierAsset

public class WaterGrowthModifierAsset extends GrowthModifierAsset

Applies a growth speed multiplier when the crop has access to water. Water can come from adjacent fluid blocks (checked via `FluidSection`), active rain weather (checked via `WeatherResource` with line-of-sight to sky), or manual watering (via `TilledSoilBlock.wateredUntil` set by UseWateringCanInteraction). Also updates the soil's `externalWater` flag and schedules soil ticks when water state changes.

## Key Methods

- public double getCurrentGrowthMultiplier(@Nonnull CommandBuffer<ChunkStore> commandBuffer, @Nonnull Ref<ChunkStore> sectionRef, @Nonnull Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)

Also in this package: ArtificialLight, FertilizerGrowthModifierAsset, LightLevelGrowthModifierAsset

Complete API:
  public String[] getFluids()
  public IntOpenHashSet getFluidIds()
  public String[] getWeathers()
  public IntOpenHashSet getWeatherIds()
  public int getRainDuration()
  public double getCurrentGrowthMultiplier(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, Ref<ChunkStore> blockRef, int x, int y, int z, boolean initialTick)
  private static TilledSoilBlock getSoil(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, int x, int y, int z)
  protected boolean checkIfWaterSource(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, int x, int y, int z)
  private static int[] getNeighbourFluids(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, int x, int y, int z)
  private static int getFluidAtPos(int posX, int posY, int posZ, Ref<ChunkStore> sectionRef, ChunkSection currentChunkSection, CommandBuffer<ChunkStore> commandBuffer)
  protected boolean checkIfRaining(CommandBuffer<ChunkStore> commandBuffer, Ref<ChunkStore> sectionRef, int x, int y, int z)
  private static boolean isSoilWaterExpiring(WorldTimeResource worldTimeResource, TilledSoilBlock soilBlock)
  public String toString()

Fields:
public static final BuilderCodec<WaterGrowthModifierAsset> CODEC
protected String[] fluids
protected IntOpenHashSet fluidIds
protected String[] weathers
protected IntOpenHashSet weatherIds
protected int rainDuration
