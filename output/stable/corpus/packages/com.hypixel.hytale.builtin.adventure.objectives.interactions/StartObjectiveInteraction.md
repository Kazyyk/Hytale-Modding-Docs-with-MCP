# StartObjectiveInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.interactions | Extends: SimpleInstantInteraction

public class StartObjectiveInteraction extends SimpleInstantInteraction

Interaction handler extending `SimpleInstantInteraction`.

## Fields

- objectiveTypeSetup | ObjectiveTypeSetup | ObjectiveTypeSetup field.

## Methods

- firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.
- startObjective(@Nonnull PlayerRef player, @Nonnull InteractionContext context, @Nonnull ItemStack itemStack, @Nonnull Store<EntityStore> store) | void | private method.
- toString() | String | public method.

Also in this package: CanBreakRespawnPointInteraction

Complete API:
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private void startObjective(PlayerRef player, InteractionContext context, ItemStack itemStack, Store<EntityStore> store)
  public String toString()

Fields:
public static final BuilderCodec<StartObjectiveInteraction> CODEC
public static final KeyedCodec<UUID> OBJECTIVE_UUID
protected ObjectiveTypeSetup objectiveTypeSetup
