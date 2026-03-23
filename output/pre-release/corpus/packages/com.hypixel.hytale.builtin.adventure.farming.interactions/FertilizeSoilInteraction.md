# FertilizeSoilInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class FertilizeSoilInteraction extends SimpleBlockInteraction

Block interaction that fertilizes soil at a target position. Applies a fertilizer growth modifier to the farming block's growth rate.

Also in this package: ChangeFarmingStageInteraction, HarvestCropInteraction, UseCaptureCrateInteraction, UseCoopInteraction, UseWateringCanInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<FertilizeSoilInteraction> CODEC
protected String[] refreshModifiers
