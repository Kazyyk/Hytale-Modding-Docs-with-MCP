# UseWateringCanInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.farming.interactions | Extends: SimpleBlockInteraction

public class UseWateringCanInteraction extends SimpleBlockInteraction

Block interaction for using a watering can on farmland. Applies water to the targeted soil block to boost crop growth.

Also in this package: ChangeFarmingStageInteraction, FertilizeSoilInteraction, HarvestCropInteraction, UseCaptureCrateInteraction, UseCoopInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<UseWateringCanInteraction> CODEC
protected long duration
protected String[] refreshModifiers
