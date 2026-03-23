# AuthLoginDeviceCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.server.auth | Extends: CommandBase

public class AuthLoginDeviceCommand extends CommandBase

Server command implementation.

## Methods

- super("device", "server.commands.auth.login.device.desc")
- @Override protected void executeSync(@Nonnull CommandContext context)
- @Override public void onFlowInfo(String userCode, String verificationUri, String verificationUriComplete, int expiresIn)

Also in this package: AuthCancelCommand, AuthCommand, AuthFlow, AuthFlow, AuthLoginBrowserCommand, AuthLoginCommand, AuthLogoutCommand, AuthPersistenceCommand, AuthSelectCommand, AuthStatusCommand, SelectProfileVariant, SetPersistenceVariant

Complete API:
  protected void executeSync(CommandContext context)

Fields:
private static final Message MESSAGE_SINGLEPLAYER
private static final Message MESSAGE_ALREADY_AUTHENTICATED
private static final Message MESSAGE_STARTING
private static final Message MESSAGE_SUCCESS
private static final Message MESSAGE_FAILED
private static final Message MESSAGE_PENDING
