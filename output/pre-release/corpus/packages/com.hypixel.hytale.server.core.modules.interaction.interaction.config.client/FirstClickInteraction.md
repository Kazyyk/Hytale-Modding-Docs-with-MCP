# FirstClickInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: Interaction

public class FirstClickInteraction extends Interaction

Routes to different interactions based on whether the input was a single click or a held press. The `Click` branch runs when the input was released quickly; the `Held` branch runs when the input is being held down. Determined client-side via `IInteractionSimulationHandler.isCharging()`. Requires client-side synchronization.

## Codec

`FirstClickInteraction.CODEC` -- `BuilderCodec<FirstClickInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, Force (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public void compile(OperationsBuilder builder)
  public boolean walk(Collector collector, InteractionContext context)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public boolean needsRemoteSync()
  public String toString()

Fields:
public static final BuilderCodec<FirstClickInteraction> CODEC
public static final StringTag TAG_CLICK
public static final StringTag TAG_HELD
private static final int HELD_LABEL_INDEX
protected String click
protected String held
