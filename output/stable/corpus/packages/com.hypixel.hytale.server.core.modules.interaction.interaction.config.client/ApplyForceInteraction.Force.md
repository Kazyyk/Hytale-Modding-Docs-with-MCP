# ApplyForceInteraction.Force

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Implements: NetworkSerializable<AppliedForce>

public static class ApplyForceInteraction.Force implements NetworkSerializable<AppliedForce>

Configures a single force vector with direction, magnitude, and optional vertical adjustment based on the player's look angle. Direction is normalized during decoding.

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  public AppliedForce toPacket()

Fields:
public static final BuilderCodec<ApplyForceInteraction.Force> CODEC
private Vector3d direction
private boolean adjustVertical
private double force
