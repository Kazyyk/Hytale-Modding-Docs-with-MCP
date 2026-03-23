# ChainingInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.client | Extends: Interaction

public class ChainingInteraction extends Interaction

Runs one of several interactions in `Next` based on how many times this interaction has been invoked within the `ChainingAllowance` time window. Tracks chain state per-entity via the `ChainingInteraction.Data` ECS component. Supports named chain IDs via `ChainId` and additional flag-based branching via `Flags`. Requires client-side synchronization.

## Codec

`ChainingInteraction.CODEC` -- `BuilderCodec<ChainingInteraction>` for JSON deserialization from interaction asset files.

## Related Types

- Parent hierarchy types are in package `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

Also in this package: AddItemInteraction, AngledWielding, ApplyForceInteraction, BlockConditionInteraction, BlockIdMatcher, BlockMatcher, BreakBlockInteraction, ChainingTag, ChangeBlockInteraction, ChangeStateInteraction, ChargingInteraction, ChargingTag, CooldownConditionInteraction, CostType, CycleBlockGroupInteraction, Data, DestroyBlockInteraction, ExplodeInteraction, FirstClickInteraction, Force (and 13 more)

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
public static final BuilderCodec<ChainingInteraction> CODEC
protected String chainId
protected float chainingAllowance
protected String[] next
protected Map<String,String> flags
protected Object2IntMap<String> flagIndex
private String[] sortedFlagKeys
