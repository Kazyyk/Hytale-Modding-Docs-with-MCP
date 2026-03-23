# WhitelistEnableCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.commands | Extends: CommandBase

public class WhitelistEnableCommand extends CommandBase

## Fields

- @Nonnull private static final Message MESSAGE_MODULES_WHITELIST_ALREADY_ENABLED
- @Nonnull private static final Message MESSAGE_MODULES_WHITELIST_ENABLED
- @Nonnull private final HytaleWhitelistProvider whitelistProvider

## Constructors

- public WhitelistEnableCommand(@Nonnull HytaleWhitelistProvider whitelistProvider)

## Methods

- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: BanCommand, UnbanCommand, WhitelistAddCommand, WhitelistClearCommand, WhitelistCommand, WhitelistDisableCommand, WhitelistListCommand, WhitelistRemoveCommand, WhitelistStatusCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_MODULES_WHITELIST_ALREADY_ENABLED
private static final Message MESSAGE_MODULES_WHITELIST_ENABLED
private final HytaleWhitelistProvider whitelistProvider
