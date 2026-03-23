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
