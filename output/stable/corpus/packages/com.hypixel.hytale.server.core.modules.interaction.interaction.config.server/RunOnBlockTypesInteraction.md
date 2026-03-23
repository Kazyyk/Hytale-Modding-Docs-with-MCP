# RunOnBlockTypesInteraction

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.interaction.config.server | Extends: com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInteraction

public class RunOnBlockTypesInteraction extends SimpleInteraction

Searches for matching block types within a spherical radius around the entity and runs a configured interaction chain on each found block, up to a maximum count. Uses reservoir sampling to select blocks when more matches are found than the maximum allows. Waits for all forked interaction chains to complete, succeeding if any chain succeeded.

## Codec Properties

- Range | int | Yes (inherited) | -- | The spherical radius to search for matching block types. Must be > 0.
- BlockSets | String[] | Yes (inherited) | [] | Array of BlockSet IDs to match within the search radius.
- MaxCount | int | Yes (inherited) | -- | Maximum number of block positions to select. Must be > 0. Uses reservoir sampling when more matches exist.
- Interactions | String` (root interaction ref) | Yes (inherited) | null | The interaction chain to run on each found block. Can be defined inline or as a reference.

## Constants

- String[] EMPTY_BLOCKSETS

## Methods


@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()

Returns `WaitForDataFrom.Server`.


@Override
protected void tick0(boolean firstRun, float time, @Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)

On first run: searches for blocks, forks interaction chains for each selected position. On subsequent ticks: polls forked chains for completion, succeeds if any finished, fails if all failed.


@Override
public void compile(@Nonnull OperationsBuilder builder)

Compiles with optional next/failed labels.


@Override
public boolean needsRemoteSync()

Returns `true`.


@Nonnull
@Override
protected com.hypixel.hytale.protocol.Interaction generatePacket()

Returns a new `com.hypixel.hytale.protocol.SimpleInteraction` packet.


@Nonnull
@Override
public String toString()

## See Also

- `BlockSetModule` -- resolves block set IDs to block ID sets
- `InteractionChain` -- represents a forked interaction chain

Also in this package: AngledDamage, BlockCustomPageSupplier, BlockEntityCustomPageSupplier, BlockSearchConsumer, ChangeStatBaseInteraction, ChangeStatInteraction, ChangeStatWithModifierInteraction, CheckUniqueItemUsageInteraction, ClearEntityEffectInteraction, CustomPageSupplier, DamageEntityInteraction, DestroyConditionInteraction, DoorInfo, DoorInteraction, DoorState, EntityStatOnHit, EquipItemInteraction, IncreaseBackpackCapacityInteraction, InterruptInteraction, LaunchPadInteraction (and 13 more)

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void tick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected void simulateTick0(boolean firstRun, float time, InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  public void compile(OperationsBuilder builder)
  private List<Vector3i> searchBlocks(World world, Vector3d position)
  private IntList getBlockIds()
  public boolean needsRemoteSync()
  protected com.hypixel.hytale.protocol.Interaction generatePacket()
  protected void configurePacket(com.hypixel.hytale.protocol.Interaction packet)
  public String toString()

Fields:
public static final BuilderCodec<RunOnBlockTypesInteraction> CODEC
private static final MetaKey<List<InteractionChain>> FORKED_CHAINS
private static final MetaKey<Boolean> ANY_SUCCEEDED
public static final String[] EMPTY_BLOCKSETS
protected int range
protected String[] blockSets
protected int maxCount
protected String interactions
