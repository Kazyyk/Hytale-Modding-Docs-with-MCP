# StashCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility | Extends: AbstractPlayerCommand

public class StashCommand extends AbstractPlayerCommand

## Fields

- private static final int DISTANCE_MAX

## Methods

- public StashCommand()
- protected void execute( @Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world )
- private ItemContainerState getItemContainerState( @Nonnull Ref<EntityStore> ref, @Nonnull World world, @Nonnull CommandContext context, @Nonnull ComponentAccessor<EntityStore> componentAccessor )

Also in this package: BackupCommand, ConvertPrefabsCommand, EventTitleCommand, NotifyCommand, UIGalleryCommand, ValidateCPBCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private ItemContainerState getItemContainerState(Ref<EntityStore> ref, World world, CommandContext context, ComponentAccessor<EntityStore> componentAccessor)

Fields:
private static final Message MESSAGE_COMMANDS_STASH_DROP_LIST_SET
private static final Message MESSAGE_COMMANDS_STASH_NO_DROP_LIST
private static final Message MESSAGE_GENERAL_BLOCK_TARGET_NOT_IN_RANGE
private static final int DISTANCE_MAX
private final OptionalArg<String> setArg
