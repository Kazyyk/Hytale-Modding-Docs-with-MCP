# EntityRemoveCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity | Extends: AbstractWorldCommand

public class EntityRemoveCommand extends AbstractWorldCommand

## Methods

- public EntityRemoveCommand()
- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)
- public static void removeEntity( @Nullable Ref<EntityStore> playerRef, @Nonnull Ref<EntityStore> entityReference, @Nonnull ComponentAccessor<EntityStore> componentAccessor )

Also in this package: Default, EntityCleanCommand, EntityCloneCommand, EntityCommand, EntityCountCommand, EntityDumpCommand, EntityEffectCommand, EntityHideFromAdventurePlayersCommand, EntityIntangibleCommand, EntityInvulnerableCommand, EntityLodCommand, EntityMakeInteractableCommand, EntityNameplateCommand, EntityResendCommand, EntityTrackerCommand, Remove

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)
  public static void removeEntity(Ref<EntityStore> playerRef, Ref<EntityStore> entityReference, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final Message MESSAGE_GENERAL_NO_ENTITY_IN_VIEW
private final EntityWrappedArg entityArg
private final FlagArg othersFlag
