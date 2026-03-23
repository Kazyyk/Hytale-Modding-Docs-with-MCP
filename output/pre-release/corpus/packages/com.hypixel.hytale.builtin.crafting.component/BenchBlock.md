# BenchBlock

Type: class | Package: com.hypixel.hytale.builtin.crafting.component | Implements: Component

public class BenchBlock implements Component

Block component representing a crafting bench with tier level and stored upgrade items. Tracks open `BenchWindow` instances per player UUID. Provides the base block type resolution for state-based bench blocks.

Also in this package: BenchUpgradingJob, ChestLookupResult, CraftingJob, CraftingManager, InputRemovalType, ProcessingBenchBlock

Complete API:
  public static ComponentType<ChunkStore,BenchBlock> getComponentType()
  public void addUpgradeItems(List<ItemStack> consumed)
  public void setTierLevel(int newTierLevel)
  public int getTierLevel()
  public ItemStack[] getUpgradeItems()
  public void setUpgradeItems(ItemStack[] upgradeItems)
  public String getTierStateName()
  public Map<UUID,BenchWindow> getWindows()
  public Component<ChunkStore> clone()
  public static BlockType getBaseBlockType(BlockType currentBlockType)

Fields:
public static BuilderCodec<BenchBlock> CODEC
private int tierLevel
protected ItemStack[] upgradeItems
protected final transient Map<UUID,BenchWindow> windows
