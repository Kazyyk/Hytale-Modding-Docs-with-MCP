# TilledSoilBlock

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.states | Implements: Component<ChunkStore>

public class TilledSoilBlock implements Component<ChunkStore>

ChunkStore component representing tilled soil with moisture level and decay timer.

Also in this package: CoopBlock, CoopResident, FarmingBlock, FarmingBlockState, RefreshFlags

Complete API:
  public static ComponentType<ChunkStore,TilledSoilBlock> getComponentType()
  public boolean isPlanted()
  public void setPlanted(boolean planted)
  public void setWateredUntil(Instant wateredUntil)
  public Instant getWateredUntil()
  public boolean isFertilized()
  public void setFertilized(boolean fertilized)
  public boolean hasExternalWater()
  public void setExternalWater(boolean externalWater)
  public Instant getDecayTime()
  public void setDecayTime(Instant decayTime)
  public String computeBlockType(Instant gameTime, BlockType type)
  public String toString()
  public Component<ChunkStore> clone()

Fields:
public static int VERSION
public static final BuilderCodec<TilledSoilBlock> CODEC
protected boolean planted
protected boolean fertilized
protected boolean externalWater
protected Instant wateredUntil
protected Instant decayTime
