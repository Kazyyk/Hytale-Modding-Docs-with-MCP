# ChangeFarmingStageInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class ChangeFarmingStageInteraction extends SimpleBlockInteraction

Block interaction that advances a farming block to its next growth stage. Validates the target block has farming data and a valid next stage, then applies the stage transition via `FarmingStageData.apply()`.

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
