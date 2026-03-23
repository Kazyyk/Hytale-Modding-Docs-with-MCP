# AuthLogoutCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.server.auth | Extends: CommandBase

public class AuthLogoutCommand extends CommandBase

Server command implementation.

## Methods

- super("logout", "server.commands.auth.logout.desc")
- @Override protected void executeSync(@Nonnull CommandContext context)

Also in this package: AuthCancelCommand, AuthCommand, AuthFlow, AuthFlow, AuthLoginBrowserCommand, AuthLoginCommand, AuthLoginDeviceCommand, AuthPersistenceCommand, AuthSelectCommand, AuthStatusCommand, SelectProfileVariant, SetPersistenceVariant

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_SINGLEPLAYER
private static final Message MESSAGE_NOT_AUTHENTICATED
