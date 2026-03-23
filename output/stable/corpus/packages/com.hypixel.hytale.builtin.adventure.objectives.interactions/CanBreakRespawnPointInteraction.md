# CanBreakRespawnPointInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.interactions | Extends: SimpleBlockInteraction

public class CanBreakRespawnPointInteraction extends SimpleBlockInteraction

Interaction handler extending `SimpleBlockInteraction`.

## Methods

- getWaitForDataFrom() | WaitForDataFrom | public method.

Also in this package: StartObjectiveInteraction

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<CanBreakRespawnPointInteraction> CODEC
