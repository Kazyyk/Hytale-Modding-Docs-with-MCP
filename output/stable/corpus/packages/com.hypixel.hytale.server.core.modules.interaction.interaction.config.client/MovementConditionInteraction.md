# MovementConditionInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: SimpleInteraction

public class MovementConditionInteraction extends SimpleInteraction

Branches to different interactions based on the player's current movement direction. Supports all eight directions (Forward, Back, Left, Right, ForwardLeft, ForwardRight, BackLeft, BackRight) plus a None/failed branch. Each direction maps to a separately configured interaction. Requires client-side synchronization.

## Codec

`MovementConditionInteraction.CODEC` -- `BuilderCodec<MovementConditionInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction (and 13 more)

Complete API:
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public WaitForDataFrom getWaitForDataFrom()
  public boolean needsRemoteSync()
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public void compile(OperationsBuilder builder)
  private static void resolve(OperationsBuilder builder, String id, Label label, Label endLabel)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)

Fields:
public static final BuilderCodec<MovementConditionInteraction> CODEC
private static final int FAILED_LABEL_INDEX
private static final int FORWARD_LABEL_INDEX
private static final int BACK_LABEL_INDEX
private static final int LEFT_LABEL_INDEX
private static final int RIGHT_LABEL_INDEX
private static final int FORWARD_LEFT_LABEL_INDEX
private static final int FORWARD_RIGHT_LABEL_INDEX
private static final int BACK_LEFT_LABEL_INDEX
private static final int BACK_RIGHT_LABEL_INDEX
private String forward
private String back
private String left
private String right
private String forwardLeft
private String forwardRight
private String backLeft
private String backRight
