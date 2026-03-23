# HarvestCropInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class HarvestCropInteraction extends SimpleBlockInteraction

Harvests resources from a farmable block by delegating to FarmingUtil.harvest. Optionally requires the held item to not be broken (`RequireNotBroken`). Resolves the block type and rotation from the world chunk, then calls the utility harvest method.

Also in this package: ChangeFarmingStageInteraction, FertilizeSoilInteraction, UseCaptureCrateInteraction, UseCoopInteraction, UseWateringCanInteraction

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)
  public String toString()

Fields:
public static final BuilderCodec<HarvestCropInteraction> CODEC
protected boolean requireNotBroken
