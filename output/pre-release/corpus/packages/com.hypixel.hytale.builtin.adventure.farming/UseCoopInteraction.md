# UseCoopInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class UseCoopInteraction extends SimpleBlockInteraction

Collects produce from a CoopBlock. Transfers all items from the coop's internal storage to the player's inventory and updates the block's interaction state between `Produce_Ready` and `default`.

Also in this package: ChangeFarmingStageInteraction, FertilizeSoilInteraction, HarvestCropInteraction, UseCaptureCrateInteraction, UseWateringCanInteraction

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<UseCoopInteraction> CODEC
