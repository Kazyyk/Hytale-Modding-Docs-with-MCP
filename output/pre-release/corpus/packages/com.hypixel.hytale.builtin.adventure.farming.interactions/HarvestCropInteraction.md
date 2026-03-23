# HarvestCropInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class HarvestCropInteraction extends SimpleBlockInteraction

Block interaction that harvests a fully-grown crop. Drops harvest items and resets the farming block to its initial stage.

Also in this package: ChangeFarmingStageInteraction, FertilizeSoilInteraction, UseCaptureCrateInteraction, UseCoopInteraction, UseWateringCanInteraction

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  public String toString()

Fields:
public static final BuilderCodec<HarvestCropInteraction> CODEC
protected boolean requireNotBroken
