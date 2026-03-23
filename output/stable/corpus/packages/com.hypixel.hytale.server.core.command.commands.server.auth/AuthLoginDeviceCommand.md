# AuthLoginDeviceCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.server.auth | Extends: CommandBase

public class AuthLoginDeviceCommand extends CommandBase

Server command implementation.

## Methods

- super("device", "server.commands.auth.login.device.desc")
- @Override protected void executeSync(@Nonnull CommandContext context)
- @Override public void onFlowInfo(String userCode, String verificationUri, String verificationUriComplete, int expiresIn)
