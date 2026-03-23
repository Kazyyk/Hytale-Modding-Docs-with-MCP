# AuthSelectCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.server.auth | Extends: CommandBase

public class AuthSelectCommand extends CommandBase

Server command implementation.

## Methods

- super("select", "server.commands.auth.select.desc")
- @Override protected void executeSync(@Nonnull CommandContext context)
- sendProfileList(context, profiles)
- static void sendProfileList(@Nonnull CommandContext context, @Nonnull SessionServiceClient.GameProfile[] profiles)
- SelectProfileVariant()
- super("server.commands.auth.select.variant.desc")

Also in this package: AuthCancelCommand, AuthCommand, AuthFlow, AuthFlow, AuthLoginBrowserCommand, AuthLoginCommand, AuthLoginDeviceCommand, AuthLogoutCommand, AuthPersistenceCommand, AuthStatusCommand, SelectProfileVariant, SetPersistenceVariant

Complete API:
  protected void executeSync(CommandContext context)
  static void sendProfileList(CommandContext context, SessionServiceClient.GameProfile[] profiles)

Fields:
private static final Message MESSAGE_NO_PENDING
private static final Message MESSAGE_SUCCESS
private static final Message MESSAGE_FAILED
private static final Message MESSAGE_AVAILABLE_PROFILES
private static final Message MESSAGE_USAGE
