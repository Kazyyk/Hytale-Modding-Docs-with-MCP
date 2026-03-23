# OpSelfCommand

Type: class | Package: com.hypixel.hytale.server.core.permissions.commands.op | Extends: AbstractPlayerCommand

public class OpSelfCommand extends AbstractPlayerCommand

## Fields

- private static final Message MESSAGE_COMMANDS_OP_ADDED
- private static final Message MESSAGE_COMMANDS_OP_REMOVED
- private static final Message MESSAGE_COMMANDS_NON_VANILLA_PERMISSIONS
- private static final Message MESSAGE_COMMANDS_SINGLEPLAYER_OWNER_REQ
- private static final Message MESSAGE_COMMANDS_CURRENTLY_OP

## Methods

- @Override protected boolean canGeneratePermission()
- @Override protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Also in this package: OpAddCommand, OpCommand, OpRemoveCommand

Complete API:
  protected boolean canGeneratePermission()
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_OP_ADDED
private static final Message MESSAGE_COMMANDS_OP_REMOVED
private static final Message MESSAGE_COMMANDS_NON_VANILLA_PERMISSIONS
private static final Message MESSAGE_COMMANDS_SINGLEPLAYER_OWNER_REQ
private static final Message MESSAGE_COMMANDS_CURRENTLY_OP
