# EntityTrackerCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.world.entity | Extends: AbstractWorldCommand

public class EntityTrackerCommand extends AbstractWorldCommand

## Methods

- public EntityTrackerCommand()
- protected void execute(@Nonnull CommandContext context, @Nonnull World world, @Nonnull Store<EntityStore> store)

Also in this package: Default, EntityCleanCommand, EntityCloneCommand, EntityCommand, EntityCountCommand, EntityDumpCommand, EntityEffectCommand, EntityHideFromAdventurePlayersCommand, EntityIntangibleCommand, EntityInvulnerableCommand, EntityLodCommand, EntityMakeInteractableCommand, EntityNameplateCommand, EntityRemoveCommand, EntityResendCommand, Remove

Complete API:
  protected void execute(CommandContext context, World world, Store<EntityStore> store)

Fields:
private static final Message MESSAGE_COMMANDS_ERRORS_PLAYER_NOT_IN_WORLD
private static final Message MESSAGE_COMMANDS_ENTITY_TRACKER_NO_VIEWER_COMPONENT
private final RequiredArg<PlayerRef> playerArg
