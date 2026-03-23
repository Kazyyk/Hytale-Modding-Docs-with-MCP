# UseCoopInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class UseCoopInteraction extends SimpleBlockInteraction

Block interaction for interacting with a farming coop block. Manages adding and removing coop residents.

Also in this package: ChangeFarmingStageInteraction, FertilizeSoilInteraction, HarvestCropInteraction, UseCaptureCrateInteraction, UseWateringCanInteraction

Complete API:
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<UseCoopInteraction> CODEC
