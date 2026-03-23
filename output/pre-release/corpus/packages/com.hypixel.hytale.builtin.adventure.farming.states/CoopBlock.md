# CoopBlock

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.states | Implements: Component<ChunkStore>

public class CoopBlock implements Component<ChunkStore>

ChunkStore component tracking coop (animal pen) block state including residents and produce timers.

Also in this package: CoopResident, FarmingBlock, FarmingBlockState, RefreshFlags, TilledSoilBlock

Complete API:
  public static ComponentType<ChunkStore,CoopBlock> getComponentType()
  public FarmingCoopAsset getCoopAsset()
  public boolean tryPutResident(CapturedNPCMetadata metadata, WorldTimeResource worldTimeResource)
  public boolean tryPutWildResidentFromWild(Store<EntityStore> store, Ref<EntityStore> entityRef, WorldTimeResource worldTimeResource, Vector3i coopLocation)
  public boolean getCoopAcceptsNPC(String npcNameKey)
  public void generateProduceToInventory(WorldTimeResource worldTimeResource)
  public void gatherProduceFromContainer(ItemContainer playerInventory)
  public void ensureSpawnResidentsInWorld(World world, Store<EntityStore> store, Vector3d coopLocation, Vector3d spawnOffset)
  public void ensureNoResidentsInWorld(Store<EntityStore> store)
  public boolean shouldResidentsBeInCoop(WorldTimeResource worldTimeResource)
  public Instant getNextScheduledTick(WorldTimeResource worldTimeResource)
  public void handleResidentDespawn(UUID entityUuid)
  public void handleBlockBroken(World world, WorldTimeResource worldTimeResource, Store<EntityStore> store, int blockX, int blockY, int blockZ)
  public boolean hasProduce()
  public Component<ChunkStore> clone()

Fields:
public static final String STATE_PRODUCE
public static final BuilderCodec<CoopBlock> CODEC
protected String coopAssetId
protected List<CoopBlock.CoopResident> residents
protected ItemContainer itemContainer
