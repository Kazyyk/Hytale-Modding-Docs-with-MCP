# CommandSender

Type: interface | Package: com.hypixel.hytale.server.core.command.system | Implements: com.hypixel.hytale.server.core.receiver.IMessageReceiver, com.hypixel.hytale.server.core.permissions.PermissionHolder

public interface CommandSender

Interface combining `IMessageReceiver` and `PermissionHolder`. Adds `getDisplayName()` and `getUuid()` for identifying the entity executing a command.
