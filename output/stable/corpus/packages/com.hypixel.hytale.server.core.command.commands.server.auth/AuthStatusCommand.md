# AuthStatusCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.server.auth | Extends: CommandBase

public class AuthStatusCommand extends CommandBase

Server command implementation.

## Methods

- super("status", "server.commands.auth.status.desc")
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: AuthCancelCommand, AuthCommand, AuthFlow, AuthFlow, AuthLoginBrowserCommand, AuthLoginCommand, AuthLoginDeviceCommand, AuthLogoutCommand, AuthPersistenceCommand, AuthSelectCommand, SelectProfileVariant, SetPersistenceVariant

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_STATUS_CONNECTION_MODE_AUTHENTICATED
private static final Message MESSAGE_STATUS_CONNECTION_MODE_OFFLINE
private static final Message MESSAGE_STATUS_CONNECTION_MODE_INSECURE
private static final Message MESSAGE_STATUS_MODE_NONE
private static final Message MESSAGE_STATUS_MODE_SINGLEPLAYER
private static final Message MESSAGE_STATUS_MODE_EXTERNAL
private static final Message MESSAGE_STATUS_MODE_OAUTH_BROWSER
private static final Message MESSAGE_STATUS_MODE_OAUTH_DEVICE
private static final Message MESSAGE_STATUS_MODE_OAUTH_STORE
private static final Message MESSAGE_STATUS_TOKEN_PRESENT
private static final Message MESSAGE_STATUS_TOKEN_MISSING
private static final Message MESSAGE_STATUS_HELP
private static final Message MESSAGE_STATUS_PENDING
