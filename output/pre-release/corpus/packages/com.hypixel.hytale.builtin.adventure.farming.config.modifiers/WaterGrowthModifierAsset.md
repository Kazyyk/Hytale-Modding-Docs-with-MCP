# WaterGrowthModifierAsset

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.config.modifiers

public class WaterGrowthModifierAsset

Growth modifier asset that adjusts crop growth rate based on proximity to water.

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
