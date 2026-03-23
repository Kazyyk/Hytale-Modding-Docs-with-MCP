# WhitelistDisableCommand

Type: class | Package: com.hypixel.hytale.server.core.modules.accesscontrol.commands | Extends: CommandBase

public class WhitelistDisableCommand extends CommandBase

## Fields

- @Nonnull private static final Message MESSAGE_MODULES_WHITELIST_DISABLED
- @Nonnull private static final Message MESSAGE_MODULES_WHITELIST_ALREADY_DISABLED
- @Nonnull private final HytaleWhitelistProvider whitelistProvider

## Constructors

- public WhitelistDisableCommand(@Nonnull HytaleWhitelistProvider whitelistProvider)

## Methods

- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: BanCommand, UnbanCommand, WhitelistAddCommand, WhitelistClearCommand, WhitelistCommand, WhitelistEnableCommand, WhitelistListCommand, WhitelistRemoveCommand, WhitelistStatusCommand

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_MODULES_WHITELIST_DISABLED
private static final Message MESSAGE_MODULES_WHITELIST_ALREADY_DISABLED
private final HytaleWhitelistProvider whitelistProvider
