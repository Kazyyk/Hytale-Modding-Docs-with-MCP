# BenchState

Type: class | Package: com.hypixel.hytale.builtin.crafting.state | Extends: BlockState | Implements: DestroyableBlockState

public class BenchState extends BlockState implements DestroyableBlockState

Block state that stores per-block-position data in the world.

## Fields

- @Nonnull public static BuilderCodec<BenchState> CODEC
- private int tierLevel
- protected ItemStack[] upgradeItems
- protected Bench bench

## Methods

- public int getTierLevel()
- @Override public boolean initialize(@Nonnull BlockType blockType)
- public void addUpgradeItems(@Nonnull List<ItemStack> consumed)
- private void dropUpgradeItems()
- public Bench getBench()
- public void setTierLevel(int newTierLevel)
- public BenchUpgradeRequirement getNextLevelUpgradeMaterials()
- protected void onTierLevelChange()
- @Nonnull public BlockType getBaseBlockType()
- @Nonnull public String getTierStateName()
- @Override public void onDestroy()
- @Nonnull public Map<UUID, BenchWindow> getWindows()

Known subclasses: ProcessingBenchState

Also in this package: ProcessingBenchState

Complete API:
  public int getTierLevel()
  public boolean initialize(BlockType blockType)
  public void addUpgradeItems(List<ItemStack> consumed)
  private void dropUpgradeItems()
  public Bench getBench()
  public void setTierLevel(int newTierLevel)
  public BenchUpgradeRequirement getNextLevelUpgradeMaterials()
  protected void onTierLevelChange()
  public BlockType getBaseBlockType()
  public String getTierStateName()
  public void onDestroy()
  public Map<UUID,BenchWindow> getWindows()

Fields:
public static BuilderCodec<BenchState> CODEC
private int tierLevel
protected ItemStack[] upgradeItems
protected Bench bench
protected final Map<UUID,BenchWindow> windows
