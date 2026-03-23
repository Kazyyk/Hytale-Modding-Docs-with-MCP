# UseCaptureCrateInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class UseCaptureCrateInteraction extends SimpleBlockInteraction

Dual-purpose interaction for capture crates. When used on an NPC entity (tick0), captures the NPC into the held item's metadata as `CapturedNPCMetadata`. When used on a block (interactWithBlock), either places the captured NPC into a CoopBlock or releases it into the world. Validates NPC groups against `acceptedNpcGroupIds`.

Also in this package: ChangeFarmingStageInteraction, FertilizeSoilInteraction, HarvestCropInteraction, UseCoopInteraction, UseWateringCanInteraction

Complete API:
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<UseCaptureCrateInteraction> CODEC
protected String[] acceptedNpcGroupIds
protected int[] acceptedNpcGroupIndexes
protected String fullIcon
