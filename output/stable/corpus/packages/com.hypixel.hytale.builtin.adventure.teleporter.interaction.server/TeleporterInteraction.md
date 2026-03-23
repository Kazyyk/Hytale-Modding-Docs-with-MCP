# TeleporterInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.teleporter.interaction.server | Extends: SimpleBlockInteraction

public class TeleporterInteraction extends SimpleBlockInteraction

Interaction handler extending `SimpleBlockInteraction`.

## Fields

- particle | String | String field.
- clearoutXZ | double | double field.
- clearoutY | double | double field.

## Methods

- getWaitForDataFrom() | WaitForDataFrom | public method.

Also in this package: UsedTeleporter

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void interactWithBlock(World world, CommandBuffer<EntityStore> commandBuffer, InteractionType type, InteractionContext context, ItemStack itemInHand, Vector3i targetBlock, CooldownHandler cooldownHandler)
  private boolean interact(World world, CommandBuffer<EntityStore> commandBuffer, InteractionContext context, Vector3i targetBlock)
  protected void simulateInteractWithBlock(InteractionType type, InteractionContext context, ItemStack itemInHand, World world, Vector3i targetBlock)

Fields:
public static final BuilderCodec<TeleporterInteraction> CODEC
private String particle
private double clearoutXZ
private double clearoutY
