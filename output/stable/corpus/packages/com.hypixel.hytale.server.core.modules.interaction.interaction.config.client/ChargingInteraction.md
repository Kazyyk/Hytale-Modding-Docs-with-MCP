# ChargingInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: Interaction

public class ChargingInteraction extends Interaction

A hold-and-release interaction that executes different follow-up interactions based on how long the input was held. The `Next` map associates charge durations (in seconds) with interaction IDs. Supports indefinite hold via `AllowIndefiniteHold`, a failed branch, mouse sensitivity adjustment during charge, damage-based cancellation (`FailOnDamage`), fork interactions that can run concurrently while charging, and configurable charge delay on incoming damage. Requires client-side synchronization.

## Codec

`ChargingInteraction.CODEC` -- `BuilderCodec<ChargingInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Known subclasses: WieldingInteraction, WieldingInteraction

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private void jumpToChargeValue(InteractionContext context, float chargeValue)
  public void compile(OperationsBuilder builder)
  public boolean walk(Collector collector, InteractionContext context)
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public boolean needsRemoteSync()
  public String toString()

Fields:
public static final BuilderCodec<ChargingDelay> DELAY_CODEC
public static final BuilderCodec<ChargingInteraction> ABSTRACT_CODEC
public static final BuilderCodec<ChargingInteraction> CODEC
private static final MetaKey<Object2IntMap<InteractionType>> FORK_COUNTS
private static final MetaKey<InteractionChain> FORKED_CHAIN
private static final float CHARGING_HELD
private static final float CHARGING_CANCELED
private static final StringTag TAG_FAILED
protected boolean allowIndefiniteHold
protected boolean displayProgress
protected boolean cancelOnOtherClick
protected boolean failOnDamage
protected float mouseSensitivityAdjustmentTarget
protected float mouseSensitivityAdjustmentDuration
protected String failed
protected Float2ObjectMap<String> next
protected float[] sortedKeys
protected Map<InteractionType,String> forks
protected ChargingDelay chargingDelay
protected float highestChargeValue
