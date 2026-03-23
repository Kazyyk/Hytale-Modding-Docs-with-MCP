# ApplyForceInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public class ApplyForceInteraction extends SimpleInteraction

Applies one or more forces to the interacting entity with configurable direction, magnitude, and velocity change type (Set or Add). Supports waiting for ground contact, entity collision, or a timer before branching to different follow-up interactions (`GroundNext`, `CollisionNext`, or the default `Next`). Forces can be adjusted by the player's vertical look angle with optional clamping. Includes configurable raycast distance and mode for collision detection, ground/collision check delays, and velocity configuration. Requires client-side synchronization.

## Codec

`ApplyForceInteraction.CODEC` -- `BuilderCodec<ApplyForceInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public void compile(OperationsBuilder builder)
  private static void resolve(OperationsBuilder builder, String id, Label label, Label endLabel)
  public boolean needsRemoteSync()
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<ApplyForceInteraction> CODEC
private static final int LABEL_COUNT
private static final int NEXT_LABEL_INDEX
private static final int GROUND_LABEL_INDEX
private static final int COLLISION_LABEL_INDEX
private static final float SPATIAL_STRUCTURE_RADIUS
private ChangeVelocityType changeVelocityType
private ApplyForceInteraction.Force[] forces
private float duration
private boolean waitForGround
private boolean waitForCollision
private float groundCheckDelay
private float collisionCheckDelay
private float raycastDistance
private float raycastHeightOffset
private RaycastMode raycastMode
private VelocityConfig velocityConfig
private FloatRange verticalClamp
private String groundInteraction
private String collisionInteraction
