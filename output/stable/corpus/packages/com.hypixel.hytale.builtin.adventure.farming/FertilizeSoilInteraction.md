# FertilizeSoilInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class FertilizeSoilInteraction extends SimpleBlockInteraction

Sets the fertilized flag on a TilledSoilBlock component. If the target block is a crop (has FarmingBlock), looks one block below for the soil instead. Enables ticking on both the soil and crop positions after fertilizing.

Also in this package: ChangeFarmingStageInteraction, HarvestCropInteraction, UseCaptureCrateInteraction, UseCoopInteraction, UseWateringCanInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<FertilizeSoilInteraction> CODEC
protected String[] refreshModifiers
