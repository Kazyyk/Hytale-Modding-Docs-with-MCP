# ChangeFarmingStageInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class ChangeFarmingStageInteraction extends SimpleBlockInteraction

Changes the farming stage of a target block. Supports absolute stage index (`Stage`), relative increase (`Increase`), and relative decrease (`Decrease`) modes. Can optionally switch to a different stage set (`StageSet`). Creates a new `FarmingBlock` component if one does not exist on the target block entity.

Also in this package: FertilizeSoilInteraction, HarvestCropInteraction, UseCaptureCrateInteraction, UseCoopInteraction, UseWateringCanInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  public String toString()

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<ChangeFarmingStageInteraction> CODEC
protected int targetStage
protected Integer increaseBy
protected Integer decreaseBy
protected String targetStageSet
