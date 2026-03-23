# AuthLoginBrowserCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.server.auth | Extends: CommandBase

public class AuthLoginBrowserCommand extends CommandBase

Server command implementation.

## Methods

- super("browser", "server.commands.auth.login.browser.desc")
- @Override protected void executeSync(@Nonnull CommandContext context)
- sendPersistenceFeedback(context)
- static void sendPersistenceFeedback(@Nonnull CommandContext context)
- @Override public void onFlowInfo(String authUrl)

Also in this package: AuthCancelCommand, AuthCommand, AuthFlow, AuthFlow, AuthLoginCommand, AuthLoginDeviceCommand, AuthLogoutCommand, AuthPersistenceCommand, AuthSelectCommand, AuthStatusCommand, SelectProfileVariant, SetPersistenceVariant

Complete API:
  protected void executeSync(CommandContext context)
  static void sendPersistenceFeedback(CommandContext context)

Fields:
private static final Message MESSAGE_SINGLEPLAYER
private static final Message MESSAGE_ALREADY_AUTHENTICATED
private static final Message MESSAGE_STARTING
private static final Message MESSAGE_SUCCESS
private static final Message MESSAGE_FAILED
private static final Message MESSAGE_PENDING
