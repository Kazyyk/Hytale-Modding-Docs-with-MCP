# AbstractTargetEntityCommand

Type: class | Package: com.hypixel.hytale.server.core.command.system.basecommands | Extends: AbstractAsyncCommand

public abstract class AbstractTargetEntityCommand extends AbstractAsyncCommand

Abstract base class extending `AbstractAsyncCommand` that provides shared logic for TargetEntityCommand subclasses.

## Constants

- private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
- private static final Message MESSAGE_GENERAL_NO_ENTITY_IN_VIEW

## Fields

- @Nonnull private final OptionalArg<World> worldArg
- @Nonnull private final OptionalArg<PlayerRef> playerArg
- @Nonnull private final EntityWrappedArg entityArg

## Methods

- public AbstractTargetEntityCommand(@Nonnull String name, @Nonnull String description)
- public AbstractTargetEntityCommand(@Nonnull String name, @Nonnull String description, boolean requiresConfirmation)
- public AbstractTargetEntityCommand(@Nonnull String description)
- @Nonnull @Override protected final CompletableFuture<Void> executeAsync(@Nonnull CommandContext context)
- protected abstract void execute(@Nonnull CommandContext var1, @Nonnull ObjectList<Ref<EntityStore>> var2, @Nonnull World var3, @Nonnull Store<EntityStore> var4)

Known subclasses: EntityEffectCommand, EntityHideFromAdventurePlayersCommand, EntityIntangibleCommand, EntityInvulnerableCommand, EntityMakeInteractableCommand, EntityStatsAddCommand, EntityStatsDumpCommand, EntityStatsGetCommand, EntityStatsResetCommand, EntityStatsSetCommand, EntityStatsSetToMaxCommand, ManualTrigger

Also in this package: AbstractAsyncCommand, AbstractAsyncPlayerCommand, AbstractAsyncWorldCommand, AbstractCommandCollection, AbstractPlayerCommand, AbstractTargetPlayerCommand, AbstractWorldCommand, CommandBase

Complete API:
  protected final CompletableFuture<Void> executeAsync(CommandContext context)
  protected abstract void execute(CommandContext var1, ObjectList<Ref<EntityStore>> var2, World var3, Store<EntityStore> var4)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private static final Message MESSAGE_GENERAL_NO_ENTITY_IN_VIEW
private final OptionalArg<World> worldArg
private final OptionalArg<Double> radiusArg
private final OptionalArg<PlayerRef> playerArg
private final EntityWrappedArg entityArg
