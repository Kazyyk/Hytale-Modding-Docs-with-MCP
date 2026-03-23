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
